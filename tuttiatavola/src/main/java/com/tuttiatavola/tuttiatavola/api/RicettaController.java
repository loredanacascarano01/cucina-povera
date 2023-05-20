package com.tuttiatavola.tuttiatavola.api;

import com.tuttiatavola.tuttiatavola.model.Ricetta;
import com.tuttiatavola.tuttiatavola.service.RicettaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/ricetta")
@RestController
public class RicettaController {

    private final RicettaService ricettaService;

    @Autowired
    public RicettaController(RicettaService ricettaService){
        this.ricettaService = ricettaService;
    }

    @PostMapping
    public void addRicetta(@RequestBody Ricetta ricetta) {
        ricettaService.addRicetta(ricetta);
    }

    @GetMapping
    public List<Ricetta> getAllRicette(){
        return ricettaService.getAllRicette();
    }

}
