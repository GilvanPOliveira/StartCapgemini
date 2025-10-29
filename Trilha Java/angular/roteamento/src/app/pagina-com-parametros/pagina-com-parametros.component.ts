import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-pagina-com-parametros',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './pagina-com-parametros.component.html',
  styleUrl: './pagina-com-parametros.component.css'
})
export class PaginaComParametrosComponent implements OnInit {

  id: number | null = null;
  idade: number | null = null;
  nome: string | null = "";

  constructor (private router: ActivatedRoute) {}

  ngOnInit(): void { 
    this.router.paramMap.subscribe(params =>  {
      this.id = Number(params.get("id"));
    });

    this.router.queryParamMap.subscribe( params => {
      this.idade = Number(params.get("idade"));
      this.nome = params.get("nome");
    })
  }

}
