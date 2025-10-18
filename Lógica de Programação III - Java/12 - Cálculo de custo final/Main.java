package CalculoCustoFinal_12;

import java.util.Scanner;

/*
12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e 
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual 
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do 
mesmo; 
*/

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float custoFabrica = 0.0f;
        float percentualDistribuidor = 0.28f;
        float impostosAplicados = 0.45f;
        float custoConsumidor = 0.0f;
        
        boolean repete = true;
        String check;
        
        while (repete == true) {
            
            System.out.println("Custo de um veículo para o Consumidor");
            System.out.println("Informe o valor de custo para a fábrica: ");
            custoFabrica = leitor.nextFloat();
            
            leitor.nextLine();
            
            float temp = custoConsumidor;
            temp = (custoFabrica + (custoFabrica * impostosAplicados));
            custoConsumidor = (temp + (temp * percentualDistribuidor));
            
            System.out.println("O valor do veículo para o consumidor é R$ " + custoConsumidor);
            
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
