import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PerfilCandidatoComponent } from './perfil-candidato/perfil-candidato.component';
import { PerfilEmpresaComponent } from './perfil-empresa/perfil-empresa.component';



@NgModule({
  declarations: [
    PerfilCandidatoComponent,
    PerfilEmpresaComponent
  ],
  imports: [
    CommonModule
  ]
})
export class PerfilModule { }
