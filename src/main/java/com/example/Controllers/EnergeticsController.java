package com.example.Controllers;

import com.example.Models.Energetics;
import com.example.Services.EnergeticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EnergeticsController {

    @Autowired
    EnergeticsService energeticsService;

    @PostMapping("/addenergetics")
    public ResponseEntity<Energetics> addEnergetics(@RequestBody Energetics energetics){return new ResponseEntity<>(energeticsService.addEnergetics(energetics), HttpStatus.CREATED);}

    @GetMapping("energeticsbyid/{id}")
    public ResponseEntity<Energetics> getEnergeticsById(@PathVariable Long id){return new ResponseEntity<>(energeticsService.getEnergeticsById(id), HttpStatus.OK);}

    @GetMapping("energeticsbytemperature/{temperature}")
    public ResponseEntity<Energetics> getEnergeticsByTemperature(@PathVariable String temperature){return new ResponseEntity<>(energeticsService.getEnergeticsByTemperature(temperature), HttpStatus.OK);}

    @GetMapping("energeticsbymoisture/{moisture}")
    public ResponseEntity<Energetics> getEnergeticsByMoisture(@PathVariable String moisture){return new ResponseEntity<>(energeticsService.getEnergeticsByMoisture(moisture), HttpStatus.OK);}

    @GetMapping("getallenergetics")
    public ResponseEntity<Iterable<Energetics>> index() {
        return new ResponseEntity<>(energeticsService.energeticsIndex(), HttpStatus.OK); }

    @PutMapping("updateenergetics/{id}")
    public ResponseEntity<Energetics> updateEnergetics(@RequestBody Energetics energetics, @PathVariable Long id) {
        return new ResponseEntity<>(energeticsService.updateEnergetics(id, energetics.getTemperature(), energetics.getMoisture()), HttpStatus.OK); }

    @DeleteMapping("deleteenergeticsbyid/{id}")
    public void deleteEnergeticsById(@PathVariable Long id){energeticsService.deleteEnergeticsById(id);}

    @DeleteMapping("deleteenergeticsbytemp/{temperature}")
    public void deleteEnergeticsByTemperature(@PathVariable String temperature){energeticsService.deleteEnergeticsByTemperature(temperature);}

    @DeleteMapping("deleteenergeticsbymoist/{moisture}")
    public void deleteEnergeticsByMoisture(@PathVariable String moisture){energeticsService.deleteEnergeticsByMoisture(moisture);}

}

}
