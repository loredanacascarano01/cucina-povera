package com.unicatt.tuttiatavola.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pasti")
public class Pasto {

    @Id
    @Column(name = "id_pasto")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    @SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_menu")
    private Menu menu;

    private String nome;

    private Date giorno;

    private String note;


    public Pasto(Menu menu, String nome, Date giorno, String note) {
        this.menu = menu;
        this.nome = nome;
        this.giorno = giorno;
        this.note = note;
    }
}