<div align="center">
<a href="https://capgeminischool.brazilsouth.cloudapp.azure.com/">
<img src="https://i.imgur.com/CoK38mV.png" width="30%" />
</a>
</div>

## 📚 Sobre o Projeto

Este projeto é o **Projeto Final de Linguagem Java** da Trilha Java, reunindo em uma única aplicação de console os principais conceitos da linguagem estudados ao longo do curso.

A aplicação simula um **Sistema de Gerenciamento de Voos**, onde é possível:

- Cadastrar voos com número, origem, destino e data/hora
- Manter uma lista de voos cadastrados
- Cadastrar passageiros e associá-los a um voo
- Gerenciar uma **fila de decolagem** utilizando coleções e generics
- Atualizar o status do voo (AGENDADO, EMBARQUE, DECOLADO, CANCELADO)
- Listar voos e passageiros, utilizando laços e *for-each*
- Trabalhar com datas (`Date`, `SimpleDateFormat`) para horários de voo

O objetivo é **integrar** o uso de:

- Construtores, classes, objetos
- `enum`, `interface` e polimorfismo
- Arrays, listas (`ArrayList`, `LinkedList`) e generics
- Laços de repetição e estruturas de decisão
- Manipulação de datas

Tudo acessado por um **menu principal** em modo console.

## 🚀 Estrutura do Projeto

A organização foi feita por pacotes, refletindo as responsabilidades de cada parte do sistema:

### `br.com.trilhajava.linguagemjava.app`

- **`MenuPrincipal`**  
  Classe com o método `main`, responsável por:
  - Exibir o menu principal da aplicação
  - Ler as opções do usuário (via `Scanner`)
  - Direcionar para:
    - Cadastro e listagem de voos
    - Cadastro de passageiros em voos
    - Gerenciamento da fila de decolagem

### `br.com.trilhajava.linguagemjava.modelo`

- **`Voo`**  
  Representa um voo com:
  - `numero` (Integer)
  - `origem`, `destino` (String)
  - `dataHora` (Date)
  - `status` (enum `StatusVoo`)
  - Lista de passageiros (`List<Passageiro>`)  
  Possui métodos para adicionar passageiros e exibir um resumo do voo.

- **`Passageiro`**  
  Representa um passageiro com:
  - `id` (Integer)
  - `nome` (String)
  - `email` (String)  
  Implementa a interface `Notificavel` para simular envio de notificações.

- **`StatusVoo`** (`enum`)  
  Define os possíveis estados de um voo:
  - `AGENDADO`
  - `EMBARQUE`
  - `DECOLADO`
  - `CANCELADO`

- **`Notificavel`** (`interface`)  
  Define o contrato:
  ```java
  void notificar(String mensagem);
  ```
  Implementado por Passageiro, permitindo simular notificações relacionadas ao voo.

### `br.com.trilhajava.linguagemjava.colecao`

- **`GerenciadorVoos`**
  Responsável por manter e manipular uma lista de voos (List<Voo>):
  - `Adicionar novos voos`
  - `Buscar voo por número`
  - `Listar todos os voos`
  - `Listar passageiros de um voo específico`

- **`FilaAeronaves<T>`**
  Classe genérica que gerencia uma fila de decolagem, inspirada nos exercícios de generics:
  - `Armazena elementos em uma LinkedList<T>`
  - `Permite:`
    - `Adicionar na fila`
    - `Obter o próximo da fila`
    - `Remover o primeiro`
    - `Listar toda a fila`
    Em tempo de execução, é usada como FilaAeronaves<Voo>.

### `br.com.trilhajava.linguagemjava.datas`
  - `DataUtils`
  Classe utilitária para tratar datas de voo:
    - `Conversão de String para Date com SimpleDateFormat`
    - `Formatação de Date para texto no padrão dd/MM/yyyy HH:mm`
    Centraliza a lógica de parsing/format, facilitando o uso no MenuPrincipal.

## 🛠 Tecnologias Utilizadas

[![My Skills](https://skillicons.dev/icons?i=java,n&perline=10)](https://github.com/GilvanPOliveira)


## 📬 Contato

Se tiver dúvidas ou sugestões, fique à vontade para entrar em contato:
- E-mail: **gilvanoliveira06@gmail.com**
- Portifólio: [Gilvan Oliveira](https://gilvanpoliveira.github.io/)

[<- Retornar](https://github.com/GilvanPOliveira/StartCapgemini/tree/main/TrilhaJava/Java)
