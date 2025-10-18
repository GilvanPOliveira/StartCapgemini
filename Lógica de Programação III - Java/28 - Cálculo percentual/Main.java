package CalculoPercentual_28;

import java.util.Scanner;

/*
28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários
de acordo com os seguintes critérios:

a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos;
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d. 10% para os demais funcionários.

Leia o nome do funcionário, seu salário e o valor do salário mínimo.
Calcule o novo salário reajustado. Escreva o nome do funcionário, o reajuste e seu novo salário.
Calcule quanto a empresa vai aumentar sua folha de pagamento.
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int totalFuncionarios = 584;
        String nome;
        float salario, salarioMinimo, novoSalario, reajuste;

        boolean repete = true;
        String check;

        while (repete == true) {
            float totalAumento = 0.0f;

            System.out.println("Reajuste Salarial da Empresa");
            System.out.print("Informe o valor atual do salário mínimo: R$ ");
            salarioMinimo = leitor.nextFloat();

            leitor.nextLine();

            for (int i = 1; i <= totalFuncionarios; i++) {
                System.out.println("Funcionário " + i);
                System.out.print("Nome: ");
                nome = leitor.nextLine();

                System.out.print("Salário atual: R$ ");
                salario = leitor.nextFloat();

                leitor.nextLine();

                if (salario < 3 * salarioMinimo) {
                    reajuste = salario * 0.50f;
                } else if (salario <= 10 * salarioMinimo) {
                    reajuste = salario * 0.20f;
                } else if (salario <= 20 * salarioMinimo) {
                    reajuste = salario * 0.15f;
                } else {
                    reajuste = salario * 0.10f;
                }

                novoSalario = salario + reajuste;
                totalAumento += reajuste;

                System.out.println("Funcionário: " + nome);
                System.out.printf("Reajuste: R$ %.2f%n", reajuste);
                System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
            }

            System.out.println("Resumo do Reajuste:");
            System.out.println("A empresa aumentará sua folha de pagamento em: R$ " + totalAumento);

            System.out.println();

            System.out.println("Deseja continuar? (S) Sim - (N) Não");
            check = leitor.nextLine();

            if (check.equalsIgnoreCase("N")) {
                repete = false;
                leitor.close();
                break;
            }
        }
    }
}
