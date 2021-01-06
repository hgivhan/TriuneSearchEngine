package com.example.Repositories;

import com.example.Models.Dosage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DosageRepository extends CrudRepository<Dosage, Long> {

    Dosage findDosageByName(String dosage);
    Dosage findDosageById(Long dosageId);

}
