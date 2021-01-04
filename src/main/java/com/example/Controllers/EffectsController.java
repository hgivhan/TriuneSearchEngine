package com.example.Controllers;

import com.example.Models.Effects;
import com.example.Services.EffectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EffectsController {

    @Autowired
    EffectsService effectsService;

    @PostMapping("/addeffect")
    public ResponseEntity<Effects> addDosage(@RequestBody Effects effects){return new ResponseEntity<>(effectsService.addEffects(effects), HttpStatus.CREATED);}

    @GetMapping("effectsbyid/{id}")
    public ResponseEntity<Effects> getEffectsById(@PathVariable Long id){return new ResponseEntity<>(effectsService.getEffectsById(id), HttpStatus.OK);}

    @GetMapping("effectsbyname/{effects}")
    public ResponseEntity<Effects> getEffectsByName(@PathVariable String effects){return new ResponseEntity<>(effectsService.getByEffects(effects), HttpStatus.OK);}

    @GetMapping("getalleffects")
    public ResponseEntity<Iterable<Effects>> index() {
        return new ResponseEntity<>(effectsService.effectsIndex(), HttpStatus.OK); }

    @PutMapping("updateeffect/{id}")
    public ResponseEntity<Effects> updateEffect(@RequestBody Effects effects, @PathVariable Long id) {
        return new ResponseEntity<>(effectsService.updateEffects(id, effects.getEffects()), HttpStatus.OK); }

    @DeleteMapping("deleteeffectbyid/{id}")
    public void deleteEffectById(@PathVariable Long id){effectsService.deleteEffectsById(id);}

    @DeleteMapping("deleteeffectbyname/{effect}")
    public void deleteEffectByName(@PathVariable String effect){effectsService.deleteEffectsByName(effect);}

}
