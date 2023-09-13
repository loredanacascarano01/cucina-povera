package com.unicatt.tuttiatavola.services.impl;

import com.unicatt.tuttiatavola.models.Menu;
import com.unicatt.tuttiatavola.models.Pasto;
import com.unicatt.tuttiatavola.models.Portata;
import com.unicatt.tuttiatavola.models.Ricetta;
import com.unicatt.tuttiatavola.models.presentation.MenuRequest;
import com.unicatt.tuttiatavola.models.presentation.PastoRequest;
import com.unicatt.tuttiatavola.models.presentation.PortataRequest;
import com.unicatt.tuttiatavola.repositories.*;
import com.unicatt.tuttiatavola.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuRepository menuRepository;
    @Autowired
    PastoRepository pastoRepository;
    @Autowired
    PortataRepository portataRepository;
    @Autowired
    ContieneRepository contieneRepository;

    @Autowired
    RicettaRepository ricettaRepository;

    @Override
    public List<Menu> recuperaMenu() {
        return menuRepository.findAll();
    }

    @Override
    public Menu recuperaMenu(Long id) {
        return menuRepository.findById(id).orElse(null);
    }

    @Override
    public Menu aggiungiMenu(MenuRequest menuRequest) {
        // Crea un nuovo menu con i dati del menuRequest
        Menu menu = new Menu(menuRequest.getTitolo(), menuRequest.getDescrizione());
        // Salva il menu nel repository
        Menu menuSalvato = menuRepository.save(menu);
        // Crea un nuovo pasto per ogni pastoRequest nel menuRequest
        for (PastoRequest pastoRequest : menuRequest.getPasti()) {
            Pasto pasto = new Pasto(menuSalvato, pastoRequest.getNome(), pastoRequest.getGiorno(), pastoRequest.getNote());
            // Salva il pasto nel repository
            Pasto pastoSalvato = pastoRepository.save(pasto);

            // Crea una nuova portata per ogni portataRequest nel pastoRequest
            for (PortataRequest portataRequest : pastoRequest.getPortate()) {
                Ricetta ricetta = ricettaRepository.findById(portataRequest.getIdRicetta()).orElse(null);
                if(ricetta != null) {
                    portataRepository.save(new Portata(pastoSalvato, ricetta, portataRequest.getNumeroPersone()));
                }
            }
        }

        // Ritorna il menu salvato
        return menuSalvato;
    }

}
