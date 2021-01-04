package com.example.Services;

import com.example.Models.Effects;
import com.example.Repositories.EffectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EffectsService {

    @Autowired
    EffectsRepository effectsRepository;


    public Effects addEffects(Effects effects){
        if (effects.getEffects().equals(getCheckEffectsExists(effects.getEffects())))
        { return null;
        }
        return effectsRepository.save(effects);
    }

    public String getCheckEffectsExists(String effects){
        if(effectsRepository.findByEffects(effects) != null){
            return effects;
        }
        return "This item is not in the directory yet.";
    }

    public Iterable<Effects> effectsIndex(){return effectsRepository.findAll();}

    public Effects getEffectsById(Long effectsId){
        return effectsRepository.findEffectsById(effectsId);
    }

    public Effects getByEffects(String effects){
        return effectsRepository.findByEffects(effects);
    }

    public Effects updateEffects(Long id, String effects){
        Effects effects1 = getEffectsById(id);
        effects1.setEffects(effects);

        if (effects1.getEffects().equals(getCheckEffectsExists(effects1.getEffects())))
        { return null;}
        return effectsRepository.save(effects1); }

    public void deleteEffectsById(Long effectsId){
        effectsRepository.delete(getEffectsById(effectsId));
    }

    public void deleteEffectsByName(String effects){
        effectsRepository.delete(getByEffects(effects));
    }
}
