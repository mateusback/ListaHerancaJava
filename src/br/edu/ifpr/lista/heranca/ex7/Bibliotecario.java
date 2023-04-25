package br.edu.ifpr.lista.heranca.ex7;

public class Bibliotecario extends Pessoa{
    private String siape;

    public Bibliotecario(){
        super();
    }

    public Bibliotecario(String siape){
        super();
        this.siape = siape;
    }

    public String getSiape(){
        return this.siape;
    }

    public void setSiape(String siape){
        this.siape = siape;
    }
}
