package com.example.Repositories;

import com.example.Models.Herb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HerbRepository extends CrudRepository<Herb, Long> {

    Herb findHerbByHerbId(Long herbId);
    Herb findHerbByLatinName(String latinName);
    Herb findHerbByCommonName(String commonName);
    Herb findHerbByDosage(String dosage);
    Herb findHerbByEnergetics(String energetics);
    Herb findHerbByEffects(String effects);
    Iterable<Herb> save(List<Herb> herbs);





}
