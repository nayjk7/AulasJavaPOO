package com.senai.aula06_abstração.exemplo.animal;

public abstract class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
    void dormir(){
        System.out.println(nome+ "está dormindo.");
    }
    abstract void fazerSom();

}
