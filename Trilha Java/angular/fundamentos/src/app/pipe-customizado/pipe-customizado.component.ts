import { Component } from '@angular/core';
import { MultiplicaPorPipe } from '../multiplica-por.pipe';

@Component({
  selector: 'app-pipe-customizado',
  standalone: true,
  imports: [MultiplicaPorPipe],
  templateUrl: './pipe-customizado.component.html',
  styleUrls: ['./pipe-customizado.component.css']
})
export class PipeCustomizadoComponent {

}
