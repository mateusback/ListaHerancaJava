package br.edu.ifpr.lista.heranca.ex5.setores;

//Esse import é necessario para o extends
import br.edu.ifpr.lista.heranca.ex5.Funcionario;

public class Secretario extends Funcionario{

    public Secretario(){
    }

    public double calcularSalario(int horasSemanais, int quantidadeSalarios, int pessoasAtendidas){
        //Regra fictícia
        return horasSemanais * 4 * quantidadeSalarios * 1.320 + (pessoasAtendidas*10);
    }
}
