package com.senai.exemplos.Pessoa2;
//aula 14/02/24
public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void falar (String frase){
        System.out.println(nome+ "falou: " +frase);

    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
