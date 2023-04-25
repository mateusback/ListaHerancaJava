package br.edu.ifpr.lista.heranca.ex4;

public class CalculadoraCientifica extends Calculadora{

    //Isso é apenas um teste. (l6 - l10)
    Calculadora calc = new Calculadora();
    
    public double calcularLogaritmo(double valor, double base){
        return calc.divisao(Math.log(valor), Math.log(base));
    }

    public double calcularRaiz(double valor){
        return Math.sqrt(valor);
    }
}
