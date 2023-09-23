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

  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.http.get<Menu[]>('http://localhost:8080/api/menu').subscribe(menu => {
      this.menus = menu;
      console.log(this.menus);
    });
  }
}
