package TrocaValores_06;

import java.util.Scanner;

/*
6. Leia dois valores para as variáveis "A" e "B", e efetuar as trocas dos valores de forma que a variável "A" passe a 
possuir o valor da variável "B" e a variável "B" passe a possuir o valor da variável "A". Apresentar os valores trocados;  
*/

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;
        int a, b;
       
        while (repete == true){
            
            System.out.println("Para trocar os valores das variáveis inseridas:");
            System.out.println("Insira o primeiro valor: ");
            a = leitor.nextInt();
            System.out.println("Insira o segundo valor: ");
            b = leitor.nextInt();
            
            leitor.nextLine();
            
            int temp = a;
            a = b;
            b = temp;
            
            System.out.println("Os valores trocados são: " + a + " e " + b);
            
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