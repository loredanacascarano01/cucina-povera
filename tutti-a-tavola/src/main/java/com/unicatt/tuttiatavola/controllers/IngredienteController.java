package com.unicatt.tuttiatavola.controllers;

import com.unicatt.tuttiatavola.models.Ingrediente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class IngredienteController {

    @GetMapping()
    public ResponseEntity<List<Ingrediente>> retrieveIngredientes(){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingrediente> retrieveIngrediente(@PathVariable Long id){
        return null;
    }

    @PostMapping()
    public ResponseEntity<Ingrediente> addIngrediente(@RequestBody Ingrediente Ingrediente){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ingrediente> updateIngrediente(@PathVariable Long id, @RequestBody Ingrediente Ingrediente){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Ingrediente> updateIngrediente(@PathVariable Long id){
        return null;
    }
}
