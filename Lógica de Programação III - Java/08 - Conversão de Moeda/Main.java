package ConversaoMoeda_08;

import java.util.Scanner;

/*
8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com ousuário; 
*/

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;
        float dollar = 0.00f;
        float qtdDollar = 0.00f;
        float totalReal = 0.00f;
       
        while (repete == true){
 
            System.out.println("Convertendo de Dólar para Real");
            System.out.println("Insita o valor da cotação atual do Dólar (hoje): ");
            dollar = leitor.nextFloat();
            System.out.println("Insira a quantidade de Dólares que possui: ");
            qtdDollar = leitor.nextFloat();
           
            leitor.nextLine();
           
            totalReal = dollar * qtdDollar;
            
            System.out.println("Você possui R$ " + totalReal + " reais");

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