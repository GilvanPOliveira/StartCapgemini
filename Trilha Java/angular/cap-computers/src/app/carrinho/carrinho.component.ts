import { Component, OnInit } from '@angular/core';
import { CarrinhoService } from '../carrinho.service';
import { IProdutoCarrinho } from '../produtos';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-carrinho',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './carrinho.component.html',
  styleUrl: './carrinho.component.css'
})
export class CarrinhoComponent implements OnInit{

  itensCarrinho: IProdutoCarrinho[] = [];
  total = 0;

  constructor (public carrinhoService: CarrinhoService) {}

  ngOnInit(): void {
    this.itensCarrinho = this.carrinhoService.obtemCarrinho();
    this.calcularTotal();
  }

  calcularTotal() {
    this.total = this.itensCarrinho.reduce((prev, curr) => (prev + curr.preco * curr.quantidade), 0);
  }

  removerProdutoCarrinho(produtoId: number) {
    this.itensCarrinho = this.itensCarrinho.filter(item => item.id !== produtoId);
    this.carrinhoService.removerProdutoCarrinho(produtoId);
  }

}
