import { Candidato } from './../model/candidato';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Vaga } from '../model/vaga';
import { tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class PerfilService {

  constructor(private httpClient: HttpClient) { }

  listVagas(): Observable<any> {
    return this.httpClient.get("http://localhost:8080/zghero/vagas");
  }

  listCandidatos(): Observable<any> {
    return this.httpClient.get("http://localhost:8080/zghero/candidatos");
  }

}
