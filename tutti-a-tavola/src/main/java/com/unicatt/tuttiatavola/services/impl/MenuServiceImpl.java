package com.unicatt.tuttiatavola.services.impl;

import com.unicatt.tuttiatavola.models.*;
import com.unicatt.tuttiatavola.models.presentation.MenuRequest;
import com.unicatt.tuttiatavola.models.presentation.PastoRequest;
import com.unicatt.tuttiatavola.models.presentation.PortataRequest;
import com.unicatt.tuttiatavola.repositories.*;
import com.unicatt.tuttiatavola.services.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    private static final Logger logger = LoggerFactory.getLogger(MenuServiceImpl.class);

    @Autowired
    RicettaRepository ricettaRepository;

    @Override
    public List<MenuRequest> recuperaMenu() {
        List<MenuRequest> response = new ArrayList<>();
        List<Menu> all = menuRepository.findAll();
        for (Menu menu : all) {
            response.add(recuperaMenuRequest(menu));
        }

        return response;
    }

    private MenuRequest recuperaMenuRequest(Menu menu) {
        MenuRequest menuRequest = new MenuRequest(menu.getId(), menu.getTitolo(), menu.getDescrizione());
        List<Pasto> pasti = pastoRepository.findAll().stream().filter(pasto -> pasto.getMenu().getId() == menu.getId()).toList();
        List<PastoRequest> pastiRequest = new ArrayList<>();
        for (Pasto pasto : pasti) {
            PastoRequest pastoRequest = new PastoRequest(pasto.getNome(), pasto.getGiorno(), pasto.getNote());
            List<Portata> portate = portataRepository.findAll().stream().filter(portata -> portata.getPasto().getId() == pasto.getId()).toList();
            List<PortataRequest> portateRequest = new ArrayList<>();
            for (Portata portata : portate) {
                PortataRequest portataRequest = new PortataRequest(portata.getRicetta(), portata.getNumPersone());
                portateRequest.add(portataRequest);
            }
            pastoRequest.setPortate(portateRequest);

            pastiRequest.add(pastoRequest);
        }
        menuRequest.setPasti(pastiRequest);
        return menuRequest;
    }

    @Override
    public MenuRequest recuperaMenu(Long id) {
        Menu menu = menuRepository.findById(id).orElse(null);
        return menu != null ? recuperaMenuRequest(menu) : null;

    }

    @Override
    public MenuRequest aggiungiMenu(MenuRequest menuRequest) {

        Menu menu = new Menu(menuRequest.getTitolo(), menuRequest.getDescrizione());

        Menu menuSalvato = menuRepository.save(menu);
        for (PastoRequest pastoRequest : menuRequest.getPasti()) {
            Pasto pasto = new Pasto(menuSalvato, pastoRequest.getNome(), pastoRequest.getGiorno(), pastoRequest.getNote());

            Pasto pastoSalvato = pastoRepository.save(pasto);
            for (PortataRequest portataRequest : pastoRequest.getPortate()) {
                Ricetta ricetta = ricettaRepository.findById(portataRequest.getIdRicetta()).orElse(null);
                if (ricetta != null) {
                    portataRepository.save(new Portata(pastoSalvato, ricetta, portataRequest.getNumeroPersone()));
                }
            }
        }

        return menuRequest;
    }

    @Override
    public Response cancellaMenu(Long idMenu) {
        boolean esito;
        String message;
        try {
            menuRepository.deleteById(idMenu);
            esito = Boolean.TRUE;
            message = "menù " + idMenu + " cancellato con successo.";

        }catch (Exception e){
            esito =  Boolean.FALSE;
            message = "ERRORE nella cancellazione menù "+ idMenu;
            logger.error("ERRORE CANCELLAZIONE MENù", e);
        }
        return new Response(esito, message);
    }

}
