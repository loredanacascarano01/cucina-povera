import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VisualizzaMenuComponent } from './visualizza-menu/visualizza-menu.component'; // Sostituisci con il tuo componente per visualizzare i menu salvati
import { CreaMenuComponent } from './crea-menu/crea-menu.component';
import { HomepageComponent } from './homepage/homepage.component';

const routes: Routes = [
  { path: '', component: HomepageComponent },
  { path: 'visualizza-menu', component: VisualizzaMenuComponent },
  { path: 'crea-menu', component: CreaMenuComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
