package com.tuttiatavola.tuttiatavola.model;

public class Ingrediente {
    private int idIngrediente;
    private String nomeIngrediente;
    private String udm;
    private Intolleranza intolleranza;

    public Ingrediente(int idIngrediente, String nomeIngrediente, String udm, Intolleranza intolleranza) {
        this.idIngrediente = idIngrediente;
        this.nomeIngrediente = nomeIngrediente;
        this.udm = udm;
        this.intolleranza = intolleranza;
    }

    public Ingrediente() {
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public String getUdm() {
        return udm;
    }

    public void setUdm(String udm) {
        this.udm = udm;
    }

    public Intolleranza getIntolleranza() {
        return intolleranza;
    }

    public void setIntolleranza(Intolleranza intolleranza) {
        this.intolleranza = intolleranza;
    }
}
