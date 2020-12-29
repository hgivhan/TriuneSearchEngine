package com.example.Controllers;

import com.example.Models.Herb;
import com.example.Services.HerbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
public class HerbController {

    @Autowired
    private HerbService herbService;

    public HerbController(){}

    public HerbController(HerbService herbService){
        this.herbService = herbService;
    }

    @PostMapping("/add")
    public ResponseEntity<Herb> addHerb(@RequestBody Herb herb){return new ResponseEntity<>(herbService.postAddHerb(herb), HttpStatus.CREATED);}

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<Herb> getHerbById(@PathVariable Long id){return new ResponseEntity<>(herbService.getHerbById(id), HttpStatus.OK);}

    @GetMapping("/getbylatin/{latinName}")
    public ResponseEntity<Herb> getHerbByLatinName(@PathVariable String latinName){return new ResponseEntity<>(herbService.getHerbByLatinName(latinName), HttpStatus.OK);}

    @GetMapping("/getbycommon/{commonName}")
    public ResponseEntity<Herb> getHerbByCommonName(@PathVariable String commonName){return new ResponseEntity<>(herbService.getHerbByCommonName(commonName), HttpStatus.OK);}

    @GetMapping("/getbydose/{dosageParts}")
    public ResponseEntity<Herb> getHerbByDosage(@PathVariable String dosageParts){return new ResponseEntity<>(herbService.getHerbByDosageParts(dosageParts), HttpStatus.OK);}

    @GetMapping("/getbyenergetics/{energetics}")
    public ResponseEntity<Herb> getHerbByEnergetics(@PathVariable String energetics){return new ResponseEntity<>(herbService.getHerbByEnergetics(energetics), HttpStatus.OK);}

    @GetMapping("/getbybodysystem/{bodySystem}")
    public ResponseEntity<Herb> getHerbByBodySystem(@PathVariable String bodySystem){return new ResponseEntity<>(herbService.getHerbByBodySystemsAffected(bodySystem), HttpStatus.OK);}

    @GetMapping("/getbyaction/{action}")
    public ResponseEntity<Herb> getHerbByAction(@PathVariable String action){return new ResponseEntity<>(herbService.getHerbByActions(action), HttpStatus.OK);}

    @GetMapping("/getall")
    public ResponseEntity<Iterable<Herb>> index() {
        return new ResponseEntity<>(herbService.getIndex(), HttpStatus.OK); }

    @PutMapping("/update/{id}")
    public ResponseEntity<Herb> updateHerb(@RequestBody Herb herb, @PathVariable Long id) {
        return new ResponseEntity<>(herbService.putUpdateHerbById(id, herb.getLatinName(), herb.getCommonName(), herb.getOtherCommonNames(), herb.getDosageParts(), herb.getDescription(), herb.getEnergetics(), herb.getBodySystems(), herb.getActions()), HttpStatus.OK); }

    @DeleteMapping("/deletbyid/{id}")
    public void deleteHerbById(@PathVariable Long id){herbService.deleteHerbById(id);}

    @DeleteMapping("/deletebylatinname/{latinName}")
    public void deleteHerbByLatinName(@PathVariable String latinName){herbService.deleteHerbByLatinName(latinName);}


}
