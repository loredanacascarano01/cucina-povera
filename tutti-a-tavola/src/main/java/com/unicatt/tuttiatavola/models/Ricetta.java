package com.unicatt.tuttiatavola.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ricette")
public class Ricetta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ricetta")
    private Long id;

    @Column(name = "nome_ricetta")
    private String nome;

    private String note;


}

