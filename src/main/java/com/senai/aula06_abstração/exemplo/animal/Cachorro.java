package com.senai.aula06_abstração.exemplo.animal;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome+ "está latindo: Au Au!");
    }
}

