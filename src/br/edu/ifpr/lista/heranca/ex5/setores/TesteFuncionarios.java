package br.edu.ifpr.lista.heranca.ex5.setores;

import java.text.DecimalFormat;

public class TesteFuncionarios {
    public static void main(String[] args) {

        //Utilizei de geradores automáticos (a maior parte do 4devs) para preencher os dados
        Diretor diretor1 = new Diretor();
        diretor1.setNome("Rafael");
        diretor1.setAnoNascimento(1983);
        diretor1.setCpf("147.793.930-00");
        diretor1.setEndreco("Rua Santa Cecília - Fortaleza/CE");
        diretor1.setEmail("luba3689@uorak.com");
        diretor1.setTelefone("(88) 42301-0485");
        double salarioDiretor1 = diretor1.calcularSalario(44, 4, 3);
        diretor1.setSalario(salarioDiretor1);

        Secretario secretario1 = new Secretario();
        secretario1.setNome("Douglas");
        secretario1.setAnoNascimento(2000);
        secretario1.setCpf("689.147.180-00");
        secretario1.setEndreco("Rua Plácido de Castro - Recife/PE");
        secretario1.setEmail("katiuska6668@uorak.com");
        secretario1.setTelefone("(81) 39758-1998");
        double salarioSecretario1 = secretario1.calcularSalario(40, 2, 40);
        secretario1.setSalario(salarioSecretario1);

        Engenheiro engenheiro1 = new Engenheiro();
        engenheiro1.setNome("Roberta");
        engenheiro1.setAnoNascimento(1997);
        engenheiro1.setCpf("723.281.540-93");
        engenheiro1.setEndreco("Avenida das Peras - Macapá/AP");
        engenheiro1.setEmail("kheir7615@uorak.com");
        engenheiro1.setTelefone("(96) 24504-1523");
        engenheiro1.setCrea("260404510-9");
        double salarioEngenheiro1 = engenheiro1.calcularSalario(30, 5, 530.00);
        engenheiro1.setSalario(salarioEngenheiro1);

        DecimalFormat f = new DecimalFormat("#.00");
        
        System.out.println(f.format(salarioDiretor1));
        System.out.println(f.format(salarioSecretario1));
        System.out.println(f.format(salarioEngenheiro1));

        /*Ao usar o default na super classe sem os setters, o IDE aponta que os atributos náo sáo visiceis.
        * O que náo acontece ao tentar colocar defaut no atributo da classe Engenheiro, isso acontece porque a classe usada para teste está
        * na mesma classe Engenheiro.
        * Já ao usar protected, apenas as subclasses conseguem acessar, mesmo que estejam em outros pacotes*/
    }

}
