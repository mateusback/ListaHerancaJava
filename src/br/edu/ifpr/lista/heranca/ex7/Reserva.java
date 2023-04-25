package br.edu.ifpr.lista.heranca.ex7;


public class Reserva {
    protected DateTime dataHoraDevolucao;
    protected DateTime dataHoraEmprestimo;
    protected Pessoa pessoa;
    protected Armario armario;

    public Reserva(){
        this.dataHoraEmprestimo = new DateTime();
    }

    public Reserva(DateTime dataHoraDevolucao, DateTime dataHoraEmprestimo, Pessoa pessoa, Armario armario){
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.dataHoraEmprestimo = dataHoraEmprestimo;
        this.pessoa = pessoa;
        this.armario = armario;
    }
    
    public DateTime getDataHoraDevolucao() {
        return this.dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(DateTime dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public DateTime getDataHoraEmprestimo() {
        return this.dataHoraEmprestimo;
    }

    public void setDataHoraEmprestimo(DateTime dataHoraEmprestimo) {
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }

    public Pessoa getPessoa(){
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    
    public Armario getArmario() {
        return this.armario;
    }
    public void setArmario(Armario armario) {
        this.armario = armario;
    }
}
