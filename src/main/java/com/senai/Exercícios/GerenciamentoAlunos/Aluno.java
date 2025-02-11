package com.senai.Exercícios.GerenciamentoAlunos;

public class Aluno {
    String nome;
    int idade;
    double nota;

    public Aluno (String nome, int idade, double nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Nota: " + nota);
    }
    public void atualizarNota(double novaNota){
        this.nota = novaNota;
    }
    public boolean verificarAprovaçao(){
        return nota >= 6.0;
    }

}
