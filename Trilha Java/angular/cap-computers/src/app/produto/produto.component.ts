import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route } from '@angular/router';
import { ProdutosService } from '../produtos.service';
import { IProduto, IProdutoCarrinho } from '../produtos';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { NotificacaoService } from '../notificacao.service';
import { CarrinhoService } from '../carrinho.service';

@Component({
  selector: 'app-produto',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './produto.component.html',
  styleUrl: './produto.component.css'
})
export class ProdutoComponent implements OnInit {
  produto: IProduto | undefined;
  quantidade = 1;

  constructor(private produtosService: ProdutosService, private route: ActivatedRoute, private notificacaoService: NotificacaoService, private carrinhoService: CarrinhoService
  ) {}

  ngOnInit(): void {
    const routeParams = this.route.snapshot.paramMap;
    const produtoId = Number(routeParams.get("id"));
    this.produto = this.produtosService.getOne(produtoId);
  }

  adicionarAoCarrinho (){
    this.notificacaoService.notificar("O produto foi adicionado ao carrinho");
    const produto: IProdutoCarrinho = {
      ...this.produto!, 
      quantidade: this.quantidade,
    }
    this.carrinhoService.adicionarAoCarrinho(produto);
  }
}
