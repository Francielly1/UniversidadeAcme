package com.example.a17170086.universidadeacme.model;

public class Mensalidade {

    private int id;
    private String mes;
    private String valor;
    private String vencimento;
    private String status;

    //construtor
    public Mensalidade(int id, String mes, String valor, String vencimento, String status) {
        this.setId(id);
        this.mes = mes;
        this.valor = valor;
        this.vencimento = vencimento;
        this.status = status;

    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
