import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { ActivatedRoute, RouterLink } from '@angular/router';
import { IProduto } from '../../produtos';
import { ProdutosService } from '../produtos.service';

@Component({
  selector: 'app-produtos',
  imports: [CommonModule, RouterLink],
  templateUrl: './produtos.html',
  styleUrl: './produtos.css',
})
export class Produtos {
  produtos: IProduto[] = [];
  produtosFiltrados: IProduto[] = [];
  termoBusca: string = '';

  constructor(
    private produtosService: ProdutosService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.produtos = this.produtosService.getAll();

    this.route.queryParams.subscribe(params => {
      const termo = params['descricao'] ? params['descricao'].trim().toLowerCase() : '';
      this.termoBusca = termo;
      if (termo) {
        this.filtrarProdutos(termo);
      } else {
        this.produtosFiltrados = [...this.produtos];
      }
    });
  }

  filtrarProdutos(termo: string) {
    const normalizar = (texto: string) =>
      texto.normalize('NFD').replace(/[\u0300-\u036f]/g, '').toLowerCase();

    const termoNormalizado = normalizar(termo);

    this.produtosFiltrados = this.produtos.filter(produto =>
      normalizar(produto.descricao).includes(termoNormalizado)
    );
  }
}