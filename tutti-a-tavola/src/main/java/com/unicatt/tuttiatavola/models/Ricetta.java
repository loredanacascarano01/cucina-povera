package com.unicatt.tuttiatavola.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ricette")
public class Ricetta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String note;


}

