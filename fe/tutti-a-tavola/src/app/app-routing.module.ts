import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { VisualizzaMenuComponent } from './visualizza-menu/visualizza-menu.component'; // Sostituisci con il tuo componente per visualizzare i menu salvati
import { CreaMenuComponent } from './crea-menu/crea-menu.component';
import { HomepageComponent } from './homepage/homepage.component';
import { DettagliMenuComponent } from './dettagli-menu/dettagli-menu.component';


const routes: Routes = [
  { path: '', component: HomepageComponent },
  { path: 'visualizza-menu', component: VisualizzaMenuComponent },
  { path: 'crea-menu', component: CreaMenuComponent },
  { path: 'dettagli-menu/:id', component: DettagliMenuComponent },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
