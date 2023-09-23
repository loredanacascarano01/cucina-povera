import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Menu, ElementoSpesa } from '../models/menu.model';

@Component({
  selector: 'app-visualizza-menu',
  templateUrl: './visualizza-menu.component.html',
  styleUrls: ['./visualizza-menu.component.scss'],
})
export class VisualizzaMenuComponent implements OnInit {
  menus!: Menu[];
  menuSelezionato: Menu | null = null;
  listaSpesa: any;
  mostraSchedaListaSpesa = false;
  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.http
      .get<Menu[]>('http://localhost:8080/api/menu')
      .subscribe((menus) => {
        this.menus = menus;
      });
  }

  cancellaMenu(menu: Menu) {
    const url = `http://localhost:8080/api/menu/${menu.idMenu}`;

    this.http.delete(url).subscribe(() => {
      this.menus = this.menus.filter((m) => m.idMenu !== menu.idMenu);
    });
  }

  listaSpesaMenu(menu: Menu) {
    const menuId = menu.idMenu;
    const url = `http://localhost:8080/ingredienti/listamenu/?idMenu=${menuId}`;

    this.http.get<ElementoSpesa[]>(url).subscribe((listaSpesa) => {
      this.listaSpesa = listaSpesa;
      console.log(listaSpesa);
    });
    this.mostraSchedaListaSpesa = true;
  }

  mostraDettagli(menu: Menu) {
    if (this.menuSelezionato === menu) {
      this.menuSelezionato = null;
    } else {
      this.menuSelezionato = menu;
    }
  }
  nascondiListaSpesa() {
    this.mostraSchedaListaSpesa = false;
  }
}
