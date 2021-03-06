package com.example.Repositories;

import com.example.Models.Energetics;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergeticsRepository extends CrudRepository<Energetics, Long> {

    Energetics findEnergeticsByEnergeticsId(Long energeticsId);
    Energetics findEnergeticsByTemperature(String temperature);
    Energetics findEnergeticsByMoisture(String moisture);
}
