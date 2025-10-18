package MediaAritmetica_05;

import java.util.Scanner;

/*
5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
No final informar o nome do aluno e a sua média (aritmética); 
*/

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno a = new Aluno();
        
        boolean repete = true;
        String check;
        float mediaAluno = 0.00f;
       
        while (repete == true){
            
            System.out.println("Para saber a média do aluno no semestre, informe o nome do aluno e suas respectivas notas");
            System.out.println("Insira o nome do aluno: ");
            a.setNome(leitor.nextLine());
            System.out.println("Insira a primeira nota: ");
            a.setNota1(leitor.nextFloat());
            System.out.println("Insira a segunda nota: ");
            a.setNota2(leitor.nextFloat());
            System.out.println("Insira a terceira nota: ");
            a.setNota3(leitor.nextFloat());
            
            leitor.nextLine();
            
            mediaAluno = ((a.getNota1() + a.getNota2() + a.getNota3()) / 3);
            
            System.out.println("A média de " + a.getNome() + " nesse semestre é: " + mediaAluno); 

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