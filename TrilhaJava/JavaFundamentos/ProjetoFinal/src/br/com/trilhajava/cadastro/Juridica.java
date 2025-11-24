package br.com.trilhajava.cadastro;

/**
 *
 * @author Gilvan
 */

public class Juridica extends Pessoa {

    private String cnpj;
    private String inscEstadual;

    public Juridica() {
    }

    public Juridica(String nome, String situacao, String cnpj, String inscEstadual) {
        super(nome, situacao);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    @Override
    public String toString() {
        return "[Pessoa Jurídica] " + super.toString()
                + " | CNPJ: " + cnpj
                + " | Inscrição Estadual: " + inscEstadual;
    }
}
