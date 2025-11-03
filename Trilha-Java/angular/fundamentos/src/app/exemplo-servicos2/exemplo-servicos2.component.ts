import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { LoggerService } from '../logger.service';

@Component({
  selector: 'app-exemplo-servicos2',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './exemplo-servicos2.component.html',
  styleUrl: './exemplo-servicos2.component.css'
})
export class ExemploServicos2Component {
  produto = "";
  constructor (public logger: LoggerService) {
    
  }
  adicionarProduto() {
    this.logger.logar(`O produto com o nome ${this.produto} foi adicionado`)
  }
}
