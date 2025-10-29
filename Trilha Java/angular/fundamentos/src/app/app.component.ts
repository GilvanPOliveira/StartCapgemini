import { Component } from '@angular/core';
import { SegundoComponentComponent } from "./segundo-component/segundo-component.component";
import { PrimeiroComponentComponent } from './primeiro-component/primeiro-component.component';
import { PipeCustomizadoComponent } from "./pipe-customizado/pipe-customizado.component";
import { TwoWayDataBindingComponent } from "./two-way-data-binding/two-way-data-binding.component";
import { FormsModule } from '@angular/forms';
import { RenderizandoListasComponent } from "./renderizando-listas/renderizando-listas.component";
import { ComponentePersonalizadoComponent } from "./componente-personalizado/componente-personalizado.component";
import { ComponentePaiComponent } from "./componente-pai/componente-pai.component";
import { ExemploServicos1Component } from "./exemplo-servicos1/exemplo-servicos1.component";
import { ExemploServicos2Component } from "./exemplo-servicos2/exemplo-servicos2.component";
import { CicloDeVidaPaiComponent } from "./ciclo-de-vida-pai/ciclo-de-vida-pai.component";
import { CardComponent } from "./card/card.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [PrimeiroComponentComponent, SegundoComponentComponent, PipeCustomizadoComponent, TwoWayDataBindingComponent,
    FormsModule, RenderizandoListasComponent, ComponentePersonalizadoComponent, ComponentePaiComponent, ExemploServicos1Component, ExemploServicos2Component, CicloDeVidaPaiComponent, CardComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'fundamentos';
}
