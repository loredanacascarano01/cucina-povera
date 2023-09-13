package com.unicatt.tuttiatavola.controllers;

import com.unicatt.tuttiatavola.models.Ricetta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RicettaController {

    @GetMapping()
    public ResponseEntity<List<Ricetta>> retrieveRicettas(){
        return null;
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
