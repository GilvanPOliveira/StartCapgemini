import { Routes } from '@angular/router';
import { PaginaNaoEncontradaComponent } from './pagina-nao-encontrada/pagina-nao-encontrada.component';
import { ProdutoComponent } from './produto/produto.component';

export const routes: Routes = [
  { path: 'produtos', loadComponent: () => import('./produtos/produtos.component').then(m => m.ProdutosComponent) },
  { path: 'produtos/:id', component: ProdutoComponent },
  { path: '', redirectTo: 'produtos', pathMatch: 'full' },
  
  { path: '**', component: PaginaNaoEncontradaComponent }
];

