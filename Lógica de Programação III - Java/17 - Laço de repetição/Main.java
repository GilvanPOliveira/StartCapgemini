package LacoRepeticao_17;

import java.util.Scanner;

/*
17. Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive); 
*/

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        int[] numeros = new int[80];
        int resultado = 0;

        while (repete == true) {
            System.out.println("Verificar números, se est(á)ão no intervalor entre 10 e 150");
            for (var i = 0; i < 80; i++) {
                System.out.println("Insira o número desejado: ");
                numeros[i] = leitor.nextInt();
                if ((numeros[i] >= 10) && (numeros[i] <= 150)) {
                    resultado++;
                }
            }

            leitor.nextLine();

            System.out.println("Existem " + resultado + " entre 10 e 150");
            resultado = 0;
            
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
