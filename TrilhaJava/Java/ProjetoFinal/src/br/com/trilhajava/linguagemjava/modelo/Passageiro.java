package br.com.trilhajava.linguagemjava.modelo;

/**
 *
 * @author Gilvan
 */

public class Passageiro implements Notificavel {

    private Integer id;
    private String nome;
    private String email;

    public Passageiro(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificando " + nome + " (" + email + "): " + mensagem);
    }

    @Override
    public String toString() {
        return "Passageiro " + id + " - " + nome + " (" + email + ")";
    }
}
