package Geometria_32;

import java.util.Scanner;

/*
32. Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos
outros dois lados.
a. Triângulo Equilátero: três lados iguais;
b. Triângulo Isóscele: dois lados iguais;
c. Triângulo Escaleno: três lados diferentes.
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        while (repete) {
            
            System.out.println("Verificação de Triângulo");
            System.out.print("Informe o lado A: ");
            int a = leitor.nextInt();

            System.out.print("Informe o lado B: ");
            int b = leitor.nextInt();

            System.out.print("Informe o lado C: ");
            int c = leitor.nextInt();

            leitor.nextLine();

            System.out.println();
            
            if (a < b + c && b < a + c && c < a + b) {
                System.out.println("Os valores formam um triângulo.");

                if (a == b && b == c) {
                    System.out.println("Tipo: Triângulo Equilátero");
                } else if (a == b || a == c || b == c) {
                    System.out.println("Tipo: Triângulo Isóscele");
                } else {
                    System.out.println("Tipo: Triângulo Escaleno");
                }

            } else {
                System.out.println("Os valores informados NÃO formam um triângulo.");
            }
            
            System.out.println();

            System.out.println("Deseja verificar outro triângulo? (S) Sim - (N) Não");
            check = leitor.nextLine();

            if (check.equalsIgnoreCase("N")) {
                repete = false;
                leitor.close();
                break;
            }
        }
    }
}
