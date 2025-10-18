package EstruturaRepeticao_27;

import java.util.Scanner;

/*
27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um 
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser 
calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). 
Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos 
clientes; 
*/

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;

        float valorVeiculo = 0.0f;
        String combustivel;
        float valorDesconto = 0.0f;
        float valorPago = 0.0f;
        float totalDescontos = 0.0f;
        float totalPago = 0.0f;

        while (repete == true) {

            System.out.println("Concessionária CARANGO");
            System.out.println("Informe o valor do veículo (ou coloque 0(zero) para encerrar o programa: ");
            valorVeiculo = leitor.nextFloat();

            if (valorVeiculo == 0.0f) {
                repete = false;
                break;
            }

            leitor.nextLine();

            System.out.print("Informe o tipo de combustível (A - Álcool / G - Gasolina / D - Diesel): ");
            combustivel = leitor.nextLine().toUpperCase();

            switch (combustivel) {
                case "A":
                    valorDesconto = valorVeiculo * 0.25f;
                    break;
                case "G":
                    valorDesconto = valorVeiculo * 0.21f;
                    break;
                case "D":
                    valorDesconto = valorVeiculo * 0.14f;
                    break;
                default:
                    System.out.println("Tipo de combustível inválido!");
                    continue;
            }

            valorPago = valorVeiculo - valorDesconto;

            System.out.println("Desconto: R$ " + valorDesconto);
            System.out.println("Valor a pagar: R$ " + valorPago);

            totalDescontos += valorDesconto;
            totalPago += valorPago;
        }
        
        System.out.println();

        System.out.println("Resumo das vendas: ");
        System.out.println("Total de descontos concedidos: R$ " + totalDescontos);
        System.out.println("Total pago pelos clientes: R$ " + totalPago);

        leitor.close();
    }
}