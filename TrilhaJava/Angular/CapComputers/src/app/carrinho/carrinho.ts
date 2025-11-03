import { Component } from '@angular/core';
import { CarrinhoService } from '../carrinho.service';
import { Router } from '@angular/router';
import { NotificacaoService } from '../notificacao.service';
import { IProdutoCarrinho } from '../../produtos';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-carrinho',
  imports: [CommonModule, FormsModule],
  templateUrl: './carrinho.html',
  styleUrl: './carrinho.css',
})
export class Carrinho {

  itensCarrinho: IProdutoCarrinho[] = [];
  total = 0;
 
  constructor (public carrinhoService: CarrinhoService, private router: Router, private notificacaoService: NotificacaoService) {}

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
    this.calcularTotal();
  } 

  comprar() {
    this.notificacaoService.notificar("Parabéns, você finalizou a sua compra!");
    this.carrinhoService.limparCarrinho();
    this.router.navigate(["produtos"]);
  }

}
