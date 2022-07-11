import { Routes } from "@angular/router";
import { CadastroCandidatoComponent } from "./cadastro-candidato";4
import { CadastroEmpresaComponent } from "./cadastro-empresa";

export const InicialRoutes: Routes = [
    {
        path: 'cadastro/candidato',
        component: CadastroCandidatoComponent
    },
    {
        path: 'cadastro/empresa',
        component: CadastroEmpresaComponent
    }


];