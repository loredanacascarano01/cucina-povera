package com.unicatt.tuttiatavola.controllers;

import com.unicatt.tuttiatavola.models.presentation.ElementoSpesa;
import com.unicatt.tuttiatavola.services.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ingredienti")
public class IngredienteController {
    @Autowired
    private IngredienteService ingredienteService;

    @GetMapping("/listamenu")
    public ResponseEntity<List<ElementoSpesa>> listaSpesaPerMenu(@RequestParam Long idMenu) {
        return ResponseEntity.ok(ingredienteService.calcolaListaSpesaDalMenu(idMenu));
    }

}
