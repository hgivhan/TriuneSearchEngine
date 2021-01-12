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
        if (effects.getBodySystem().equals(getCheckBodySystemExists(effects.getBodySystem()))
        && (effects.getActions().equals(getCheckActionExists(effects.getActions())))){
        { return null;
        }
        }
        return effectsRepository.save(effects);
    }

    public String getCheckBodySystemExists(String bodySystem){
        if(effectsRepository.findEffectsByBodySystem(bodySystem) != null){
            return bodySystem;
        }
        return "This item is not in the directory yet.";
    }

    public String getCheckActionExists(String actions){
        if(effectsRepository.findEffectsByActions(actions) != null){
            return actions;
        }
        return "This item is not in the directory yet.";
    }

    public Iterable<Effects> effectsIndex(){return effectsRepository.findAll();}

    public Effects getEffectsById(Long effectsId){
        return effectsRepository.findEffectsByEffectsId(effectsId);
    }

    public Effects getEffectsByBodySystem(String bodySystem){
        return effectsRepository.findEffectsByBodySystem(bodySystem);
    }

    public Effects getEffectsByAction(String actions){
        return effectsRepository.findEffectsByActions(actions);
    }

    public Effects updateEffects(Long id, String bodySystem, String actions){
        Effects effects1 = getEffectsById(id);
        effects1.setBodySystem(bodySystem);
        effects1.setActions(actions);

        if (effects1.getBodySystem().equals(getCheckBodySystemExists(effects1.getBodySystem()))
                && (effects1.getActions().equals(getCheckActionExists(effects1.getActions()))))
        { return null;}
        return effectsRepository.save(effects1); }

    public void deleteEffectsById(Long effectsId){
        effectsRepository.delete(getEffectsById(effectsId));
    }
}
