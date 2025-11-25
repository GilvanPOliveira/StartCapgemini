package br.com.trilhajava.linguagemjava.modelo;

/**
 *
 * @author Gilvan
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Voo {

    private Integer numero;
    private String origem;
    private String destino;
    private Date dataHora;
    private StatusVoo status;

    private List<Passageiro> passageiros = new ArrayList<>();

    public Voo(Integer numero, String origem, String destino, Date dataHora) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.dataHora = dataHora;
        this.status = StatusVoo.AGENDADO;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public StatusVoo getStatus() {
        return status;
    }

    public void setStatus(StatusVoo status) {
        this.status = status;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void adicionarPassageiro(Passageiro p) {
        passageiros.add(p);
    }

    @Override
    public String toString() {
        return "Voo " + numero +
               " | " + origem + " -> " + destino +
               " | Data/Hora: " + dataHora +
               " | Status: " + status;
    }
}
