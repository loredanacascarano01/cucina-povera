package com.unicatt.tuttiatavola.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pasto> pasti = new ArrayList<>();



    public Menu(String titolo, String descrizione) {
        this.titolo = titolo;
        this.descrizione = descrizione;
    }
}








