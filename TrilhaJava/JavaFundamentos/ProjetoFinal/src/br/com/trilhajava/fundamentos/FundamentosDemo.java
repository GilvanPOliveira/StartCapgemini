package br.com.trilhajava.fundamentos;

/**
 *
 * @author Gilvan
 */

import java.util.Scanner;

public class FundamentosDemo {

    public static void executarFundamentos(Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n=== FUNDAMENTOS JAVA ===");
            System.out.println("1 - Mostrar tipos de dados");
            System.out.println("2 - Calcular média de 3 notas e verificar aprovação");
            System.out.println("3 - Ler dados simples de uma pessoa");
            System.out.println("4 - Tabuada de um número");
            System.out.println("5 - Contagem regressiva");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro(scanner);

            switch (opcao) {
                case 1 -> mostrarTipos();
                case 2 -> calcularMediaEVerificarAprovacao(scanner);
                case 3 -> lerDadosPessoaSimples(scanner);
                case 4 -> menuTabuada(scanner);
                case 5 -> contagemRegressiva(scanner);
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    private static void mostrarTipos() {
        System.out.println("\n--- TIPOS DE DADOS E LITERAIS ---");

        int idade = 25;
        double salario = 3500.75;
        float altura = 1.80f;
        char sexo = 'M';
        boolean ativo = true;
        String nome = "Fulano da Silva";

        System.out.println("int idade = " + idade);
        System.out.println("double salario = " + salario);
        System.out.println("float altura = " + altura);
        System.out.println("char sexo = " + sexo);
        System.out.println("boolean ativo = " + ativo);
        System.out.println("String nome = " + nome);
    }

    private static void calcularMediaEVerificarAprovacao(Scanner scanner) {
        System.out.println("\n--- MÉDIA E SITUAÇÃO DO ALUNO ---");

        System.out.print("Digite a primeira nota: ");
        double n1 = lerDouble(scanner);

        System.out.print("Digite a segunda nota: ");
        double n2 = lerDouble(scanner);

        System.out.print("Digite a terceira nota: ");
        double n3 = lerDouble(scanner);

        double media = (n1 + n2 + n3) / 3.0;
        System.out.printf("Média: %.2f%n", media);

        if (media >= 7.0) {
            System.out.println("Situação: APROVADO");
        } else if (media >= 5.0) {
            System.out.println("Situação: RECUPERAÇÃO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
    }

    private static void lerDadosPessoaSimples(Scanner scanner) {
        System.out.println("\n--- DADOS DE UMA PESSOA ---");

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a idade: ");
        int idade = lerInteiro(scanner);

        System.out.println("Pessoa cadastrada: " + nome + " tem " + idade + " anos.");
    }

    private static void menuTabuada(Scanner scanner) {
        System.out.println("\n--- TABUADA ---");

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = lerInteiro(scanner);

        System.out.println("\nTabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    private static void contagemRegressiva(Scanner scanner) {
        System.out.println("\n--- CONTAGEM REGRESSIVA ---");

        System.out.print("Digite um número para iniciar a contagem regressiva: ");
        int numero = lerInteiro(scanner);

        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
    }

    private static int lerInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Valor inválido. Digite um número inteiro: ");
            scanner.nextLine();
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); 
        return valor;
    }

    private static double lerDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Digite um número (ex: 7.5): ");
            scanner.nextLine();
        }
        double valor = scanner.nextDouble();
        scanner.nextLine(); 
        return valor;
    }
}
