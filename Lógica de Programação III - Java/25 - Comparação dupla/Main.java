package ComparacaoDupla_25;

import java.util.Scanner;

/*
25. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o 
maior, e uma mensagem que são diferentes;
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        while (repete == true) {

            int[] numeros = new int[2];

            System.out.println("Verificação de dois números");
            System.out.println("Insira o primeiro número: ");
            numeros[0] = leitor.nextInt();
            System.out.println("Insira o segundo número: ");
            numeros[1] = leitor.nextInt();

            leitor.nextLine();

            if (numeros[0] == numeros[1]) {
                System.out.println("Os números informados são iguais");
            } else if (numeros[0] > numeros[1]) {
                System.out.println("O primeiro número é maior que o segundo");
            } else {
                System.out.println("O segundo número é maior que o primeiro");
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
