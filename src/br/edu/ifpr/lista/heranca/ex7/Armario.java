package br.edu.ifpr.lista.heranca.ex7;

public class Armario {
    protected String numero;
    protected boolean ativo;
    protected String observacoes;

    public Armario(){
        this.ativo = true;
    }

    public Armario(String numero, String oberservacoes){
        this.numero = numero;
        this.observacoes = oberservacoes;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean getAtivo(){
        return this.ativo;
    }

    public void setAtivo( boolean ativo){
        this.ativo = ativo;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
