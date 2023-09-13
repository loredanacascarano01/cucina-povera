package com.unicatt.tuttiatavola.models;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "contiene")
public class Contiene {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_ricetta")
    private Ricetta ricetta;

    @ManyToOne
    @JoinColumn(name = "id_ingrediente")
    private Ingrediente ingrediente;

    private BigDecimal quantita;

}