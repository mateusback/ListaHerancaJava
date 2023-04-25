package br.edu.ifpr.lista.heranca.ex8;


public class Inimigo extends Entidade{
    private int pontos;
    private int vida;

    public Inimigo(){
        super();
    }
    public Inimigo(int x, int y, int velocidade, int nivel, String statusBuff, int pontos, int vida){
        super(x, y, velocidade, nivel, statusBuff);
        this.pontos = pontos;
        this.vida = vida;
    }

    public int getPontos() {
        return this.pontos;
    }

    public void setPontos(int pontos){
        this.pontos = pontos;
    }

    public int getVida(){
        return this.vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public void movimentacao(){
    //Será implementado depois
    }

    //Posso fazer isso nos getters e setter?
    public void vidaPorNivel(){
        setVida(1+getNivel());
    }
    
    public void pontosPorNivel(){
        setPontos(10*(getNivel()/2));
    }
}
