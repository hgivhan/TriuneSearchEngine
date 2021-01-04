package com.example.Controllers;

import com.example.Models.OtherNames;
import com.example.Services.OtherNamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OtherNamesController {

    @Autowired
    OtherNamesService otherNamesService;

    @PostMapping("/addothername")
    public ResponseEntity<OtherNames> addOtherName(@RequestBody OtherNames otherName){return new ResponseEntity<>(otherNamesService.addOtherName(otherName), HttpStatus.CREATED);}

    @GetMapping("othernamebyid/{id}")
    public ResponseEntity<OtherNames> getOtherNameById(@PathVariable Long id){return new ResponseEntity<>(otherNamesService.getOtherNameById(id), HttpStatus.OK);}

    @GetMapping("othernamebyname/{name}")
    public ResponseEntity<OtherNames> getOtherNameByName(@PathVariable String otherName){return new ResponseEntity<>(otherNamesService.getByOtherName(otherName), HttpStatus.OK);}

    @GetMapping("getallothernames")
    public ResponseEntity<Iterable<OtherNames>> index() {
        return new ResponseEntity<>(otherNamesService.otherNamesIndex(), HttpStatus.OK); }

    @PutMapping("updateothername/{id}")
    public ResponseEntity<OtherNames> updateOtherNames(@RequestBody OtherNames otherName, @PathVariable Long id) {
        return new ResponseEntity<>(otherNamesService.updateOtherName(id, otherName.getOtherName()), HttpStatus.OK); }

    @DeleteMapping("deleteothernamebyid/{id}")
    public void deleteOthernameById(@PathVariable Long id){otherNamesService.deleteOtherNameById(id);}

    @DeleteMapping("deleteothernamebyname/{name}")
    public void deleteOtherNameByName(@PathVariable String otherName){otherNamesService.deleteOtherNameByName(otherName);}

}

