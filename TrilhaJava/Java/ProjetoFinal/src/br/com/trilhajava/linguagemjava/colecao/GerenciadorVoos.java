package br.com.trilhajava.linguagemjava.colecao;

/**
 *
 * @author Gilvan
 */

import br.com.trilhajava.linguagemjava.modelo.Voo;
import br.com.trilhajava.linguagemjava.modelo.Passageiro;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorVoos {

    private List<Voo> voos = new ArrayList<>();

    public void adicionarVoo(Voo v) {
        voos.add(v);
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public Voo buscarPorNumero(Integer numero) {
        for (Voo v : voos) { 
            if (v.getNumero().equals(numero)) {
                return v;
            }
        }
        return null;
    }

    public void listarVoos() {
        System.out.println("=== Lista de Voos ===");
        for (Voo v : voos) {
            System.out.println(v);
        }
    }

    public void listarPassageirosDoVoo(Integer numeroVoo) {
        Voo v = buscarPorNumero(numeroVoo);
        if (v == null) {
            System.out.println("Voo não encontrado.");
            return;
        }

        System.out.println("Passageiros do voo " + numeroVoo + ":");
        for (Passageiro p : v.getPassageiros()) {
            System.out.println(p);
        }
    }
}
