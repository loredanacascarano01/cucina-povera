import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { PastoComponent } from './pasto/pasto.component';
import { RicettaComponent } from './ricetta/ricetta.component';
import { IngredienteComponent } from './ingrediente/ingrediente.component';
import { PortataComponent } from './portata/portata.component';
import { DoseComponent } from './dose/dose.component';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    PastoComponent,
    RicettaComponent,
    IngredienteComponent,
    PortataComponent,
    DoseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
