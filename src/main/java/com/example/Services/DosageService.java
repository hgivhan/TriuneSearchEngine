package com.example.Services;

import com.example.Models.*;
import com.example.Repositories.DosageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DosageService {

    @Autowired
    DosageRepository dosageRepository;

    public Dosage addDosage(Dosage dosage){
        if (dosage.getDosage().equals(getCheckDosageExists(dosage.getDosage())))
        { return null;
        }
        return dosageRepository.save(dosage);
    }

    public String getCheckDosageExists(String dosage){
        if(dosageRepository.findDosageByName(dosage) != null){
            return dosage;
        }
        return "This item is not in the directory yet.";
    }

    public Iterable<Dosage> dosageIndex(){return dosageRepository.findAll();}

    public Dosage getDosageById(Long dosageId){
        return dosageRepository.findDosageById(dosageId);
    }

    public Dosage getByDosage(String dosage){
        return dosageRepository.findDosageByName(dosage);
    }

    public Dosage updateDosage(Long id, String dosage){
        Dosage dosage1 = getDosageById(id);
        dosage1.setDosage(dosage);

        if (dosage1.getDosage().equals(getCheckDosageExists(dosage1.getDosage())))
        { return null;}
        return dosageRepository.save(dosage1); }

    public void deleteDosageById(Long dosageId){
        dosageRepository.delete(getDosageById(dosageId));
    }

    public void deleteDosageByName(String dosage){
        dosageRepository.delete(getByDosage(dosage));
    }

}
