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
        if (energetics.toString().equals(getCheckEnergeticsExists(energetics)))
        { return null;
        }
        return energeticsRepository.save(energetics);
    }

    public String getCheckEnergeticsExists(Energetics energetics){
        if((energeticsRepository.findEnergeticsByTemperature(energetics.getTemperature()) != null)
            && (energeticsRepository.findEnergeticsByMoisture(energetics.getMoisture()) != null)){
            return energetics.toString();
        }
        return "This item is not in the directory yet.";
    }

    public Iterable<Energetics> energeticsIndex(){return energeticsRepository.findAll();}

    public Energetics getEnergeticsById(Long energeticsId){
        return energeticsRepository.findEnergeticsByEnergeticsId(energeticsId);
    }

    public Energetics getEnergeticsByTemperature(String temperature){
        return energeticsRepository.findEnergeticsByTemperature(temperature);
    }

    public Energetics getEnergeticsByMoisture(String moisture){
        return energeticsRepository.findEnergeticsByTemperature(moisture);
    }

    public Energetics updateEnergetics(Long id, String temperature, String moisture){
        Energetics energetics1 = getEnergeticsById(id);
        energetics1.setTemperature(temperature);
        energetics1.setMoisture(moisture);

        if (energetics1.toString().equals(getCheckEnergeticsExists(energetics1)))
        { return null;}
        return energeticsRepository.save(energetics1); }

    public void deleteEnergeticsById(Long energeticsId){
        energeticsRepository.delete(getEnergeticsById(energeticsId));
    }

    public void deleteEnergeticsByTemperature(String temperature){
        energeticsRepository.delete(getEnergeticsByTemperature(temperature));
    }

    public void deleteEnergeticsByMoisture(String moisture){
        energeticsRepository.delete(getEnergeticsByMoisture(moisture));
    }
}


