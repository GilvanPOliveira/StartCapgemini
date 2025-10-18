package TabelaNiveis_33;

import java.util.Scanner;

/*
33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula.
Faça um algoritmo que calcule e exiba o salário de um professor.
Sabe-se que o valor da hora/aula segue a tabela abaixo:

a. Professor Nível 1 → R$12,00 por hora/aula;
b. Professor Nível 2 → R$17,00 por hora/aula;
c. Professor Nível 3 → R$25,00 por hora/aula.
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        while (repete) {
            
            System.out.println("Escola Aprender");
            System.out.print("Informe o nome do professor: ");
            String nome = leitor.nextLine();

            System.out.print("Informe o nível do professor (1, 2 ou 3): ");
            int nivel = leitor.nextInt();

            System.out.print("Informe a quantidade de horas/aula dadas no mês: ");
            int horas = leitor.nextInt();

            leitor.nextLine(); 

            double valorHora = 0.0;
            double salario;

            switch (nivel) {
                case 1:
                    valorHora = 12.00;
                    break;
                case 2:
                    valorHora = 17.00;
                    break;
                case 3:
                    valorHora = 25.00;
                    break;
                default:
                    System.out.println("Nível inválido! Deve ser 1, 2 ou 3.");
                    leitor.nextLine();
                    continue;
            }

            salario = horas * valorHora;

            System.out.printf("%nProfessor: %s%n", nome);
            System.out.printf("Nível: %d%n", nivel);
            System.out.printf("Valor da hora/aula: R$ %.2f%n", valorHora);
            System.out.printf("Horas trabalhadas: %d%n", horas);
            System.out.printf("Salário a receber: R$ %.2f%n", salario);

            System.out.println();
            
            System.out.println("Deseja calcular o salário de outro professor? (S) Sim - (N) Não");
            check = leitor.nextLine();

            if (check.equalsIgnoreCase("N")) {
                repete = false;
                leitor.close();
                break;
            }
        }
    }
}
