<div align="left"><img src="https://i.imgur.com/CoK38mV.png" width="25%" /></div>

## 📚 Roteamento Angular

Este repositório contém um projeto de estudo focado em **roteamento com Angular 18**, utilizando **standalone components** e **Angular Router**.

A aplicação demonstra, de forma simples e prática:

- Criação e configuração de rotas
- Navegação programática com `Router`
- Uso de `routerLink` e `<router-outlet>`
- Rotas com **parâmetros** e **query params**
- Rotas protegidas com **Auth Guard**
- Simulação de login com **AuthService** e `sessionStorage`
- Tratamento de rota padrão (redirect) e rota coringa (**404**)
- Exemplo de **lazy loading** de componente via `loadComponent`

## 🚀 Estrutura do Projeto

```
roteamento/
├─ angular.json
├─ package.json
├─ server.ts                   # Suporte para SSR (opcional)
└─ src/
   ├─ main.ts
   └─ app/
      ├─ app.component.ts
      ├─ app.component.html    # Menu com routerLink + router-outlet
      ├─ app.component.css
      ├─ app.config.ts         # provideRouter(routes), provideClientHydration
      ├─ app.routes.ts         # Definição das rotas
      │
      ├─ primeira-pagina/
      ├─ segunda-pagina/
      ├─ pagina-com-parametros/
      ├─ pagina-protegida/
      ├─ pagina-nao-encontrada/
      ├─ login/
      ├─ lazy-loading/
      │
      ├─ auth.service.ts       # Lógica de autenticação (token fake em sessionStorage)
      └─ auth.guard.ts         # Guard de rota (CanActivateFn)
```

## 🛠 Tecnologias Utilizadas

[![My Skills](https://skillicons.dev/icons?i=html,css,js,angular,typescript&perline=10)](https://github.com/GilvanPOliveira)

## 📬 Contato

Se tiver dúvidas ou sugestões, fique à vontade para entrar em contato:
- E-mail: gilvanoliveira06@gmail.com
- Portifólio: [Gilvan Oliveira](https://gilvanpoliveira.github.io/)

[Retornar](https://github.com/GilvanPOliveira/StartCapgemini/tree/main/TrilhaJava/Angular)