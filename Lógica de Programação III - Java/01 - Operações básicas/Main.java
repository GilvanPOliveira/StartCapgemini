package OperacoesBasicas_01;

/*
1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma; 
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean repete = true;
        String check;
        int num1, num2, soma;
        
        while (repete == true) {
            System.out.println("Insira os dois números que deseja somar");
            System.out.println("Insira o primeiro número: ");
            num1 = leitor.nextInt();
            System.out.println("Insira o segundo número: ");
            num2 = leitor.nextInt();
            soma = num1 + num2;
            
            leitor.nextLine();
            
            System.out.println("O resultado da soma é: " + soma);
            
            System.out.println("Deseja continuar? (S) Sim - (N) Não");
            check = leitor.nextLine();
            
            if(check.equalsIgnoreCase("N")) {
                repete = false;
                leitor.close();
                break;
            }
        }
    }
}
