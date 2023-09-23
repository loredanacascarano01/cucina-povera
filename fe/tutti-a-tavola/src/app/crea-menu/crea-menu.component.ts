import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Portata, Ricetta } from '../models/menu.model';

@Component({
  selector: 'app-crea-menu',
  templateUrl: './crea-menu.component.html',
  styleUrls: ['./crea-menu.component.scss'],
})
export class CreaMenuComponent implements OnInit {
  portata: Portata[] = [];
  ricette: any;
  numeroPersoneInvalid: boolean = false;
  nuovoMenu: any = {
    titolo: '',
    descrizione: '',
    pasti: [],
  };

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.http
      .get<Ricetta[]>('http://localhost:8080/ricette')
      .subscribe((ricette) => {
        this.ricette = ricette;
        console.log(this.ricette);
      });
  }

  aggiungiPasto() {
    this.nuovoMenu.pasti.push({
      nome: '',
      giorno: '',
      portate: [],
    });
  }

  rimuoviPasto(index: number) {
    this.nuovoMenu.pasti.splice(index, 1);
  }

  aggiungiPortata(indexPasto: number) {
    this.nuovoMenu.pasti[indexPasto].portate.push({
      idRicetta: 0,
      numeroPersone: 0,
    });
  }

  rimuoviPortata(indexPasto: number, indexPortata: number) {
    this.nuovoMenu.pasti[indexPasto].portate.splice(indexPortata, 1);
  }

  creaMenu() {
    if (this.nuovoMenu.pasti.length === 0) {
      console.log('Devi aggiungere almeno un pasto.');
      return;
    }

    for (const pasto of this.nuovoMenu.pasti) {
      if (pasto.portate.length === 0) {
        console.log('Ogni pasto deve avere almeno una portata.');
        return;
      }

      for (const portata of pasto.portate) {
        if (portata.idRicetta < 1) {
          console.log("L'id della ricetta deve essere un numero positivo.");
          return;
        }

        if (portata.numeroPersone < 1) {
          this.numeroPersoneInvalid = true;
          return;
        }
      }
    }

    const menuDaInviare = {
      titolo: this.nuovoMenu.titolo,
      descrizione: this.nuovoMenu.descrizione,
      pasti: this.nuovoMenu.pasti.map(
        (pasto: { nome: any; giorno: any; portate: Portata[] }) => ({
          nome: pasto.nome,
          giorno: pasto.giorno,
          portate: pasto.portate.map((portata: Portata) => ({
            idRicetta: Number(portata.idRicetta),
            numeroPersone: portata.numeroPersone,
          })),
        })
      ),
    };
    console.log(this.nuovoMenu.pasti);

    this.http
      .post('http://localhost:8080/api/menu', menuDaInviare)
      .subscribe((response) => {});
  }

  reset() {
    this.nuovoMenu = {
      titolo: '',
      descrizione: '',
      pasti: [],
    };
  }
}
