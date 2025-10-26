import { Component } from '@angular/core';
import { SegundoComponentComponent } from "./segundo-component/segundo-component.component";
import { PrimeiroComponentComponent } from './primeiro-component/primeiro-component.component';
import { PipeCustomizadoComponent } from "./pipe-customizado/pipe-customizado.component";
import { TwoWayDataBindingComponent } from "./two-way-data-binding/two-way-data-binding.component";
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [ PrimeiroComponentComponent, SegundoComponentComponent, PipeCustomizadoComponent, TwoWayDataBindingComponent,   
    FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'fundamentos';
}
