package com.unicatt.tuttiatavola.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "pasti")
public class Pasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_menu")
    private Menu menu;

    private String nome;

    private Date giorno;

    private String note;

}