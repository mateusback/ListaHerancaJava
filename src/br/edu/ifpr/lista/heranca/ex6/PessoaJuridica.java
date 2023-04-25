package br.edu.ifpr.lista.heranca.ex6;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(){
    }
    
    public String getCnpj(){
        return this.cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
}
