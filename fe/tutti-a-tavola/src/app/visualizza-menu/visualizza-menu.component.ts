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
    this.menus = this.menus.filter(m => m.idMenu !== menu.idMenu);
  });
}

  mostraDettagli(menu: Menu) {
    if (this.menuSelezionato === menu) {
      this.menuSelezionato = null;
    } else {
      this.menuSelezionato = menu;
    }
  }
}
