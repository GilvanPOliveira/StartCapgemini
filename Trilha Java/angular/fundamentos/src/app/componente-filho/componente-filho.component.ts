import { Component, Input, Output, EventEmitter  } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-componente-filho',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './componente-filho.component.html',
  styleUrl: './componente-filho.component.css'
})
export class ComponenteFilhoComponent {
  @Input() sobrenome = "";

  @Output() mostraNome = new EventEmitter();

  nome="";
}
