import { CandidatoCompetencia } from './../model/candidatoCompetencia';
import { Component, OnInit } from '@angular/core';
import { CompetenciaService } from '../service';
import { Competencia } from '../model/competencia';
import { FormsModule }   from '@angular/forms';


@Component({
  selector: 'app-cadastro-competencia',
  templateUrl: './cadastro-competencia.component.html',
  styleUrls: ['./cadastro-competencia.component.css']
})
export class CadastroCompetenciaComponent implements OnInit {

  competencias: Competencia[];
  competenciaSelecionada: Competencia = {
    id: '',
    nome: ''
  };
  candidatoCompetencia: CandidatoCompetencia = {
    id_candidatos: '1',
    id_competencias: ''
  }

  constructor(private competenciaService: CompetenciaService) { 
  
  }

  ngOnInit(){
    this.list();
  }

  list(){
    this.competenciaService.listCompetencias().subscribe(competencias => {
      this.competencias = competencias;
    }, err => {
      console.log('Erro ao listar perfil', err);
    })
  }

  radioChangeHandler(event: Competencia){
    this.competenciaSelecionada = event;
    console.log(event);
  }

  create(competencia: Competencia){
    
    /*
      Aqui vai o método para pegar o id do candidato pelo local storage
    */
    this.candidatoCompetencia.id_competencias = competencia.id
    this.candidatoCompetencia.id_candidatos = '1'
    this.competenciaService.onCompetenciaCreate(this.candidatoCompetencia)
  }

}
