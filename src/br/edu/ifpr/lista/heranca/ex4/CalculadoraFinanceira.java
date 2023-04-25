package br.edu.ifpr.lista.heranca.ex4;

public class CalculadoraFinanceira extends Calculadora{

    public double calcularJurosCompostos(double valorInicial, double jurosMes, int tempoMes){
        return valorInicial * (Math.pow((1 + jurosMes / 100), tempoMes));
    }

    public double calcularFinanciamentoPrestacoesFixas(double valorFinanciado, int tempoMes, double jurosMes, double valorPrestacao){
        return (1 - (Math.pow((1 + jurosMes), tempoMes * -1))/ jurosMes) * valorPrestacao;
    }
}
