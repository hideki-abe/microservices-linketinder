import { PerfilService } from './../service/perfil.service';
import { Vaga } from './../model/vaga';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-perfil-candidato',
  templateUrl: './perfil-candidato.component.html',
  styleUrls: ['./perfil-candidato.component.css']
})
export class PerfilCandidatoComponent implements OnInit {

  vaga: Vaga;

  constructor(private perfilService: PerfilService) { 
  
  }

  ngOnInit(){
    this.vagaAleatoria();
  }

  vagaAleatoria(){
    this.perfilService.listVagas().subscribe(vagas => {
      var numAleatorio: number = Math.floor(Math.random() * vagas.length)
      this.vaga = vagas[numAleatorio];
    }, err => {
      console.log('Erro ao listar perfil', err);
    })
  }
}
