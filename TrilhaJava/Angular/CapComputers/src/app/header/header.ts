import { Component } from '@angular/core';
import { CarrinhoService } from '../carrinho.service';
import { BarraPesquisa } from "../barra-pesquisa/barra-pesquisa";
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-header',
  imports: [BarraPesquisa, RouterModule],
  templateUrl: './header.html',
  styleUrl: './header.css',
})
export class Header {

  constructor(
    public carrinhoService: CarrinhoService
  ) { }

}