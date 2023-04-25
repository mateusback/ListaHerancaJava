package br.edu.ifpr.lista.heranca.ex6;

//public private class Pessoa{
//public abstract class Pessoa{
public class Pessoa{
    protected String nome;

    public Pessoa(){
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void classeObjeto(Object objeto){
        //fonte: https://stackoverflow.com/questions/6271417/java-get-the-current-class-name
        String nomeClasse = objeto.getClass().getSimpleName();
        System.out.println("O objeto pertence a classe: " + nomeClasse);
    }
}