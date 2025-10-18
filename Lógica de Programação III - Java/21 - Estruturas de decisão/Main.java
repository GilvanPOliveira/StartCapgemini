package EstruturaDecisao_21;

import java.util.Scanner;

/*
21. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta 
ou não para cumprir o serviço militar obrigatório. Informe os totais; 
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        int apto;
        int naoApto;

        while (repete == true) {

            apto = 0;
            naoApto = 0;

            System.out.println("Serviço Militar Obrigatório");
            System.out.println("Quantas pessoas serão cadastradas?");
            int n = leitor.nextInt();

            leitor.nextLine();

            String[] nome = new String[n];
            String[] sexo = new String[n];
            int[] idade = new int[n];
            String[] saude = new String[n];

            for (var i = 0; i < n; i++) {
                System.out.println("Informe o seu nome: ");
                nome[i] = leitor.nextLine();
                System.out.println("Informe o seu gênero: ");
                sexo[i] = leitor.nextLine();
                System.out.println("Informe sobre sua saúde: ");
                saude[i] = leitor.nextLine();
                System.out.println("Informe a sua idade: ");
                idade[i] = leitor.nextInt();

                leitor.nextLine();

                if ((idade[i] >= 18) && (saude[i].equalsIgnoreCase("boa"))) {
                    apto++;
                } else {
                    naoApto++;
                }
            }

            System.out.println("\nAptos ao Serviço Militar Obrigatório (" + apto + "): ");
            for (var a = 0; a < n; a++) {
                if ((idade[a] >= 18) && (saude[a].equalsIgnoreCase("boa"))) {
                    System.out.println("Nome: " + nome[a] + " - Sexo: " + sexo[a] + " - Idade: " + idade[a] + " - Saúde: " + saude[a]);
                }
            }

            System.out.println("Inaptos ao Serviço Militar Obrigatório (" + naoApto + "): ");
            for (var a = 0; a < n; a++) {
                if (((idade[a]) < 18) || (!saude[a].equalsIgnoreCase("boa"))) {
                    System.out.println("Nome: " + nome[a] + " - Sexo: " + sexo[a] + " - Idade: " + idade[a] + " - Saúde: " + saude[a]);
                }
            }

            System.out.println("\nTotal de Aptos: " + apto);
            System.out.println("Total de Inaptos: " + naoApto);

            System.out.println("Deseja continuar? (S) Sim - (N) Não");
            check = leitor.nextLine();

            if (check.equalsIgnoreCase("N")) {
                repete = false;
                break;
            }
        }
        leitor.close();
    }
}
