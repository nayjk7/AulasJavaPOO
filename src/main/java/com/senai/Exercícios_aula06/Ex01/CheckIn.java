package com.senai.Exercícios_aula06.Ex01;

public interface CheckIn {
    void validarDocumentos(String documento);

    default void emitirCartaoEmbarque(String nomePassageiro) {

    }
}