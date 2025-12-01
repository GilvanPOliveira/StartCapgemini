<div align="center">
<a href="https://capgeminischool.brazilsouth.cloudapp.azure.com/">
<img src="https://i.imgur.com/CoK38mV.png" width="30%" />
</a>
</div>

## 📚 Sobre o Projeto

Este projeto reúne, em uma aplicação única de console, os principais conceitos estudados em **Fundamentos de Java** dentro da Trilha Java do programa Start Capgemini.

A ideia é funcionar como um **projeto integrador**, onde você consegue testar na prática:

- Tipos de dados, literais e operadores
- Entrada de dados pelo console (`Scanner`)
- Estruturas de decisão (`if/else`, `switch`)
- Laços de repetição (`for`, `while`, `do-while`)
- Criação de classes e objetos
- Herança (`extends`)
- Polimorfismo com classes abstratas e sobrescrita de métodos
- Organização de código em pacotes

A aplicação é acessada por um **menu principal** com três módulos:

1. **Fundamentos** – demonstrações de tipos, operadores, laços e entrada de dados  
2. **Cadastro de Pessoas** – herança com `Pessoa`, `Fisica` e `Juridica`  
3. **Relatório de Mamíferos** – polimorfismo com `Mamifero` e subclasses

## 🚀 Estrutura do Projeto

A estrutura foi organizada em pacotes para refletir os tópicos de estudo:

- `br.com.trilhajava.app`  
  - **`MenuPrincipal`**  
    Classe com o método `main`.  
    Exibe o menu principal da aplicação e direciona para:
    - Módulo de Fundamentos
    - Módulo de Cadastro de Pessoas
    - Módulo de Polimorfismo (Mamíferos)

- `br.com.trilhajava.fundamentos`  
  - **`FundamentosDemo`**  
    Submenu que reúne exemplos práticos de:
    - Tipos de dados e literais (`mostrarTipos`)
    - Cálculo de média e verificação de aprovação (`calcularMediaEVerificarAprovacao`)
    - Leitura de dados simples de pessoa (`lerDadosPessoaSimples`)
    - Geração de tabuada (`menuTabuada`)
    - Contagem regressiva (`contagemRegressiva`)

- `br.com.trilhajava.cadastro`  
  - **`Pessoa`**  
    Classe base com atributos comuns (`nome`, `situacaoPessoa`).
  - **`Fisica`**  
    Subclasse de `Pessoa`, com campos específicos (`cpf`, `identidade`).
  - **`Juridica`**  
    Subclasse de `Pessoa`, com campos específicos (`cnpj`, `inscEstadual`).
  - **`CadastroPessoas`**  
    Submenu responsável por:
    - Cadastrar **Pessoa Física**
    - Cadastrar **Pessoa Jurídica**
    - Listar todas as pessoas cadastradas  
    Utiliza uma `List<Pessoa>` e demonstra herança + polimorfismo em `toString()`.

- `br.com.trilhajava.polimorfismo`  
  - **`Mamifero`**  
    Classe abstrata com o método `cotaDiariaLeite()`.
  - **`Elefante`**, **`Rato`**, **`Vaca`**  
    Implementações concretas de `Mamifero`, cada uma com sua cota diária de leite.
  - **`RelatorioMamiferos`**  
    Gera um relatório polimórfico:
    - Cria uma lista de `Mamifero`
    - Percorre a lista chamando `cotaDiariaLeite()` em cada instância
    - Exibe a cota individual e o total de leite necessário por dia.

## 🛠 Tecnologias Utilizadas

[![My Skills](https://skillicons.dev/icons?i=java,n&perline=10)](https://github.com/GilvanPOliveira)

## 📬 Contato

Se tiver dúvidas ou sugestões, fique à vontade para entrar em contato:
- E-mail: gilvanoliveira06@gmail.com
- Portifólio: [Gilvan Oliveira](https://gilvanpoliveira.github.io/)

[<- Retornar](https://github.com/GilvanPOliveira/StartCapgemini/tree/main/TrilhaJava/JavaFundamentos)