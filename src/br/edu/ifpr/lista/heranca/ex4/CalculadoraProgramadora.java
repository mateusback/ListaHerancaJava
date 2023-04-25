package br.edu.ifpr.lista.heranca.ex4;

public class CalculadoraProgramadora extends Calculadora{

    public double calcularSomaDiagonalMatriz(int matriz[][]){
            double diagonal = 0;
            int tamanho = matriz.length;
            
            for (int i = 0; i < tamanho; i++) {
                diagonal += matriz[i][i];
                diagonal += matriz[i][tamanho - i - 1];
            }
            return diagonal;
        }
        
    public String conversaoBinario(int numero){
        return Integer.toBinaryString(numero);
    }
}