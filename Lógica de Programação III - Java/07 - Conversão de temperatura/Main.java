package ConversaoTemperatura_07;

import java.util.Scanner;

/*
7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de 
conversão é: "F=(9*C+160)/5", sendo "F" a temperatura em Fahrenheit e "C" a temperatura em Celsius;  
*/

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean repete = true;
        String check;
        float f = 0.0f;
        float c = 0.0f;
       
        while (repete == true){
 
            System.out.println("Converterndo a temperatura em graus Celsius para Fahrenheit");
            System.out.println("Insita a temperatura em graus Celsius: ");
            c = leitor.nextFloat();
            
            leitor.nextLine();
            
            f = (9 * c + 160) / 5;
            
            System.out.println("Sua temperatura em Fahrenheit é: " + f +"º");

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
