import { Component } from '@angular/core';
import { CicloDeVidaComponent } from "../ciclo-de-vida/ciclo-de-vida.component";
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-ciclo-de-vida-pai',
  standalone: true,
  imports: [FormsModule, CicloDeVidaComponent], 
  templateUrl: './ciclo-de-vida-pai.component.html',
  styleUrl: './ciclo-de-vida-pai.component.css'
})
export class CicloDeVidaPaiComponent {
  texto = "";
}
