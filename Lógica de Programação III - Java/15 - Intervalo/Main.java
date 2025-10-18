package Intervalo_15;

import java.util.Scanner;

/*
15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200; 
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        int numero;

        while (repete == true) {
            System.out.println("Verificar se o número está entre 100 e 200");
            System.out.println("Insira o número: ");
            numero = leitor.nextInt();

            leitor.nextLine();

            if ((numero > 100) && (numero < 200)) {
                System.out.println("O número " + numero + " está no intervalo entre 100 e 200");
            } else {
                System.out.println("O número " + numero + " não está no intervalo entre 100 e 200");
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
