import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.scss'],
})
export class HomepageComponent {
  constructor(private router: Router) {}

  visualizzaMenuSalvati() {
    this.router.navigate(['/visualizza-menu']);
  }

  creaNuovoMenu() {
    this.router.navigate(['/crea-menu']);
  }
}
