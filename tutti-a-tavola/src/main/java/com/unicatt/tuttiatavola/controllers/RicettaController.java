package com.unicatt.tuttiatavola.controllers;

import com.unicatt.tuttiatavola.models.Ricetta;
import com.unicatt.tuttiatavola.services.RicettaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ricette")

@CrossOrigin(origins = "http://localhost:4200")
public class RicettaController {

    @Autowired
    RicettaService ricettaService;
    @GetMapping()
    public ResponseEntity<List<Ricetta>> retrieveRicettas(){
        return ResponseEntity.ok(ricettaService.recuperaTutteLeRicette());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ricetta> retrieveRicetta(@PathVariable Long id){
        return null;
    }

    @PostMapping()
    public ResponseEntity<Ricetta> addRicetta(@RequestBody Ricetta Ricetta){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ricetta> updateRicetta(@PathVariable Long id, @RequestBody Ricetta Ricetta){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Ricetta> updateRicetta(@PathVariable Long id){
        return null;
    }
}
