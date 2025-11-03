import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { LoggerService } from '../logger.service';

@Component({
  selector: 'app-exemplo-servicos1',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './exemplo-servicos1.component.html',
  styleUrl: './exemplo-servicos1.component.css'
})
export class ExemploServicos1Component {
  nome = "";
  constructor(private logger: LoggerService){

  }
  adicionarNome() {
    this.logger.logar(`O nome ${this.nome} foi adicionado`)
  }
}
