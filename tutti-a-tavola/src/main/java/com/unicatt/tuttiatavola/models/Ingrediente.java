package com.unicatt.tuttiatavola.models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "ingredienti")
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String unita;

    private Boolean veg;

    private Boolean glutefree;

    private Boolean lattosiofree;

    private String note;

}