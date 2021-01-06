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
    public ResponseEntity<Effects> addEffect(@RequestBody Effects effects){return new ResponseEntity<>(effectsService.addEffects(effects), HttpStatus.CREATED);}

    @GetMapping("effectsbyid/{id}")
    public ResponseEntity<Effects> getEffectsById(@PathVariable Long id){return new ResponseEntity<>(effectsService.getEffectsById(id), HttpStatus.OK);}

    @GetMapping("effectsbysystem/{bodySystem}")
    public ResponseEntity<Effects> getEffectsByBodySystem(@PathVariable String bodySystem){return new ResponseEntity<>(effectsService.getEffectsByBodySystem(bodySystem), HttpStatus.OK);}

    @GetMapping("effectsbyaction/{action}")
    public ResponseEntity<Effects> getEffectsByAction(@PathVariable String action){return new ResponseEntity<>(effectsService.getEffectsByAction(action), HttpStatus.OK);}

    @GetMapping("getalleffects")
    public ResponseEntity<Iterable<Effects>> index() {
        return new ResponseEntity<>(effectsService.effectsIndex(), HttpStatus.OK); }

    @PutMapping("updateeffect/{id}")
    public ResponseEntity<Effects> updateEffect(@RequestBody Effects effects, @PathVariable Long id) {
        return new ResponseEntity<>(effectsService.updateEffects(id, effects.getBodySystem(), effects.getAction()), HttpStatus.OK); }

    @DeleteMapping("deleteeffectbyid/{id}")
    public void deleteEffectById(@PathVariable Long id){effectsService.deleteEffectsById(id);}

}
