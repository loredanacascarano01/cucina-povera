package com.unicatt.tuttiatavola.models.presentation;

import com.unicatt.tuttiatavola.models.Ingrediente;
import lombok.Data;

@Data
public class ElementoSpesa {
    private String nomeIngrediente;
    private double quantitaMinima;
    private String udm;
}
