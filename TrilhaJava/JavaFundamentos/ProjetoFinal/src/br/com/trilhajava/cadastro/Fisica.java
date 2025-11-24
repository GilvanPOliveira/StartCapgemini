package br.com.trilhajava.cadastro;

/**
 *
 * @author Gilvan
 */

public class Fisica extends Pessoa {

    private String cpf;
    private String identidade;

    public Fisica() {
    }

    public Fisica(String nome, String situacao, String cpf, String identidade) {
        super(nome, situacao);
        this.cpf = cpf;
        this.identidade = identidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    @Override
    public String toString() {
        return "[Pessoa Física] " + super.toString()
                + " | CPF: " + cpf
                + " | Identidade: " + identidade;
    }
}
