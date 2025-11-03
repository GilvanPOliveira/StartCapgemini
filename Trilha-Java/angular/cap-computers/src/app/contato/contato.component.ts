import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, ReactiveFormsModule, Validators } from '@angular/forms';
import { NgxMaskDirective, provideNgxMask } from 'ngx-mask';
import { NotificacaoService } from '../notificacao.service';

@Component({
  selector: 'app-contato.component',
  imports: [ReactiveFormsModule, CommonModule, NgxMaskDirective],
  providers: [provideNgxMask()], 
  templateUrl: './contato.component.html',
  styleUrl: './contato.component.css',
})
export class ContatoComponent {
  formContato: any;

  constructor(private fb: FormBuilder, private notificacaoService: NotificacaoService) {}

  ngOnInit(): void {
    this.formContato = this.fb.group({
      nome: ["", [Validators.minLength(4), Validators.required]],
      assunto: ["", [Validators.minLength(10), Validators.required]],
      telefone: ['', [Validators.minLength(11), Validators.required]],
      email: ["", [Validators.email, Validators.required]],
      mensagem: ["", [Validators.minLength(20), Validators.required]],
    });
  }

  enviarFormulario() {
    this.notificacaoService.notificar("Mensagem enviada com sucesso!");
    this.formContato.reset();
  }

}