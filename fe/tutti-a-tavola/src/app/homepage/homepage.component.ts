import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.scss']
})
export class HomepageComponent {

  constructor(private router: Router) { }

  visualizzaMenuSalvati() {
    // Reindirizza l'utente alla pagina per visualizzare i menu salvati
    this.router.navigate(['/visualizza-menu']);
  }

  creaNuovoMenu() {
    // Reindirizza l'utente alla pagina per creare un nuovo menu
    this.router.navigate(['/crea-menu']);
  }
}
