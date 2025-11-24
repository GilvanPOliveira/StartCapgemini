package br.com.trilhajava.cadastro;

/**
 *
 * @author Gilvan
 */

public class Pessoa {

    private String nome;
    private String situacaoPessoa;

    public Pessoa() {
    }

    public Pessoa(String nome, String situacaoPessoa) {
        this.nome = nome;
        this.situacaoPessoa = situacaoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacaoPessoa() {
        return situacaoPessoa;
    }

    public void setSituacaoPessoa(String situacaoPessoa) {
        this.situacaoPessoa = situacaoPessoa;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Situação: " + situacaoPessoa;
    }
}
