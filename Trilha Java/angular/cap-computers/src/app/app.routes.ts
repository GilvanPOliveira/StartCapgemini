import { Routes } from '@angular/router';
import { PaginaNaoEncontradaComponent } from './pagina-nao-encontrada/pagina-nao-encontrada.component';

export const routes: Routes = [
  {path: "produtos", loadComponent: () => import('./produtos/produtos.component').then(m => m.ProdutosComponent)},
  {path:"", redirectTo: "produtos", pathMatch: "full"},

  

  {path: "**", component:PaginaNaoEncontradaComponent}
];
