package com.tuttiatavola.tuttiatavola.model;

import java.sql.Date;

public class Pasto {

    private int idPasto;
    private int idMenu;
    private String nomePasto;
    private Date giorno;

    private Intolleranza intolleranza;

    public Pasto() {
    }

    public Pasto(int idPasto, int idMenu, String nomePasto, Date giorno, Intolleranza intolleranza) {
        this.idPasto = idPasto;
        this.idMenu = idMenu;
        this.nomePasto = nomePasto;
        this.giorno = giorno;
        this.intolleranza = intolleranza;
    }

    public int getIdPasto() {
        return idPasto;
    }

    public void setIdPasto(int idPasto) {
        this.idPasto = idPasto;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getNomePasto() {
        return nomePasto;
    }

    public void setNomePasto(String nomePasto) {
        this.nomePasto = nomePasto;
    }

    public Date getGiorno() {
        return giorno;
    }

    public void setGiorno(Date giorno) {
        this.giorno = giorno;
    }


}
