import { Injectable } from '@angular/core';
import { IProdutoCarrinho } from '../produtos';

@Injectable({
  providedIn: 'root',
})
export class CarrinhoService {
   itens: IProdutoCarrinho[] = [];
  
  constructor() {}

  obtemCarrinho() {
    const itens = localStorage.getItem("carrinho");
    this.itens = itens ? JSON.parse(itens) : [];
    return this.itens;
  }

  adicionarAoCarrinho(produto: IProdutoCarrinho) {
    const itemExistente = this.itens.find(item => item.id === produto.id);

    if (itemExistente) {
      itemExistente.quantidade += produto.quantidade;
    } else {
      this.itens.push(produto);
    }

    localStorage.setItem("carrinho", JSON.stringify(this.itens));
  } 

  removerProdutoCarrinho(produtoId: number) {
    this.itens = this.itens.filter(item => item.id !== produtoId);
    localStorage.setItem("carrinho", JSON.stringify(this.itens));
  }

  limparCarrinho() {
    this.itens = [];
    localStorage.removeItem("carrinho");
  }
 
}
