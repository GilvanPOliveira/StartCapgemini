package CondicionalComposta_20;

import java.util.Scanner;

/*
20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral; 
*/

public class Main {

    public static void main(String[] args) {
        Carros c = new Carros();
        Vendedor v = new Vendedor();
        Scanner leitor = new Scanner(System.in);

        boolean calcular = true;
        String continuar;
        float valorDesconto = 0.0f;
        int carros2000 = 0;
        int carros2001 = 0;

        v.setNome("Jose");

        while (calcular == true) {

            System.out.print("Digite o ano de fabricação do carro: ");
            c.setAnoFabricacao(leitor.nextInt());
            System.out.print("Digite o valor do carro: R$ ");
            c.setValor(leitor.nextFloat());
            leitor.nextLine(); // Limpar buffer

            if (c.getAnoFabricacao() <= 2000) {
                v.setDescontoVenda(c.getValor() * (0.12f));
                carros2000++;
            } else {
                v.setDescontoVenda(c.getValor() * (0.07f));
                carros2001++;
            }

            valorDesconto = (c.getValor() - v.getDescontoVenda());

            System.out.println("\n--- Valores pagos ---");
            System.out.println("Vendedor: " + v.getNome());
            System.out.println("Valor pago: " + valorDesconto);
            System.out.println("Valor descontado: " + v.getDescontoVenda());

            System.out.println("Deseja continuar? (S) Sim - (N) Não");
            continuar = leitor.nextLine();

            if (continuar.equalsIgnoreCase("N")) {
                calcular = false;
                System.out.println("Total de carros vendidos (fabricados até 2000): " + carros2000);
                System.out.println("Total de carros vendidos: " + (carros2001 + carros2000));
                leitor.close();
                break;
            }
        }

    }
}
