package com.example.Services;

import com.example.Models.Herb;
import com.example.Repositories.HerbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HerbService {

    @Autowired
    private HerbRepository herbRepository;

    public HerbService(){}

    public HerbService(HerbRepository herbRepository){
        this.herbRepository = herbRepository;
    }

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
        return herbRepository.findHerbById(id);
    }

    public Herb getHerbByLatinName(String latinName){
        return herbRepository.findHerbByLatinName(latinName);
    }

    public Herb getHerbByCommonName(String commonName){
        return herbRepository.findHerbByCommonName(commonName);
    }

    public Herb getHerbByDosageParts(String dosageParts){
        return herbRepository.findHerbByDosageParts(dosageParts);
    }

    public Herb getHerbByEnergetics(String energetics){
        return herbRepository.findHerbByEnergetics(energetics);
    }

    public Herb getHerbByBodySystemsAffected(String bodySystem){
        return herbRepository.findHerbByBodySystems(bodySystem);
    }

    public Herb getHerbByActions(String actions){
        return herbRepository.findHerbByActions(actions);
    }

    public Iterable<Herb> getIndex(){return herbRepository.findAll();}

    public Herb putUpdateHerbById(Long id, String latinName, String commonName, String otherCommonNames, String dosageParts, String description, String energetics, String bodySystems, String actions) {
        Herb herb = getHerbById(id);
        herb.setLatinName(latinName);
        herb.setCommonName(commonName);
        herb.setOtherNamesId(otherCommonNames);
        herb.setDosageId(dosageParts);
        herb.setDosageId(description);
        herb.setEnergeticsId(energetics);
        herb.setBodySystems(bodySystems);
        herb.setActions(actions);

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
