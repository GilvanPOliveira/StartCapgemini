package LacoRepeticao_18;

import java.util.Scanner;

/*
18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e 
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade; 
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        String[] nome = new String[75];
        int[] idade = new int[75];

        while (repete == true) {
            System.out.println("Verificação de idade");

            for (var i = 0; i < 75; i++) {
                System.out.println("Insira o nome da pessoa: ");
                nome[i] = leitor.nextLine();
                System.out.println("Insira a idade da pessoa: ");
                idade[i] = leitor.nextInt();
                leitor.nextLine();

                if (idade[i] >= 18) {
                    System.out.println(nome[i] + " é maior de idade");
                } else {
                    System.out.println(nome[i] + " é menor de idade");
                }
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
