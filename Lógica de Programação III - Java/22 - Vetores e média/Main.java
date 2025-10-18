package VetoresMedia_22;

import java.util.Scanner;

/*
22. Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado 
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor 
de venda de cada produto, a média de preço de custo e do preço de venda; 
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;

        while (repete == true) {

            float[] precoCusto = new float[40];
            float[] precoVenda = new float[40];
            float[] lucro = new float[40];
            float[] empate = new float[40];
            float[] prejuizo = new float[40];

            float somaVenda = 0.0f;
            float somaCusto = 0.0f;

            System.out.println("Orçamento das vendas realizadas");

            for (var i = 0; i < 40; i++) {
                System.out.println("Informe o preço de custo do produto: ");
                precoCusto[i] = leitor.nextFloat();
                System.out.println("Informe o preço de venda do produto: ");
                precoVenda[i] = leitor.nextFloat();

                somaCusto += precoCusto[i];
                somaVenda += precoVenda[i];
            }

            for (var j = 0; j < 40; j++) {
                if (precoCusto[j] == precoVenda[j]) {
                    empate[j] = precoVenda[j];
                } else if (precoCusto[j] < precoVenda[j]) {
                    lucro[j] = precoVenda[j] - precoCusto[j];
                } else if (precoCusto[j] > precoVenda[j]) {
                    prejuizo[j] = precoVenda[j] - precoCusto[j];
                }
            }

            System.out.println();

            System.out.println("Resultado do orçamento efetuado");
            
            for (var r = 0; r < 40; r++) {
                System.out.print("Custo R$ " + precoCusto[r] + " - Venda R$ " + precoVenda[r]);
                
                if (lucro[r] != 0) {
                    System.out.print(" - Lucro R$ " + lucro[r]);
                }
                if (empate[r] != 0) {
                    System.out.print(" - Empate R$ " + empate[r]);
                }
                if (prejuizo[r] != 0) {
                    System.out.print(" - Prejuízo R$ " + prejuizo[r]);
                }
                System.out.println();
            }

            leitor.nextLine();
            
            somaCusto = somaCusto / 40;
            somaVenda = somaVenda / 40;

            System.out.println();
            
            System.out.println("Média de preço de custo: R$ " + somaCusto);
            System.out.println("Média de preço de venda: R$ " + somaVenda);

            System.out.println();

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
