import { PerfilService } from './../service/perfil.service';
import { Component, OnInit } from '@angular/core';
import { Candidato } from '../model/candidato';

@Component({
  selector: 'app-perfil-empresa',
  templateUrl: './perfil-empresa.component.html',
  styleUrls: ['./perfil-empresa.component.css']
})
export class PerfilEmpresaComponent implements OnInit {

  candidato: Candidato;

  constructor(private perfilService: PerfilService) { 
  
  }

  ngOnInit(){
    this.candidatoAleatorio();
  }

  candidatoAleatorio(): any{
    this.perfilService.listCandidatos().subscribe(candidatos => {
      var numAleatorio: number = Math.floor(Math.random() * candidatos.length)
      console.log(candidatos[numAleatorio]);
      this.candidato = candidatos[numAleatorio];
    }, err => {
      console.log('Erro ao listar perfil', err);
    })
  }

}
