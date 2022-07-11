import { Component, OnInit } from '@angular/core';
import { CadastroService } from '../service';

@Component({
  selector: 'app-cadastro-empresa',
  templateUrl: './cadastro-empresa.component.html',
  styleUrls: ['./cadastro-empresa.component.css']
})
export class CadastroEmpresaComponent implements OnInit {

  constructor(private cadastroService: CadastroService) { }

  ngOnInit(): void {
  }

  create(empresas: 
    {
      nome: string, 
      cnpj: string, 
      email: string,
      descricao: string,
      pais: string,
      cep: string,
      senha: string
    }){
      this.cadastroService.onEmpresaCreate(empresas);
  }

}
