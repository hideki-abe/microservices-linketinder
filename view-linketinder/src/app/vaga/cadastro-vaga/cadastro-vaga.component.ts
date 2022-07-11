import { Component, OnInit } from '@angular/core';
import { VagaService } from '../service';
import { Vaga } from '../model/vaga';

@Component({
  selector: 'app-cadastro-vaga',
  templateUrl: './cadastro-vaga.component.html',
  styleUrls: ['./cadastro-vaga.component.css']
})
export class CadastroVagaComponent implements OnInit {

  constructor(private vagaService: VagaService) { }

  ngOnInit(): void {
  }

  create(vaga: Vaga){
      vaga.id_empresa = '1';
      this.vagaService.onVagaCreate(vaga);
  }

}
