import { PerfilService } from './perfil/service/perfil.service';
//import { InicialComponent } from './inicial/inicial.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CadastroEmpresaComponent, CadastroCandidatoComponent } from './cadastro';
import { PerfilCandidatoComponent, PerfilEmpresaComponent } from './perfil';
import { AppRoutingModule } from './app-routing-module';
import { PaginaInicialComponent } from './inicial';
import { CadastroCompetenciaComponent } from './competencia';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule }   from '@angular/forms';
import { CadastroVagaComponent } from './vaga';

@NgModule({
  declarations: [
    AppComponent,
    CadastroCandidatoComponent,
    CadastroEmpresaComponent,
    PerfilCandidatoComponent,
    PerfilEmpresaComponent,
    PaginaInicialComponent,
    CadastroCompetenciaComponent,
    CadastroVagaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [HttpClientModule, PerfilService],
  bootstrap: [AppComponent]
})
export class AppModule { }
