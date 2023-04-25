package br.edu.ifpr.lista.heranca.ex8;

public class NaveJogador extends Entidade{
    private int pontuacao;
    private int vidas;

    public NaveJogador(){
        super();
    }

    public NaveJogador(int x, int y, int velocidade, int nivel, String statusBuff, int pontuacao, int vidas){
        super(x, y, velocidade, nivel, statusBuff);
        this.pontuacao = pontuacao;
        this.vidas = vidas;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getVidas() {
        return this.vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void movimentacao(char input){
        if(input == 'd'){
            setX(x+1*getVelocidade());
        } else if (input == 'a'){
            setX(x-1*getVelocidade());
        }
        else if (input == 'w'){
            setY(y+1*getVelocidade());
        }
        else if (input == 's'){
            setY(y-1*getVelocidade());
        } else{
            //parado
        }
    }

    public void disparo(char input){
        //Acredito que no Space invaders só dá pra atirar pra cima
    }
}
