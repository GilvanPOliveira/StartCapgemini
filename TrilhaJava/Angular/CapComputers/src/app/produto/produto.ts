import { Component } from '@angular/core';
import { IProduto, IProdutoCarrinho } from '../../produtos';
import { CarrinhoService } from '../carrinho.service';
import { ActivatedRoute, Router } from '@angular/router';
import { ProdutosService } from '../produtos.service';
import { NotificacaoService } from '../notificacao.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-produto',
  imports: [CommonModule, FormsModule],
  templateUrl: './produto.html',
  styleUrl: './produto.css',
})
export class Produto {
 produto: IProduto | undefined;
  quantidade = 1;

  constructor(private produtosService: ProdutosService, private route: ActivatedRoute, private notificacaoService: NotificacaoService, private carrinhoService: CarrinhoService, private router: Router
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
    this.router.navigate(["produtos"]);
  }

  voltar() {
  this.router.navigate(["/produtos"]);
  }

}
