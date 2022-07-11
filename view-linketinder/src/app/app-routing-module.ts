import { CadastroVagaComponent } from './vaga/cadastro-vaga/cadastro-vaga.component';
import { PerfilCandidatoComponent, PerfilEmpresaComponent } from './perfil';
import { CadastroCompetenciaComponent } from './competencia'
import {
  CadastroCandidatoComponent,
  CadastroEmpresaComponent
} from './cadastro'
import { PaginaInicialComponent } from './inicial'
import { NgModule } from '@angular/core'
import { Routes, RouterModule } from '@angular/router'
import { InicialRoutes } from './inicial'

export const routes: Routes = [
  {
    path: '',
    component: PaginaInicialComponent
  },
  {
    path: 'candidato',
    component: CadastroCandidatoComponent
  },
  {
    path: 'empresa',
    component: CadastroEmpresaComponent
  },
  {
    path: 'candidato/competencias',
    component: CadastroCompetenciaComponent
  },
  {
    path: 'candidato/competencias/perfil',
    redirectTo: 'candidato/perfil'
  },
  {
    path: 'candidato/perfil',
    component: PerfilCandidatoComponent
  },
  {
    path: 'empresa',
    redirectTo: 'empresa/perfil'
  },
  {
    path: 'empresa/perfil',
    component: PerfilEmpresaComponent
  },
  {
    path: 'empresa/perfil/cadastro/vaga',
    redirectTo: 'empresa/cadastro'
  },
  {
    path: 'empresa/cadastro',
    component: CadastroVagaComponent
  },
   {
    path: 'empresa/cadastro/empresa',
    redirectTo: 'empresa/perfil'
  }

]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
