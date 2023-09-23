import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomepageComponent } from './homepage/homepage.component';
import { VisualizzaMenuComponent } from './visualizza-menu/visualizza-menu.component';
import { CreaMenuComponent } from './crea-menu/crea-menu.component';
import { HttpClientModule } from '@angular/common/http';
import { DettagliMenuComponent } from './dettagli-menu/dettagli-menu.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    VisualizzaMenuComponent,
    CreaMenuComponent,
    DettagliMenuComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
