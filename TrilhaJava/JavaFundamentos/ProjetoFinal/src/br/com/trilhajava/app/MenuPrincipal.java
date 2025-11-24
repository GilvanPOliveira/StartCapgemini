package br.com.trilhajava.app;

/**
 *
 * @author Gilvan
 */

import br.com.trilhajava.cadastro.CadastroPessoas;
import br.com.trilhajava.fundamentos.FundamentosDemo;
import br.com.trilhajava.polimorfismo.RelatorioMamiferos;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== PROJETO FINAL – FUNDAMENTOS JAVA ===");
            System.out.println("1 - Fundamentos (tipos, operadores, laços, etc.)");
            System.out.println("2 - Cadastro de Pessoas (Herança)");
            System.out.println("3 - Relatório de Mamíferos (Polimorfismo)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro(scanner);

            switch (opcao) {
                case 1 -> FundamentosDemo.executarFundamentos(scanner);
                case 2 -> CadastroPessoas.executarCadastro(scanner);
                case 3 -> RelatorioMamiferos.executarPolimorfismo();
                case 0 -> System.out.println("Encerrando o programa. Até mais!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
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
