package br.com.trilhajava.cadastro;

/**
 *
 * @author Gilvan
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroPessoas {

    private static final List<Pessoa> pessoas = new ArrayList<>();

    public static void executarCadastro(Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n=== CADASTRO DE PESSOAS ===");
            System.out.println("1 - Cadastrar Pessoa Física");
            System.out.println("2 - Cadastrar Pessoa Jurídica");
            System.out.println("3 - Listar todas as pessoas");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro(scanner);

            switch (opcao) {
                case 1 -> cadastrarPessoaFisica(scanner);
                case 2 -> cadastrarPessoaJuridica(scanner);
                case 3 -> listarPessoas();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void cadastrarPessoaFisica(Scanner scanner) {
        System.out.println("\n--- Cadastro de Pessoa Física ---");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Situação (A = Ativo, I = Inativo): ");
        String situacao = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Identidade: ");
        String identidade = scanner.nextLine();

        Fisica f = new Fisica(nome, situacao, cpf, identidade);
        pessoas.add(f);

        System.out.println("Pessoa física cadastrada com sucesso!");
    }

    private static void cadastrarPessoaJuridica(Scanner scanner) {
        System.out.println("\n--- Cadastro de Pessoa Jurídica ---");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Situação (A = Ativo, I = Inativo): ");
        String situacao = scanner.nextLine();

        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();

        System.out.print("Inscrição Estadual: ");
        String inscEstadual = scanner.nextLine();

        Juridica j = new Juridica(nome, situacao, cnpj, inscEstadual);
        pessoas.add(j);

        System.out.println("Pessoa jurídica cadastrada com sucesso!");
    }

    private static void listarPessoas() {
        System.out.println("\n--- LISTA DE PESSOAS CADASTRADAS ---");

        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
            return;
        }

        for (Pessoa p : pessoas) {
            System.out.println(p);
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
}
