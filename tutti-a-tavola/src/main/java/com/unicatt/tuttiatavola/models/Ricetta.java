package com.unicatt.tuttiatavola.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ricette")
public class Ricetta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    @SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 1)
    @Column(name = "id_ricetta")
    private Long id;

    @Column(name = "nome_ricetta")
    private String nome;

    private String note;


}

