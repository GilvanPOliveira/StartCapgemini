import { Routes } from '@angular/router';
import { Contato } from './contato/contato';
import { Carrinho } from './carrinho/carrinho';
import { Produto } from './produto/produto';
import { PaginaNaoEncontrada } from './pagina-nao-encontrada/pagina-nao-encontrada';


export const routes: Routes = [
  { path: 'produtos', loadComponent: () => import('./produtos/produtos').then(m => m.Produtos) },
  { path: 'produtos/:id', component: Produto },
  { path: 'carrinho', component: Carrinho },
  { path: 'contato', component: Contato },

  { path: '', redirectTo: 'produtos', pathMatch: 'full' },
  { path: '**', component: PaginaNaoEncontrada }
];
