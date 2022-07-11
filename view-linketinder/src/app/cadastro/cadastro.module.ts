import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule }   from '@angular/forms';
import { CadastroCandidatoComponent } from './cadastro-candidato/cadastro-candidato.component';
import { CadastroEmpresaComponent } from './cadastro-empresa/cadastro-empresa.component';
import { CadastroService } from './service';



@NgModule({
  declarations: [
    CadastroCandidatoComponent,
    CadastroEmpresaComponent
  ],
  imports: [
    CommonModule,
    FormsModule
  ]
})
export class CadastroModule { }
