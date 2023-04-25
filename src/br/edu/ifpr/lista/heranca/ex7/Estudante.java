package br.edu.ifpr.lista.heranca.ex7;

public class Estudante extends Pessoa{
    private String ra;

    public Estudante(){
        super();
    }

    public Estudante(String ra){
        super();
        this.ra = ra;
    }

    public String getRa(){
        return this.ra;
    }

    public void setRa(String ra){
        this.ra = ra;
    }
}
