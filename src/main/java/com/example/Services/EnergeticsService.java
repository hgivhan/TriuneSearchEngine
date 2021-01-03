package com.example.Services;

import com.example.Models.Energetics;
import com.example.Repositories.EnergeticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnergeticsService {

    @Autowired
    EnergeticsRepository energeticsRepository;

    public Energetics addEnergetics(Energetics energetics){
        if (energetics.getEnergetics().equals(getCheckEnergeticsExists(energetics.getEnergetics())))
        { return null;
        }
        return energeticsRepository.save(energetics);
    }

    public String getCheckEnergeticsExists(String energetics){
        if(energeticsRepository.findByEnergetics(energetics) != null){
            return energetics;
        }
        return "This item is not in the directory yet.";
    }

    public Iterable<Energetics> energeticsIndex(){return energeticsRepository.findAll();}

    public Energetics getEnergeticsById(Long energeticsId){
        return energeticsRepository.findEnergeticsById(energeticsId);
    }

    public Energetics getByEnergetics(String energetics){
        return energeticsRepository.findByEnergetics(energetics);
    }

    public Energetics updateEnergetics(Long id, String energetics){
        Energetics energetics1 = getEnergeticsById(id);
        energetics1.setEnergetics(energetics);

        if (energetics1.getEnergetics().equals(getCheckEnergeticsExists(energetics1.getEnergetics())))
        { return null;}
        return energeticsRepository.save(energetics1); }

    public void deleteEnergeticsById(Long energeticsId){
        energeticsRepository.delete(getEnergeticsById(energeticsId));
    }

    public void deleteEnergeticsByName(String energetics){
        energeticsRepository.delete(getByEnergetics(energetics));
    }
}


