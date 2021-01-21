package com.example.Services;

import com.example.Models.*;
import com.example.Repositories.HerbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HerbService {

    @Autowired
    private HerbRepository herbRepository;

    public Herb postAddHerb(Herb herb){
        if (herb.getLatinName().equals(getCheckHerbExists(herb.getLatinName())))
        { return null;
        }
        return herbRepository.save(herb);
    }

    public String getCheckHerbExists(String latinName){
        if(herbRepository.findHerbByLatinName(latinName) != null){
            return latinName;
        }
        return "This herb is not in the directory yet.";
    }

    public Herb getHerbById(Long id){
        return herbRepository.findHerbByHerbId(id);
    }

    public Herb getHerbByLatinName(String latinName){
        return herbRepository.findHerbByLatinName(latinName);
    }

    public Herb getHerbByCommonName(String commonName){
        return herbRepository.findHerbByCommonName(commonName);
    }

    public Herb getHerbByDosageParts(String dosageParts){
        return herbRepository.findHerbByDosage(dosageParts);
    }

    public Herb getHerbByEnergetics(String energetics){
        return herbRepository.findHerbByEnergetics(energetics);
    }

    public Herb getHerbByEffects(String effects){
        return herbRepository.findHerbByEffects(effects);
    }

    public Iterable<Herb> herbIndex(){return herbRepository.findAll();}

    public Herb putUpdateHerbById(Long id, String latinName, String commonName, List<Dosage> dosage, List<Energetics> energetics, List<Effects> effects) {
        Herb herb = getHerbById(id);
        herb.setLatinName(latinName);
        herb.setCommonName(commonName);
//        herb.setOtherNames(otherNames);
        herb.setDosage(dosage);
        herb.setEnergetics(energetics);
        herb.setEffects(effects);;

        if (herb.getLatinName().equals(getCheckHerbExists(herb.getLatinName()))) {
            return null;
        }
        return herbRepository.save(herb);
    }

    public void deleteHerbById(Long id){
        herbRepository.delete(getHerbById(id));
    }

    public void deleteHerbByLatinName(String latinName){
        herbRepository.delete(getHerbByLatinName(latinName));
    }

}
