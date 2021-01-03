package com.example.Repositories;

import com.example.Models.Herb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HerbRepository extends CrudRepository<Herb, Long> {

    Herb findHerbById(Long herbId);
    Herb findHerbByLatinName(String latinName);
    Herb findHerbByCommonName(String commonName);
    Herb findHerbByDosage(String dosage);
    Herb findHerbByEnergetics(String energetics);
    Herb findHerbByBodySystem(String bodySystem);
    Herb findHerbByAction(String action);




}
