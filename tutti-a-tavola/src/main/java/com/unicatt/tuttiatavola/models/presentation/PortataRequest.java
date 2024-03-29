package com.unicatt.tuttiatavola.models.presentation;

import com.unicatt.tuttiatavola.models.Ricetta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PortataRequest {
    private Long idRicetta;

    private String nomeRicetta;
    private Long numeroPersone;

    public PortataRequest(Ricetta ricetta, Integer numPersone) {
        this.idRicetta = ricetta.getId();
        this.nomeRicetta = ricetta.getNome();
        this.numeroPersone = Long.valueOf(numPersone);
    }
}
