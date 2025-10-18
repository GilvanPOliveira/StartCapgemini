package Ordenacao_30;

import java.util.Scanner;

/*
30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente.
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        while (repete) {
            
            System.out.println("Digite três valores inteiros distintos:");

            System.out.print("Primeiro valor: ");
            int a = leitor.nextInt();

            System.out.print("Segundo valor: ");
            int b = leitor.nextInt();

            System.out.print("Terceiro valor: ");
            int c = leitor.nextInt();

            leitor.nextLine(); 

            int menor, meio, maior;

            if (a < b && a < c) {
                menor = a;
                if (b < c) {
                    meio = b;
                    maior = c;
                } else {
                    meio = c;
                    maior = b;
                }
            } else if (b < a && b < c) {
                menor = b;
                if (a < c) {
                    meio = a;
                    maior = c;
                } else {
                    meio = c;
                    maior = a;
                }
            } else {
                menor = c;
                if (a < b) {
                    meio = a;
                    maior = b;
                } else {
                    meio = b;
                    maior = a;
                }
            }

            System.out.println("Os valores em ordem crescente são: "+ menor + ", " + meio + ", " + maior);

            System.out.println();
            
            System.out.println("Deseja testar novamente? (S) Sim - (N) Não");
            check = leitor.nextLine();

            if (check.equalsIgnoreCase("N")) {
                repete = false;
                leitor.close();
                break;
            }
        }
    }
}
