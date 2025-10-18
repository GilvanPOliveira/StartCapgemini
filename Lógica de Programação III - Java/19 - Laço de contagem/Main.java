package LacoContagem_19;

import java.util.Scanner;

/*
19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou 
mulher. No final informe total de homens e de mulheres; 
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        String[] nome = new String[56];
        String[] genero = new String[56];
        int homem = 0;
        int mulher = 0;
        int naoDefinido = 0;

        while (repete == true) {
            System.out.println("Separação e Quantitativo por Gênero");

            for (var i = 0; i < 56; i++) {
                System.out.println("Informe o nome da pessoa: ");
                nome[i] = leitor.nextLine();
                System.out.println("Informe o gênero da pessoa: ");
                genero[i] = leitor.nextLine();

                if (genero[i].equalsIgnoreCase("homem")) {
                    homem++;
                } else if (genero[i].equalsIgnoreCase("mulher")) {
                    mulher++;
                } else {
                    naoDefinido++;
                }
            }

            System.out.println("Existem " + homem + " homens cadastrados: ");
            for (var h = 0; h < 56; h++) {
                if (genero[h].equalsIgnoreCase("homem")) {
                    System.out.println(nome[h] + " - " + genero[h]);
                }
            }

            System.out.println("Existem " + mulher + " mulheres cadastradas: ");
            for (var m = 0; m < 56; m++) {
                if (genero[m].equalsIgnoreCase("mulher")) {
                    System.out.println(nome[m] + " - " + genero[m]);
                }
            }
            System.out.println("Existem " + naoDefinido + " cadastros com gêneros não definidos");

            homem = 0;
            mulher = 0;
            naoDefinido = 0;

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
