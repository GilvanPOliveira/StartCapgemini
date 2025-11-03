import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-barra-pesquisa',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './barra-pesquisa.component.html',
  styleUrl: './barra-pesquisa.component.css'
})
export class BarraPesquisaComponent {
  termo: string = '';

  constructor(private router: Router) {}

  buscar() {
    if (this.termo.trim()) {
    this.router.navigate(['/produtos'], { queryParams: { descricao: this.termo } }).then(() => this.termo = '');
    } else {
      this.router.navigate(['/produtos']);
    }
  }
}
