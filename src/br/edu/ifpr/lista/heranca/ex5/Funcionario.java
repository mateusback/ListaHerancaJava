package br.edu.ifpr.lista.heranca.ex5;

public class Funcionario {
    protected String nome;
    protected int anoNascimento;
    protected String cpf;
    protected String endereco;
    protected String email;
    protected String telefone;
    protected double salario;

    public Funcionario(){

    }

    //getters e setters
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAnoNascimento(){
        return this.anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndreco(String endereco){
        this.endereco = endereco;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double calcularSalario(int horasSemanais, int quantidadeSalarios){
        return horasSemanais * 4 * quantidadeSalarios * 1.320;
    }
}
