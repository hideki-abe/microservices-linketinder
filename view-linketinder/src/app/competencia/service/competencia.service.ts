import { Competencia } from './../model/competencia';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { CandidatoCompetencia } from '../model/candidatoCompetencia';


@Injectable({
  providedIn: 'root'
})
export class CompetenciaService {

  constructor(private httpClient: HttpClient, private router: Router) { }

  listCompetencias(): Observable<any> {
    return this.httpClient.get("http://localhost:8080/zghero/competencias");
  }

  onCompetenciaCreate(candidatoCompetencia: CandidatoCompetencia){

    this.httpClient.post("http://localhost:8080/zghero/competencia-candidato", candidatoCompetencia)
    .subscribe((response) => {
      //this.router.navigateByUrl('/candidato/perfil');
    });
    //this.router.navigateByUrl('/candidato/perfil');

}

}
