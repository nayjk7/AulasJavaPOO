package com.senai.aula06_abstração.exemplo_interface.veículo;

public interface Veículo {
    void acelerar();

    default void buzinar() {
        System.out.println("Buzinando: beep beep");
    }

}
