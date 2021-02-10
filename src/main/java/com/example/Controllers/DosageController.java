package com.example.Controllers;

import com.example.Models.Dosage;
import com.example.Services.DosageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DosageController {

    @Autowired
    DosageService dosageService;

    @PostMapping("/adddosage")
    public ResponseEntity<Dosage> addDosage(@RequestBody Dosage dosage){return new ResponseEntity<>(dosageService.addDosage(dosage), HttpStatus.CREATED);}

//    @GetMapping("dosagebyid/{id}")
//    public ResponseEntity<Dosage> getDosageById(@PathVariable Long id){return new ResponseEntity<>(dosageService.getDosageById(id), HttpStatus.OK);}

    @GetMapping("dosagebyname/{dosage}")
    public ResponseEntity<Dosage> getDosageByName(@PathVariable String dosage){return new ResponseEntity<>(dosageService.getByDosage(dosage), HttpStatus.OK);}

    @GetMapping("getalldosages")
    public ResponseEntity<Iterable<Dosage>> index() {
        return new ResponseEntity<>(dosageService.dosageIndex(), HttpStatus.OK); }

//    @PutMapping("updatedosage/{id}")
//    public ResponseEntity<Dosage> updateDosage(@RequestBody Dosage dosage, @PathVariable Long id) {
//        return new ResponseEntity<>(dosageService.updateDosage(id, dosage.getDosage()), HttpStatus.OK); }
//
//    @DeleteMapping("deletedosagebyid/{id}")
//    public void deleteDosageById(@PathVariable Long id){dosageService.deleteDosageById(id);}

    @DeleteMapping("deletedosagebyname/{dosage}")
    public void deleteDosageByName(@PathVariable String dosage){dosageService.deleteDosageByName(dosage);}


}
