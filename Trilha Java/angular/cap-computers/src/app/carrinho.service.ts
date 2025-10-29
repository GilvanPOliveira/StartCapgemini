import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CarrinhoService {
  private itens: any[] = [];
  
  constructor() {}

  obtemCarrinho(): any[] {
    return this.itens;
  }

  adicionarItem(item: any) {
    this.itens.push(item);
  }

  limparCarrinho() {
    this.itens = [];
  }
}
