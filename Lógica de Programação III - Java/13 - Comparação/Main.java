package Comparacao_13;

import java.util.Scanner;

/*
13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10; 
*/

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        
        boolean repete = true;
        String check;
        
        while (repete == true) {
            System.out.println("Verificador de números maiores que 10");
            System.out.println("Informe o número que deseja consultar: ");
            numero = leitor.nextInt();

            leitor.nextLine();
            
            if (numero > 10) {
                System.out.println("O número " + numero + " é maior que 10");
            } else {
                System.out.println("O número " + numero + " é menor que 10");              
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
