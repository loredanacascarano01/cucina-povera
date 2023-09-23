package com.unicatt.tuttiatavola.services.impl;

import com.unicatt.tuttiatavola.models.Contiene;
import com.unicatt.tuttiatavola.models.Ingrediente;
import com.unicatt.tuttiatavola.models.presentation.ElementoSpesa;
import com.unicatt.tuttiatavola.models.presentation.MenuRequest;
import com.unicatt.tuttiatavola.models.presentation.PastoRequest;
import com.unicatt.tuttiatavola.models.presentation.PortataRequest;
import com.unicatt.tuttiatavola.repositories.ContieneRepository;
import com.unicatt.tuttiatavola.repositories.IngredienteRepository;
import com.unicatt.tuttiatavola.services.IngredienteService;
import com.unicatt.tuttiatavola.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IngredienteServiceImpl implements IngredienteService {
    @Autowired
    private IngredienteRepository ingredienteRepository;

    @Autowired
    private MenuService menuService;

    @Autowired
    private ContieneRepository contieneRepository;

    @Override
    public List<ElementoSpesa> calcolaListaSpesaDalMenu(Long idMenu) {

        MenuRequest menu = menuService.recuperaMenu(idMenu);
        Map<Ingrediente, Double> ingredientiEQuantita = new HashMap<>();
        if (menu != null) {
            for (PastoRequest pasto : menu.getPasti()) {
                for (PortataRequest portataRequest : pasto.getPortate()) {


                    List<Contiene> contiene = contieneRepository.findAll().stream().filter(portata -> portata.getRicetta().getId() == portataRequest.getIdRicetta()).toList();

                    for (Contiene c : contiene) {
                        Ingrediente ingrediente = c.getIngrediente();
                        Double quantita = Double.valueOf(c.getQuantita());
                        double value = ingredientiEQuantita.getOrDefault(ingrediente, Double.valueOf(0));
                        double quantitaPerPasto = quantita * portataRequest.getNumeroPersone();
                        ingredientiEQuantita.put(ingrediente, value + quantitaPerPasto);
                    }
                }
            }
        }
        List<ElementoSpesa> elementiSpesa = new ArrayList<>();
        for (Map.Entry<Ingrediente, Double> entry : ingredientiEQuantita.entrySet()) {
            Ingrediente ingrediente = entry.getKey();
            Double quantita = entry.getValue();

            ElementoSpesa elementoSpesa = new ElementoSpesa();
            elementoSpesa.setNomeIngrediente(ingrediente.getNome());
            elementoSpesa.setUdm(ingrediente.getUnita());
            elementoSpesa.setQuantitaMinima(quantita);

            elementiSpesa.add(elementoSpesa);
        }

        return elementiSpesa;
    }

}
