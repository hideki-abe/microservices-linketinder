import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class CadastroService {

  constructor(private httpClient: HttpClient, private router: Router) { }

  
  onCandidatoCreate(candidatos: any){
      console.log(candidatos);
      this.httpClient.post("http://localhost:8082/zghero/candidatos", candidatos)
      .subscribe((response) => {
        this.router.navigateByUrl('/candidato/competencias');
      });
      this.router.navigateByUrl('/candidato/competencias');
  }

  onEmpresaCreate(empresas: any){
    console.log(empresas);
    this.httpClient.post("http://localhost:8082/zghero/empresas", empresas)
    .subscribe((response) => {
      this.router.navigateByUrl('/empresa/perfil');
      console.log(response);
    });
    this.router.navigateByUrl('/empresa/perfil');
}

}
