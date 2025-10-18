package PercentualVenda_11;

import java.util.Scanner;

/*
11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o 
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário; 
*/

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;
        float precoVenda = 0.0f;
        float precoCusto = 0.0f;
        float percentualVenda = 0.0f;
       
        while (repete == true){
 
            System.out.println("Precificação de Produtos");
            System.out.println("Informe o valor do custo do produto: ");
            precoCusto = leitor.nextFloat();
            System.out.println("Informe o valor do percentual, que deseja trabalhar: ");
            percentualVenda = leitor.nextFloat();
            
            leitor.nextLine();
            
            precoVenda = precoCusto + (precoCusto * (percentualVenda / 100));
            
            System.out.println("O valor de venda do produto será R$ " + precoVenda);

            System.out.println("Deseja continuar? (S) Sim - (N) Não");
            check = leitor.nextLine();
            
            if(check.equalsIgnoreCase("N")) {
                repete = false;
                leitor.close();
                break;
            }
        }
    }
}