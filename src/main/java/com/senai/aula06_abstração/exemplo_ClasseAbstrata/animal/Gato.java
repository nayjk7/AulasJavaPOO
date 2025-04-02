package com.senai.aula06_abstração.exemplo_ClasseAbstrata.animal;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome+ "está miando: Miau!");
    }
}



