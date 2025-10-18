package CondicionalSimples_04;

import java.util.Scanner;

/*
4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
*/

public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        Scanner leitor = new Scanner(System.in);

        float comissao = 0.00f;
        boolean repete = true;
        String check;
       
        while (repete == true){
            
            System.out.println("Informe o nome do vendedor: ");
            v.setNome(leitor.nextLine());
            System.out.println("Informe o salário do vendedor: ");
            v.setSalarioFixo(leitor.nextFloat());
            System.out.println("Informe o total de vendas do vendedor (R$): ");
            v.setTotalVendas(leitor.nextFloat());
            
            leitor.nextLine();
            
            comissao = v.getSalarioFixo() + (v.getTotalVendas() * 0.15f);
            
            System.out.println("Nome do vendedor: " + v.getNome());
            System.out.println("Salário do vendedor: " + v.getSalarioFixo());
            System.out.println("Salário do vendedor mais comissão: " + comissao);            

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
