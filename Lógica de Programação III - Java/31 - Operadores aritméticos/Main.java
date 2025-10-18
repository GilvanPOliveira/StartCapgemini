package OperadoresAritmeticos_31;

import java.util.Scanner;

/*
31. Dados três valores A, B e C, em que A e B são números reais e C é um caractere,
pede-se para imprimir o resultado da operação de A por B se C for um símbolo de operador aritmético;
caso contrário deve ser impressa uma mensagem de operador não definido.
Tratar erro de divisão por zero.
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        while (repete) {
            
            System.out.print("Digite o valor de A: ");
            double a = leitor.nextDouble();

            System.out.print("Digite o valor de B: ");
            double b = leitor.nextDouble();

            leitor.nextLine(); 

            System.out.print("Digite o operador (+, -, *, /): ");
            char operador = leitor.nextLine().charAt(0);

            double resultado;
            boolean operadorValido = true;

            switch (operador) {
                case '+':
                    resultado = a + b;
                    System.out.printf("Resultado: %.2f + %.2f = %.2f%n", a, b, resultado);
                    break;
                case '-':
                    resultado = a - b;
                    System.out.printf("Resultado: %.2f - %.2f = %.2f%n", a, b, resultado);
                    break;
                case '*':
                    resultado = a * b;
                    System.out.printf("Resultado: %.2f * %.2f = %.2f%n", a, b, resultado);
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Erro: divisão por zero não é permitida!");
                    } else {
                        resultado = a / b;
                        System.out.printf("Resultado: %.2f / %.2f = %.2f%n", a, b, resultado);
                    }
                    break;
                default:
                    System.out.println("Operador não definido!");
                    operadorValido = false;
                    break;
            }

            System.out.println();
            
            System.out.println("Deseja realizar outra operação? (S) Sim - (N) Não");
            check = leitor.nextLine();

            if (check.equalsIgnoreCase("N")) {
                repete = false;
                leitor.close();
                break;
            }
        }
    }
}