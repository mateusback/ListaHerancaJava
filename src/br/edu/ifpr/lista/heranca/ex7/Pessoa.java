package br.edu.ifpr.lista.heranca.ex7;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private boolean ativo;
    private Date dataAtualizacao;
    private Date dataCriacao;

    public Pessoa(){
        this.ativo = true;
        this.dataAtualizacao = new Date();
        this.dataCriacao = new Date();;
    }

    public Pessoa(String nome, String email, String telefone, String senha){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.ativo = true;
        this.dataAtualizacao = new Date();
        this.dataCriacao = new Date();
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public boolean getAtivo(){
        return this.ativo;
    }

    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
    
    public Date getDataAtualizacao(){
        return this.dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao){
        this.dataAtualizacao = dataAtualizacao;
    }

    public Date getDataCriacao(){
        return this.dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao){
        this.dataCriacao = dataCriacao;
    }

}
