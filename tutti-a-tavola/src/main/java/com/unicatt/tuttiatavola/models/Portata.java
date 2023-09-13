package com.unicatt.tuttiatavola.models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "portate")
public class Portata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_pasto")
    private Pasto pasto;

    @ManyToOne
    @JoinColumn(name = "id_ricetta")
    private Ricetta ricetta;

    private Integer numPersone;

}