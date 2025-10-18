package SwitchCase_26;

import java.util.Scanner;

/*
26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número 
que não esteja neste intervalo, exibir a seguinte mensagem: número inválido; 
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        while (repete == true) {

            System.out.println("Digite um número de 1 a 5: ");
            int numero = leitor.nextInt();

            leitor.nextLine(); 
            
            System.out.println();

            switch (numero) {
                case 1:
                    System.out.println("1 - Um");
                    break;
                case 2:
                    System.out.println("2 - Dois");
                    break;
                case 3:
                    System.out.println("3 - Três");
                    break;
                case 4:
                    System.out.println("4 - Quarto");
                    break;
                case 5:
                    System.out.println("5 - Cinco");
                    break;
                default:
                    System.out.println("Número inválido!");
                    break;
            }

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
