import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { IProduto, produtos } from '../produtos';
import { RouterLink } from "@angular/router";

@Component({
  selector: 'app-produtos',
  standalone: true,
  imports: [CommonModule, RouterLink],
  templateUrl: './produtos.component.html',
  styleUrl: './produtos.component.css'
})
export class ProdutosComponent {
  produtos: IProduto[] = produtos;
}
