package com.unicatt.tuttiatavola.controllers;

import com.unicatt.tuttiatavola.models.presentation.ElementoSpesa;
import com.unicatt.tuttiatavola.services.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredienti")
@CrossOrigin(origins = "http://localhost:4200")
public class IngredienteController {
    @Autowired
    private IngredienteService ingredienteService;

    @GetMapping("/listamenu")
    public ResponseEntity<List<ElementoSpesa>> listaSpesaPerMenu(@RequestParam Long idMenu) {
        return ResponseEntity.ok(ingredienteService.calcolaListaSpesaDalMenu(idMenu));
    }

}
