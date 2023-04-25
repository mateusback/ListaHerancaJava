package br.edu.ifpr.lista.heranca.ex6;

public class TestePessoa {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Rafael");
        funcionario1.setRg("13.133.362-8");
        funcionario1.setCartao("5479 5023 3007 5504");

        PessoaJuridica juridica1 = new PessoaJuridica();
        juridica1.setNome("Joaquim");
        juridica1.setCnpj("22.921.903/0001-48");

        PessoaFisica fisica1 = new PessoaFisica();
        fisica1.setNome("Maria");
        fisica1.setRg("22.745.135-1");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("José");
        /* Ao alterar uma classe para abstract, a instanciação deixa de funcionar.
         * Uma classe abstrada náo permite a criação de objetos diretamente, funcionando apenas como uma classe base.*/

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome(pessoa1.getNome());
        /* Funcionou correta mente, aparentemente isso é comumente usado para passar valores de um objeto para outro,
         * Desas forma, os objetos funcionan juntos, fazendo com que a herança faça mais sentido.*/

        pessoa1.classeObjeto(funcionario1);
        pessoa1.classeObjeto(juridica1);
        pessoa1.classeObjeto(fisica1);
        pessoa1.classeObjeto(pessoa1);

        /* Para evitar que uma classe seja herdada por outras deve-se utilizar a palavra reservada "final".
         * Caso eu coloque final na classe Pessoa, eu náo consigo mais estender a classe pessoa para as filhas,
         * fazendo com que a intanciaçáo do nome, náo aconteça.
         * Caso eu coloque final no metodo de getRg() e tente sobreescreve-lo em Funcionario, náo será possivel.
         * Primeiro porque estou usando private no Rg e porque o metedo não pode sobreescrever o metodo da superclasse.*/
    }
}
