import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-segundo-component',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './segundo-component.component.html',
  styleUrls: ['./segundo-component.component.css']
})

export class SegundoComponentComponent {
  nome = "maria";
  dataNascimento = "1990-05-20"; 
  urlImagem = "/camaleao.jpg";
  mostrarDataNascimento(){
    alert(`A data de nascimento é: ${this.dataNascimento}`)
  } 
}