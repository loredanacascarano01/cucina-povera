package com.unicatt.tuttiatavola.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_menu", nullable =false)
    private Long id;

    private String titolo;

    private String descrizione;


    public Menu(String titolo, String descrizione) {
        this.titolo = titolo;
        this.descrizione = descrizione;
    }
}








