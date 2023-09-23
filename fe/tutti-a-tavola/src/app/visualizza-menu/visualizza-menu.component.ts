// visualizza-menu.component.ts

import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Menu } from '../models/menu.model';

@Component({
  selector: 'app-visualizza-menu',
  templateUrl: './visualizza-menu.component.html',
  styleUrls: ['./visualizza-menu.component.scss']
})
export class VisualizzaMenuComponent implements OnInit {

  menus!: Menu[];
  menuSelezionato: Menu | null = null;

  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.http.get<Menu[]>('http://localhost:8080/api/menu').subscribe(menus => {
      this.menus = menus;
    });
  }

cancellaMenu(menu: Menu) {
  const url = `http://localhost:8080/api/menu/${menu.idMenu}`;

  this.http.delete(url).subscribe(() => {
    // Rimuovi il menu dall'array dei menu
    this.menus = this.menus.filter(m => m.idMenu !== menu.idMenu);
  });
}

  mostraDettagli(menu: Menu) {
    // Verifica se il menu selezionato è lo stesso del menu su cui si è fatto clic
    if (this.menuSelezionato === menu) {
      // Se lo è, chiudi i dettagli impostando menuSelezionato a null
      this.menuSelezionato = null;
    } else {
      // Altrimenti, mostra i dettagli del menu selezionato
      this.menuSelezionato = menu;
    }
  }
}
