import { Component } from '@angular/core';
import { ComponenteFilhoComponent } from "../componente-filho/componente-filho.component";

@Component({
  selector: 'app-componente-pai',
  standalone: true,
  imports: [ComponenteFilhoComponent],
  templateUrl: './componente-pai.component.html',
  styleUrl: './componente-pai.component.css'
})
export class ComponentePaiComponent {
  sobrenome = "da Silva";
  mostrarNomeCompleto(nomeCompleto: any) {
    alert(`O nome completo é: ${nomeCompleto}`)
  }
}
