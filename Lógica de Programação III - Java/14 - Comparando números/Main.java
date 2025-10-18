package CompararNumeros_14;

import java.util.Scanner;

/*
14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior; 
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[2];

        boolean repete = true;
        String check;

        while (repete == true) {
            System.out.println("Comparação entre dois números: Qual é o maior");

            System.out.println("Insira o primeiro número: ");
            numeros[0] = leitor.nextInt();
            System.out.println("Insira o segundo número: ");
            numeros[1] = leitor.nextInt();

            leitor.nextLine();
            
            if (numeros[0] == numeros[1]) {
                System.out.println("Os números devem ser distintos. Tente novamente.");
            } else if (numeros[0] > numeros[1]) {
                System.out.println("O número " + numeros[0] + " é maior que " + numeros[1]);
            } else if (numeros[0] < numeros[1]) {
                System.out.println("O número " + numeros[1] + " é maior que " + numeros[0]);
            }

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
