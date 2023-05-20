package com.tuttiatavola.tuttiatavola.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class Ricetta {


    private int idRicetta;
    private String nomeRicetta;
    private Intolleranza intolleranza;

    public Ricetta(int idRicetta, String nomeRicetta, Intolleranza intolleranza) {
        this.idRicetta = idRicetta;
        this.nomeRicetta = nomeRicetta;
        this.intolleranza = intolleranza;
    }

    public Ricetta() {
    }

    public int getIdRicetta() {
        return idRicetta;
    }

    public void setIdRicetta(int idRicetta) {
        this.idRicetta = idRicetta;
    }

    public String getNomeRicetta() {
        return nomeRicetta;
    }

    public void setNomeRicetta(String nomeRicetta) {
        this.nomeRicetta = nomeRicetta;
    }

    public Intolleranza getIntolleranza() {
        return intolleranza;
    }

    public void setIntolleranza(Intolleranza intolleranza) {
        this.intolleranza = intolleranza;
    }
}
