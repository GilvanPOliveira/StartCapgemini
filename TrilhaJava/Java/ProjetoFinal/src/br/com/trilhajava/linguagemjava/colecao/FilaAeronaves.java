package br.com.trilhajava.linguagemjava.colecao;

/**
 *
 * @author Gilvan
 */

import java.util.LinkedList;
import java.util.List;

public class FilaAeronaves<T> {

    private List<T> fila = new LinkedList<>();

    public void adicionarNaFila(T elemento) {
        fila.add(elemento);
    }

    public T proximo() {
        if (fila.isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        return fila.get(0);
    }

    public T removerPrimeiro() {
        if (fila.isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        return fila.remove(0);
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public void listarTodos() {
        System.out.println("=== Fila de decolagem ===");
        for (T t : fila) {      
            System.out.println(t);
        }
    }
}
