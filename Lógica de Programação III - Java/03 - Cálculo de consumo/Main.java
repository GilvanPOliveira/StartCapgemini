package CalculoConsumo_03;

import java.util.Scanner;

/*
3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância 
total percorrida pelo automóvel e o total de combustível gasto; 
*/

public class Main {
    public static void main(String[] args) {
        float totalGasolina = 0.00f;
        float totalKm = 0.00f;
        float consumoMedio = 0.00f;
        
        Scanner leitor = new Scanner(System.in);
        boolean repete = true;
        String check;
       
        while (repete == true){
            
            System.out.println("Insira os dados abaixo para saber o consumo médio utilizado");
            System.out.println("Insira o total gasto com combustível: ");
            totalGasolina = leitor.nextFloat();
            System.out.println("Insira o total de quilômetros percorrido: ");
            totalKm = leitor.nextFloat();
            
            leitor.nextLine();
            
            consumoMedio = totalKm / totalGasolina;
            
            System.out.println("A média de consumo é: " + consumoMedio);

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
