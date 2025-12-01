<div align="center">
<a href="https://capgeminischool.brazilsouth.cloudapp.azure.com/">
<img src="https://i.imgur.com/CoK38mV.png" width="30%" />
</a>
</div>

## 💻 CapComputers

O **CapComputers** é uma loja virtual fictícia de produtos de informática desenvolvida em **Angular 20**.  
O projeto foi criado com foco em prática de:

- Single Page Application (SPA) com **Angular standalone components**
- **Rotas** e navegação entre páginas
- **Serviços** para regra de negócio e compartilhamento de dados
- Persistência simples com **LocalStorage**
- Formulários reativos (**Reactive Forms**) e validações
- Feedback ao usuário com **notificações (snack bar)**

A aplicação simula uma experiência básica de e-commerce, com listagem de produtos, detalhes, carrinho de compras e página de contato.

## 📚 Funcionalidades

### 🛒 Catálogo de Produtos

- Página principal `/produtos` listando todos os produtos disponíveis.
- Dados centralizados em `src/produtos.ts` (interfaces e lista estática de produtos).
- Cada card exibe:
  - Imagem do produto
  - Descrição
  - Preço formatado em BRL
  - Texto auxiliar (ex: “À vista no PIX”)
- Clique no produto leva para a rota de detalhes (`/produtos/:id`).

### 🔍 Barra de Pesquisa

- Componente `BarraPesquisa` no header.
- Input de busca que filtra produtos pela descrição.
- Filtro **case-insensitive** e com normalização de acentos.

### 📄 Detalhe do Produto

- Página de detalhes acessada por `/produtos/:id`.
- Exibe informações completas do produto selecionado.
- Botão para **adicionar ao carrinho**.
- Usa `ProdutosService` para buscar o produto correto.

### 🧺 Carrinho de Compras

- Página `/carrinho`.
- Mostra os itens adicionados com:
  - Imagem
  - Descrição
  - Preço unitário
  - Campo de **quantidade** editável
- Cálculo automático do **total da compra**.
- Possibilidade de:
  - Remover itens do carrinho
  - Limpar o carrinho
- Persistência simples via **LocalStorage** (`CarrinhoService`).

### ✉️ Página de Contato

- Página `/contato`.
- Formulário reativo com validações:
  - Nome com tamanho mínimo
  - E-mail em formato válido
  - Campo de mensagem obrigatório
- Exibição de mensagens de erro abaixo dos campos inválidos.
- Envio do formulário dispara ação de feedback/validação no front-end.

### 🚫 Página Não Encontrada

- Rota curinga `**` redireciona para o componente `PaginaNaoEncontrada`.
- Tratamento amigável para URLs inválidas.

### 🍞 Notificações

- `NotificacaoService` encapsula o uso de **MatSnackBar**.
- Exibe mensagens como “O produto foi adicionado ao carrinho” no topo da tela.

## 🚀 Estrutura do Projeto

Estrutura principal (simplificada):

```text
CapComputers/
├─ angular.json
├─ package.json
├─ public/
│  └─ assets/
│     ├─ mouse-*.jpg
│     ├─ monitor-*.jpg
│     ├─ teclado-*.jpg
│     ├─ fone-de-ouvido-*.jpg
│     ├─ hd.jpg
│     └─ outros arquivos de imagem
└─ src/
   ├─ main.ts
   ├─ produtos.ts              # Interfaces e lista de produtos
   └─ app/
      ├─ app.ts                # Componente raiz (standalone)
      ├─ app.html              # Template raiz (header + router-outlet + footer)
      ├─ app.css               # Estilos globais do app
      ├─ app.routes.ts         # Definição de rotas
      ├─ app.config.ts         # Configuração da aplicação
      ├─ header/               # Cabeçalho e menu de navegação
      ├─ footer/               # Rodapé
      ├─ barra-pesquisa/      # Componente da barra de busca
      ├─ produtos/            # Lista de produtos
      ├─ produto/             # Detalhe do produto
      ├─ carrinho/            # Página do carrinho
      ├─ contato/             # Página de contato (Reactive Forms)
      ├─ pagina-nao-encontrada/  # 404 amigável
      ├─ produtos.service.ts  # Serviço de produtos
      ├─ carrinho.service.ts  # Serviço do carrinho (LocalStorage)
      └─ notificacao.service.ts # Serviço de notificações (snackbar)
```

## 🛠 Tecnologias Utilizadas

[![My Skills](https://skillicons.dev/icons?i=html,css,js,angular,typescript&perline=10)](https://github.com/GilvanPOliveira)

## 📬 Contato

Se tiver dúvidas ou sugestões, fique à vontade para entrar em contato:
- E-mail: gilvanoliveira06@gmail.com
- Portifólio: [Gilvan Oliveira](https://gilvanpoliveira.github.io/)

[<- Retornar](https://github.com/GilvanPOliveira/StartCapgemini/tree/main/TrilhaJava/Angular)