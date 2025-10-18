package LacoSinal_24;

import java.util.Scanner;

/*
24. Faça um algoritmo que receba “N” números e mostre se cada número é positivo, negativo ou zero.
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        while (repete) {

            System.out.println("Quantos números deseja informar: ");
            int n = leitor.nextInt();

            int[] numeros = new int[n];
            
            for (int i = 0; i < n; i++) {
                System.out.print("Informe o número " + (i + 1) + ": ");
                numeros[i] = leitor.nextInt();
            }
            
            leitor.nextLine();
            
            System.out.println();
            System.out.println("Resultado");
            for (int i = 0; i < n; i++) {
                if (numeros[i] > 0) {
                    System.out.println("O número " + numeros[i] + " é POSITIVO.");
                } else if (numeros[i] < 0) {
                    System.out.println("O número " + numeros[i] + " é NEGATIVO.");
                } else {
                    System.out.println("O número " + numeros[i] + " é ZERO.");
                }
            }

            System.out.println();
            System.out.println("Deseja executar novamente? (S) Sim - (N) Não");
            check = leitor.nextLine();

            if (check.equalsIgnoreCase("N")) {
                repete = false;
                leitor.close();
                break;
            }
        }
    }
}
