package br.edu.ifpr.lista.heranca.ex4;

import java.text.DecimalFormat;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        CalculadoraCientifica cientifica = new CalculadoraCientifica();
        CalculadoraFinanceira financeira = new CalculadoraFinanceira();
        CalculadoraProgramadora programadora = new CalculadoraProgramadora();

        //Instanciando o metodo format da classe DecimalFormat para formatar os prints de moeda
        DecimalFormat f = new DecimalFormat("#.##");


        double soma = calc.soma(5,5);
        double subtracao = cientifica.subtracao(5,4);
        double multiplicacao = financeira.multiplicacao(5,2);
        double divisao = programadora.divisao(9,3);

        double log = cientifica.calcularLogaritmo(10,2);
        double raiz = cientifica.calcularRaiz(9);

        double juros = financeira.calcularJurosCompostos(1000.00, 2.1, 4);
        double prestacoes = financeira.calcularFinanciamentoPrestacoesFixas(1000.00, 4, 2.1, 250.00);
        
        int[][] matriz = {
            {1, 2, 0},
            {4, 5, 6},
            {5, 8, 4}
        };

        double diagonal = programadora.calcularSomaDiagonalMatriz(matriz);
        String binario = programadora.conversaoBinario(13);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Logaritimo: "+ log);
        System.out.println("Raiz quadrada: " + raiz);
        System.out.println("Juros compostos: R$" + f.format(juros));
        System.out.println("Valor prestações: R$" + f.format(prestacoes));
        System.out.println("Soma da diagonal de uma matriz: " + diagonal);
        System.out.println("Conversão de um número binario: " + binario);
    }
}