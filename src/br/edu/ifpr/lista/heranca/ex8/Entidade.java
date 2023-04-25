package br.edu.ifpr.lista.heranca.ex8;

public class Entidade {
    protected int x;
    protected int y;
    protected int velocidade;
    protected int nivel;
    protected String statusBuff;

    public Entidade(){
    }

    public Entidade(int x, int y, int velocidade, int nivel, String statusBuff){
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
        this.nivel = nivel;
        this.statusBuff = statusBuff;
    }

    public int getX() {
        return this.x;
    }
    
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getVelocidade(){
        return this.velocidade;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public int getNivel() {
        return this.nivel;
    }
    
    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public String getStatusBuff(){
        return this.statusBuff;
    }

    public void setStatusBuff(String statusBuff){
        this.statusBuff = statusBuff;
    }
}
