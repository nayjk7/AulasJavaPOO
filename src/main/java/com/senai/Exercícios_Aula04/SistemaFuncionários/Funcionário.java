package com.senai.Exercícios_Aula04.SistemaFuncionários;

public class Funcionário {
    private String nome;
    private double salario;

    public Funcionário(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    void exibirDetalhes(){
        System.out.println("Nome:" + nome + ", Salário: R$" + salario);
    }
}
