package br.com.trilhajava.polimorfismo;

/**
 *
 * @author Gilvan
 */

public abstract class Mamifero {

    public abstract double cotaDiariaLeite();

    public String getDescricao() {
        return this.getClass().getSimpleName();
    }
}
