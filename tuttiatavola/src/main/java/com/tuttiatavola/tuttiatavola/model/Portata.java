package com.tuttiatavola.tuttiatavola.model;

public class Portata {

    private int idPasto;
    private int idRicetta;
    private int numeroPersone;

    public Portata(int idPasto, int idRicetta, int numeroPersone) {
        this.idPasto = idPasto;
        this.idRicetta = idRicetta;
        this.numeroPersone = numeroPersone;
    }

    public Portata() {
    }

    public int getIdPasto() {
        return idPasto;
    }

    public void setIdPasto(int idPasto) {
        this.idPasto = idPasto;
    }

    public int getIdRicetta() {
        return idRicetta;
    }

    public void setIdRicetta(int idRicetta) {
        this.idRicetta = idRicetta;
    }

    public int getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(int numeroPersone) {
        this.numeroPersone = numeroPersone;
    }
}
