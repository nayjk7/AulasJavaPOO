package com.senai.aula06_abstração.exemplo_ClasseAbstrata.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal>ListaDeAnimais = new ArrayList<>();

        ListaDeAnimais.add(new Cachorro("Thor"));
        ListaDeAnimais.add(new Gato("Marrie"));

        ListaDeAnimais.forEach(animal -> {
            animal.dormir();
            animal.fazerSom();
        } );
    }
}
