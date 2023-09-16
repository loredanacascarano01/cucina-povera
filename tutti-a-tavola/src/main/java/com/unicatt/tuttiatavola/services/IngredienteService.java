package com.unicatt.tuttiatavola.services;

import com.unicatt.tuttiatavola.models.presentation.ElementoSpesa;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IngredienteService {
    List<ElementoSpesa> calcolaListaSpesaDalMenu(Long idMenu);
}
