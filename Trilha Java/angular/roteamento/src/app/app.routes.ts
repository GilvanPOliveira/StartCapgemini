import { Routes } from '@angular/router';
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';
import { PaginaNaoEncontradaComponent } from './pagina-nao-encontrada/pagina-nao-encontrada.component';
import { PaginaComParametrosComponent } from './pagina-com-parametros/pagina-com-parametros.component';
import { PaginaProtegidaComponent } from './pagina-protegida/pagina-protegida.component';
import { authGuard } from './auth.guard';
import { LoginComponent } from './login/login.component';

export const routes: Routes = [
  { path: 'primeira-pagina', component: PrimeiraPaginaComponent },
  { path: 'segunda-pagina', component: SegundaPaginaComponent },
  { path: "pagina-com-parametros/:id", component: PaginaComParametrosComponent },
  { path:"login", component: LoginComponent},
  { path:"pagina-protegida", component: PaginaProtegidaComponent, canActivate:[authGuard]},

  //lazy-Loading
  { path: 'lazy-loading', loadComponent: () => import('./lazy-loading/lazy-loading.component').then(m => m.LazyLoadingComponent) },

  // Esses campos de rotas, devem ficar sempre por último
  { path: "", redirectTo: "primeira-pagina", pathMatch: "full" },
  //"**" quando não houver caminho, ele cairá na página não econtrada
  { path: "**", component: PaginaNaoEncontradaComponent },
];
 