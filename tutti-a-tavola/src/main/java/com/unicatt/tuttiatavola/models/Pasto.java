package com.unicatt.tuttiatavola.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pasti")
public class Pasto {

    @Id
    @Column(name = "id_pasto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_menu")
    private Menu menu;

    private String nome;

    private Date giorno;

    private String note;

    @OneToMany(mappedBy = "pasto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Portata> portate = new ArrayList<>();


    public Pasto(Menu menu, String nome, Date giorno, String note) {
        this.menu = menu;
        this.nome = nome;
        this.giorno = giorno;
        this.note = note;
    }
}