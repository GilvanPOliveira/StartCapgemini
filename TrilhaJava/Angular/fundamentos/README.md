<div align="center">
<a href="https://capgeminischool.brazilsouth.cloudapp.azure.com/">
<img src="https://i.imgur.com/CoK38mV.png" width="30%" />
</a>
</div>

## 📚 Fundamentos Angular

Este repositório reúne exemplos práticos dos **fundamentos do Angular**, organizados em componentes independentes para treinar os principais conceitos do framework na versão 18.

A aplicação funciona como um “laboratório” de estudo, onde cada card da tela demonstra um tópico específico:

- Criação de componentes standalone
- Templates, interpolação e event binding
- Pipes nativos e pipes customizados
- Two-way data binding com `ngModel`
- Renderização de listas com `*ngFor` e `ngClass`
- Comunicação entre componentes (Input/Output)
- Serviços, injeção de dependência e compartilhamento de estado
- Ciclo de vida dos componentes (OnInit, OnChanges, OnDestroy)

## 🚀 Estrutura do Projeto

Estrutura principal (simplificada):

```text
fundamentos/
├─ angular.json
├─ package.json
├─ server.ts                  # Suporte para SSR (Angular Universal)
├─ public/
│  ├─ camaleao.jpg
│  └─ favicon.ico
└─ src/
   ├─ main.ts
   └─ app/
      ├─ app.component.ts
      ├─ app.component.html   # Cards com todos os exemplos
      ├─ app.component.css
      ├─ app.config.ts
      ├─ app.routes.ts
      │
      ├─ primeiro-component/          # Primeiro componente simples
      ├─ segundo-component/           # Templates, interpolação, pipes e eventos
      ├─ pipe-customizado/            # Uso do pipe customizado
      ├─ multiplica-por.pipe.ts       # Pipe "multiplicaPor"
      ├─ two-way-data-binding/        # Two-way data binding com ngModel
      ├─ renderizando-listas/         # Listas, *ngFor, ngClass
      ├─ types/
      │  └─ Celular.ts                # Tipo usado na lista de celulares
      ├─ componente-personalizado/    # Componente com @Input
      ├─ componente-pai/              # Comunicação pai → filho → pai
      ├─ componente-filho/
      ├─ logger.service.ts            # Serviço de log compartilhado
      ├─ exemplo-servicos1/
      ├─ exemplo-servicos2/           # Exemplos de DI e uso de serviço
      ├─ ciclo-de-vida-pai/           # Input + binding para o ciclo de vida
      └─ ciclo-de-vida/               # OnInit, OnChanges, OnDestroy
```

## 🛠 Tecnologias Utilizadas

[![My Skills](https://skillicons.dev/icons?i=html,css,js,angular,typescript&perline=10)](https://github.com/GilvanPOliveira)

## 📬 Contato

Se tiver dúvidas ou sugestões, fique à vontade para entrar em contato:
- E-mail: gilvanoliveira06@gmail.com
- Portifólio: [Gilvan Oliveira](https://gilvanpoliveira.github.io/)

[<- Retornar](https://github.com/GilvanPOliveira/StartCapgemini/tree/main/TrilhaJava/Angular)