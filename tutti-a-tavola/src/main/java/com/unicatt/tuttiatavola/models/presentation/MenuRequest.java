package com.unicatt.tuttiatavola.models.presentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuRequest {
    private String titolo;
    private String descrizione;
    private List<PastoRequest> pasti;

    public MenuRequest(String titolo, String descrizione) {
        this.titolo=titolo;
        this.descrizione = descrizione;

    }
}
