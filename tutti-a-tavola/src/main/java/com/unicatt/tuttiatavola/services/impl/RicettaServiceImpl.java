package com.unicatt.tuttiatavola.services.impl;

import com.unicatt.tuttiatavola.models.Ricetta;
import com.unicatt.tuttiatavola.repositories.RicettaRepository;
import com.unicatt.tuttiatavola.services.RicettaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RicettaServiceImpl implements RicettaService {
    @Autowired
    RicettaRepository ricettaRepository;
    @Override
    public List<Ricetta> recuperaTutteLeRicette() {
        return ricettaRepository.findAll();
    }
}
