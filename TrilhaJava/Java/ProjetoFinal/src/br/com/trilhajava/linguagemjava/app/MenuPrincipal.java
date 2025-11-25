package br.com.trilhajava.linguagemjava.app;

/**
 *
 * @author Gilvan
 */

import br.com.trilhajava.linguagemjava.colecao.FilaAeronaves;
import br.com.trilhajava.linguagemjava.colecao.GerenciadorVoos;
import br.com.trilhajava.linguagemjava.datas.DataUtils;
import br.com.trilhajava.linguagemjava.modelo.*;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorVoos gerenciador = new GerenciadorVoos();
        FilaAeronaves<Voo> filaDecolagem = new FilaAeronaves<>();

        int opcao;
        do {
            System.out.println("\n=== SISTEMA DE GERENCIAMENTO DE VOOS ===");
            System.out.println("1 - Cadastrar voo");
            System.out.println("2 - Listar voos");
            System.out.println("3 - Cadastrar passageiro em um voo");
            System.out.println("4 - Gerenciar fila de decolagem");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = lerInt(sc);

            switch (opcao) {
                case 1 -> cadastrarVoo(sc, gerenciador, filaDecolagem);
                case 2 -> gerenciador.listarVoos();
                case 3 -> cadastrarPassageiroNoVoo(sc, gerenciador);
                case 4 -> gerenciarFila(sc, filaDecolagem);
                case 0 -> System.out.println("Encerrando o sistema.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void cadastrarVoo(Scanner sc, GerenciadorVoos gerenciador,
                                     FilaAeronaves<Voo> filaDecolagem) {
        try {
            System.out.print("Número do voo (int): ");
            Integer numero = lerInt(sc);

            System.out.print("Origem: ");
            String origem = sc.nextLine();

            System.out.print("Destino: ");
            String destino = sc.nextLine();

            System.out.print("Data e hora (dd/MM/yyyy HH:mm): ");
            String textoData = sc.nextLine();
            Date dataHora = DataUtils.parse(textoData);

            Voo v = new Voo(numero, origem, destino, dataHora);
            gerenciador.adicionarVoo(v);
            filaDecolagem.adicionarNaFila(v);

            System.out.println("Voo cadastrado e incluído na fila de decolagem.");
        } catch (ParseException e) {
            System.out.println("Data inválida: " + e.getMessage());
        }
    }

    private static void cadastrarPassageiroNoVoo(Scanner sc, GerenciadorVoos gerenciador) {
        System.out.print("Número do voo: ");
        Integer numeroVoo = lerInt(sc);
        Voo v = gerenciador.buscarPorNumero(numeroVoo);

        if (v == null) {
            System.out.println("Voo não encontrado.");
            return;
        }

        System.out.print("ID do passageiro: ");
        Integer id = lerInt(sc);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("E-mail: ");
        String email = sc.nextLine();

        Passageiro p = new Passageiro(id, nome, email);
        v.adicionarPassageiro(p);

        System.out.println("Passageiro cadastrado no voo " + numeroVoo + ".");
    }

    private static void gerenciarFila(Scanner sc, FilaAeronaves<Voo> filaDecolagem) {
        if (filaDecolagem.estaVazia()) {
            System.out.println("Fila vazia.");
            return;
        }

        System.out.println("1 - Ver próximo voo");
        System.out.println("2 - Decolar próximo voo (remover da fila)");
        System.out.println("3 - Listar fila de decolagem");
        System.out.print("Escolha: ");
        int opc = lerInt(sc);

        switch (opc) {
            case 1 -> System.out.println("Próximo: " + filaDecolagem.proximo());
            case 2 -> {
                Voo v = filaDecolagem.removerPrimeiro();
                v.setStatus(StatusVoo.DECOLADO);
                System.out.println("Voo decolado: " + v);
            }
            case 3 -> filaDecolagem.listarTodos();
            default -> System.out.println("Opção inválida.");
        }
    }

    private static int lerInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Valor inválido. Digite um número inteiro: ");
            sc.nextLine();
        }
        int valor = sc.nextInt();
        sc.nextLine(); 
        return valor;
    }
}
