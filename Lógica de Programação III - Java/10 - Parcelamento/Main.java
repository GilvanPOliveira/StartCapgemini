package Parcelamento_10;

import java.util.Scanner;

/*
10. A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. Faça um 
algoritmo que receba um valor de uma compra e mostre o valor das prestações; 
*/

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;
        float valorCompra = 0.0f;
        float valorPago = 0.0f;
        int prestacao = 5;
       
        while (repete == true){

            System.out.println("Valor da compra Loja Mamão com Açúcar");
            System.out.println("Valor total da compra realizada: ");
            valorCompra = leitor.nextFloat();
            
            leitor.nextLine();
            
            valorPago = valorCompra / prestacao;
            
            System.out.println("O valor pago será 5 (cinco) prestações de R$ " + valorPago);

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