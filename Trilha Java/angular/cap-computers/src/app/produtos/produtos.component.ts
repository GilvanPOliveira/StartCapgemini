import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { IProduto, produtos } from '../produtos';
import { RouterLink } from "@angular/router";
import { ProdutosService } from '../produtos.service';

@Component({
    selector: 'app-produtos',
    imports: [CommonModule, RouterLink],
    templateUrl: './produtos.component.html',
    styleUrl: './produtos.component.css'
})
export class ProdutosComponent implements OnInit{
  produtos: IProduto[] | undefined;

  constructor (private produtosServices: ProdutosService) {}

  ngOnInit(): void {
    this.produtos = this.produtosServices.getAll();
  }
}
