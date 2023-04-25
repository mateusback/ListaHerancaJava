package br.edu.ifpr.lista.heranca.ex6;

public class Funcionario extends PessoaFisica{
    private String cartao;
    
    public Funcionario(){
    }

    public String getCartao(){
        return this.cartao;
    }

    public void setCartao(String cartao){
        this.cartao = cartao;
    }

}
