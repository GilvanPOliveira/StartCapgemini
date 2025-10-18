package ClassificacaoIdade_34;

import java.util.Scanner;

/*
34. Elabore um algoritmo que, dada a idade de um nadador, classifique-o em uma das seguintes categorias:

a. Infantil A = 5 - 7 anos;
b. Infantil B = 8 - 10 anos;
c. Juvenil A = 11 - 13 anos;
d. Juvenil B = 14 - 17 anos;
e. Sênior = 18 - 25 anos.

Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado.
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        while (repete) {
            System.out.println("Classificação de Nadador");
            System.out.print("Informe o nome do nadador: ");
            String nome = leitor.nextLine();

            System.out.print("Informe a idade do nadador: ");
            int idade = leitor.nextInt();
            leitor.nextLine();

            System.out.println();
            
            System.out.println("Nadador: " + nome);
            System.out.println("Idade: " + idade + " anos");

            if (idade >= 5 && idade <= 7) {
                System.out.println("Categoria: Infantil A");
            } else if (idade >= 8 && idade <= 10) {
                System.out.println("Categoria: Infantil B");
            } else if (idade >= 11 && idade <= 13) {
                System.out.println("Categoria: Juvenil A");
            } else if (idade >= 14 && idade <= 17) {
                System.out.println("Categoria: Juvenil B");
            } else if (idade >= 18 && idade <= 25) {
                System.out.println("Categoria: Sênior");
            } else {
                System.out.println("Idade fora da faixa etária!");
            }

            System.out.println();
            
            System.out.println("Deseja classificar outro nadador? (S) Sim - (N) Não");
            check = leitor.nextLine();

            if (check.equalsIgnoreCase("N")) {
                repete = false;
                leitor.close();
                break;
            }
        }
    }
}
