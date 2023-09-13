package com.unicatt.tuttiatavola.models;


import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titolo;

    private String descrizione;

}








