import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-barra-pesquisa',
  imports: [FormsModule],
  templateUrl: './barra-pesquisa.html',
  styleUrl: './barra-pesquisa.css',
})
export class BarraPesquisa {
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