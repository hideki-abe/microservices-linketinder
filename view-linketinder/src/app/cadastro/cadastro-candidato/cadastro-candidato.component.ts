import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormsModule }   from '@angular/forms';
import { CadastroService } from '../service';

@Component({
  selector: 'app-cadastro-candidato',
  templateUrl: './cadastro-candidato.component.html',
  styleUrls: ['./cadastro-candidato.component.css']
})
export class CadastroCandidatoComponent implements OnInit {

  constructor(private cadastroService: CadastroService) { }

  ngOnInit(): void {
  }

  create(candidatos: 
    {
      nome: string, 
      sobrenome: string, 
      data_de_nascimento: string, 
      email: string,
      cpf: string, 
      pais: string,
      cep: string,
      descricao: string,
      senha: string
    }){
      
      this.cadastroService.onCandidatoCreate(candidatos);
      console.log("Cadastro realizado!");
      
  }

}
