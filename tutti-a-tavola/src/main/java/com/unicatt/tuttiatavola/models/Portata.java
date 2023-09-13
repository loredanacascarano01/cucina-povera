package com.unicatt.tuttiatavola.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "portate")
public class Portata {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    @SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 1)
    @Column(name = "id_portata")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_pasto")
    private Pasto pasto;

    @ManyToOne
    @JoinColumn(name = "id_ricetta")
    private Ricetta ricetta;

    private Integer numPersone;

    public Portata(Pasto pasto, Ricetta ricetta, Long numeroPersone) {
        this.pasto = pasto;
        this.ricetta = ricetta;
        this.numPersone = Math.toIntExact(numeroPersone);
    }

}