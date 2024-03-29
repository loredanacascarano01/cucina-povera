package com.unicatt.tuttiatavola.models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "ingredienti")
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_ingrediente")
    private Long id;

    @Column(name="nome_ingrediente")
    private String nome;

    private String unita;

    private Boolean veg;

    private Boolean glutefree;

    private Boolean lattosiofree;

    private String note;

}