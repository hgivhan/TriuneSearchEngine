package com.example.Repositories;

import com.example.Models.Dosage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DosageRepository extends CrudRepository<Dosage, Long> {

    Dosage findDosageByDosage(String dosage);
    Dosage findDosageByDosageId(Long dosageId);

}
