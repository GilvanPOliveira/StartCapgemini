package MediaStatus_16;

import java.util.Scanner;

/*
16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9); 
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        float nota1, nota2, nota3, media;
        String nome;

        while (repete == true) {
            System.out.println("Média aritmética de um aluno durante o semestre");
            System.out.println("Informe o nome do Aluno: ");
            nome = leitor.nextLine();
            System.out.println("Informe a primeira nota: ");
            nota1 = leitor.nextFloat();
            System.out.println("Informe a segunda nota: ");
            nota2 = leitor.nextFloat();
            System.out.println("Informe a terceira nota: ");
            nota3 = leitor.nextFloat();

            leitor.nextLine();

            media = ((nota1 + nota2 + nota3) / 3);

            if (media >= 7.0) {
                System.out.println(nome + " está aprovado no semestre, com média " + media);
            } else if (media <= 5.0) {
                System.out.println(nome + " está reprovado no semestre, com média " + media);
            } else if ((media >= 5.1) && (media <= 6.9)) {
                System.out.println(nome + " está recuperação no semestre, com média " + media);
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
