import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class VagaService {

  constructor(private httpClient: HttpClient, private router: Router) { }

  onVagaCreate(vagas: any){
      console.log(vagas);
      this.httpClient.post("http://localhost:8080/zghero/vagas", vagas)
      .subscribe((response) => {
        this.router.navigateByUrl('/empresa/perfil');
      });
  }
}
