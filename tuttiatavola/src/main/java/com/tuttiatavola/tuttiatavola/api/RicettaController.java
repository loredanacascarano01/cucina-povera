package com.tuttiatavola.tuttiatavola.api;

import com.tuttiatavola.tuttiatavola.model.Ricetta;
import com.tuttiatavola.tuttiatavola.service.RicettaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
    public List<Ricetta> getAllPeople(){
        return ricettaService.getAllRicette();
    }

    @GetMapping(path = "{id}")
    public Ricetta getRicettaByID(@PathVariable("id") UUID id){
        return ricettaService.getRicettaById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteRicettaById(@PathVariable("id") UUID id){
        ricettaService.deleteRicetta(id);
    }

    @PutMapping(path = "{id}")
    public void udpateRicettaById(@PathVariable("id") UUID id, @NonNull @RequestBody Ricetta ricettaToUpdate){
        ricettaService.updateRicette(id, ricettaToUpdate);
    }
}
