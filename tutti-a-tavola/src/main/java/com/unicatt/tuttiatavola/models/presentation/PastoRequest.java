package com.unicatt.tuttiatavola.models.presentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PastoRequest {
    private String nome;
    private Date giorno;
    private String note;
    private List<PortataRequest> portate;

    public PastoRequest(String nome, Date giorno, String note) {
        this.nome = nome;
        this.giorno= giorno;
        this.nome = note;
    }
}
