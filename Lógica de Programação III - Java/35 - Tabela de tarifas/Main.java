package TabelaTarifas_35;

import java.util.Scanner;

/*
35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa.
Sabe-se que o cálculo da conta de luz segue a tabela abaixo:

Tipo de Cliente      Valor do KW/h
a. Residência  →  R$ 0,60
b. Comércio    →  R$ 0,48
c. Indústria   →  R$ 1,29
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        while (repete) {
            System.out.println("Cálculo da Conta de Luz");
            System.out.print("Informe o nome do cliente: ");
            String nome = leitor.nextLine();

            System.out.print("Informe o tipo de cliente (R - Residência / C - Comércio / I - Indústria): ");
            String tipo = leitor.nextLine().toUpperCase();

            System.out.print("Informe o consumo em KW/h: ");
            double consumo = leitor.nextDouble();
            leitor.nextLine(); 

            double valorKWh = 0.0;
            double total;

            switch (tipo) {
                case "R":
                    valorKWh = 0.60;
                    break;
                case "C":
                    valorKWh = 0.48;
                    break;
                case "I":
                    valorKWh = 1.29;
                    break;
                default:
                    System.out.println("Tipo de cliente inválido! Use R, C ou I.");
                    System.out.println();
                    continue;
            }

            total = consumo * valorKWh;

            System.out.println();
            
            System.out.println("Conta de Luz");
            System.out.println("Cliente: " + nome);
            System.out.printf("Tipo de cliente: %s%n", tipo.equals("R") ? "Residência" : tipo.equals("C") ? "Comércio" : "Indústria");
            System.out.printf("Consumo: %.2f KW/h%n", consumo);
            System.out.printf("Valor do KW/h: R$ %.2f%n", valorKWh);
            System.out.printf("Valor total da conta: R$ %.2f%n", total);

            System.out.println();
            
            System.out.println("Deseja calcular outra conta? (S) Sim - (N) Não");
            check = leitor.nextLine();

            if (check.equalsIgnoreCase("N")) {
                repete = false;
                leitor.close();
                break;
            }
        }
    }
}
