package JurosSimples_09;

import java.util.Scanner;

/*
9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um 
mês. Considere fixo o juro da poupança em 0,07% a. m; 
*/

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;
        float valorDepositado = 0.0f;
        float renda = 0.0f;
        float juros = 0.07f; 
       
        while (repete == true){
 
            System.out.println("Desmonstrativo de rendimentos");
            System.out.println("Insira o valor depositado: ");
            valorDepositado = leitor.nextFloat();
            
            leitor.nextLine();
            
            renda = valorDepositado + (valorDepositado * juros);
            
            System.out.println("Seu valor rendeu ao mês R$ " + renda);

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