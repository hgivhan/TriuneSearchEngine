package com.example.Repositories;

import com.example.Models.Herb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HerbRepository extends CrudRepository<Herb, Long> {

    Herb findHerbById(Long id);
    Herb findHerbByLatinName(String latinName);
    Herb findHerbByCommonName(String commonName);
    Herb findHerbByDosageParts(String dosageParts);
    Herb findHerbByEnergetics(String energetics);
    Herb findHerbByBodySystemsAffected(String bodySystem);
    Herb findHerbByActions(String actions);




}
