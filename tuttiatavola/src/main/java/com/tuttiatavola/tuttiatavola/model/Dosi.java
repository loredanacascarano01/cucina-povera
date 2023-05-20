package com.tuttiatavola.tuttiatavola.model;

public class Dosi {

    private int idRicetta;
    private int idIngrediente;

    private double dosi;

    public Dosi(int idRicetta, int idIngrediente, double dosi) {
        this.idRicetta = idRicetta;
        this.idIngrediente = idIngrediente;
        this.dosi = dosi;
    }

    public Dosi() {
    }

    public int getIdRicetta() {
        return idRicetta;
    }

    public void setIdRicetta(int idRicetta) {
        this.idRicetta = idRicetta;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public double getDosi() {
        return dosi;
    }

    public void setDosi(double dosi) {
        this.dosi = dosi;
    }
}
