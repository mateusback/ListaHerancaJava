package br.edu.ifpr.lista.heranca.ex5.setores;

//Esse import é necessario para o extends
import br.edu.ifpr.lista.heranca.ex5.Funcionario;

public class Engenheiro extends Funcionario{
    private String crea;
    // String crea;
    
    public Engenheiro(){
    }
    
    public String getCrea(){
        return this.crea;
    }

    public void setCrea(String crea){
        this.crea = crea;
    }

    public double calcularSalario(int horasSemanais, int quantidadeSalarios, double bonificacao){
        //Regra fictícia
        return (horasSemanais * 4 * quantidadeSalarios * 1.320) + bonificacao;
    }
}
