package OperacoesBasicas_02;

import java.util.Scanner;

/*
2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois números lidos; 
*/

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float[] numeros = new float[2];
        float soma, subtracao, multiplicacao;
        float divisao;
        
        boolean repete = true;
        String check;
       
        while (repete == true){
            System.out.println("Insira os dois números que deseja vizualizar as operações matemáticas:");
            System.out.println("Insira o primeiro número: ");
            numeros[0] = leitor.nextFloat();
            System.out.println("Insira o segundo número: ");
            numeros[1] = leitor.nextFloat();
            
            leitor.nextLine();

            soma = numeros[0] + numeros[1];
            subtracao = numeros[0] - numeros[1];
            multiplicacao = numeros[0] * numeros[1];
            divisao = numeros[0] / numeros[1];

            System.out.println("O resultado da Somas dos dois números é: " + soma);
            System.out.println("O resultado da Subtração dos dois números é: " + subtracao);
            System.out.println("O resultado da Multiplicação dos dois números é: " + multiplicacao);
            System.out.println("O resultado da Divisão dos dois números é: " + divisao);

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
