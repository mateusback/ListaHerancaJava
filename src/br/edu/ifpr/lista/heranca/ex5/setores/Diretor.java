package br.edu.ifpr.lista.heranca.ex5.setores;

//Esse import é necessario para o extend
import br.edu.ifpr.lista.heranca.ex5.Funcionario;

public class Diretor extends Funcionario{
    
    public Diretor(){

    }

    public double calcularSalario(int horasSemanais, int quantidadeSalarios, int numeroProjetos){
        //Regra fictícia
        return horasSemanais * 4 * quantidadeSalarios * 1.320 * numeroProjetos;
    }
}
