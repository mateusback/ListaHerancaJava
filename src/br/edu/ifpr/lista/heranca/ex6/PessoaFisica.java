package br.edu.ifpr.lista.heranca.ex6;

public class PessoaFisica extends Pessoa{
    protected String rg;

    public PessoaFisica(){
    }

    public String getRg(){
        return this.rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }
    
}
