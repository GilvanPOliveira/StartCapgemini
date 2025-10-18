package MultiplasCondicoes_23;

import java.util.Scanner;

/*
23. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80, 
menor que 25 ou igual a 40; 
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        int numero = 0;

        while (repete == true) {

            System.out.println("Informe o número que deseja consultar: ");
            numero = leitor.nextInt();

            if (numero > 80) {
                System.out.println("O número é maior que 80");
            } else if (numero < 25) {
                System.out.println("O número é menor que 25");
            } else if (numero == 40){
                System.out.println("O número é igual a 40");
            } else {
                System.out.println("O número " + numero + " não está dentro do que foi solicitado");
            }
            

            leitor.nextLine();

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
