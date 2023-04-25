package br.edu.ifpr.lista.heranca.ex8;

public class Projetil extends Entidade{
    private String direcao;
    private int dano;

    public Projetil(){
        super();
    }

    public Projetil(int x, int y, int velocidade, int nivel, String statusBuff, String direcao, int dano){
        super(x, y, velocidade, nivel, statusBuff);
        this.direcao = direcao;
        this.dano = dano;
    }

    public String getDirecao() {
        return this.direcao;
    }
    
    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public int getDano() {
        return this.dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void movimentacao(){
        //Implementado depois
    }
    
    public void danoPorNivel(){
        setDano(1+nivel);
    }
}
