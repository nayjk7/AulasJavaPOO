package com.senai.Exercícios_aula06.Ex01;

public class Main {
    public static void main(String[] args) {
        FlySecure.boasVindas();

        CheckIn companhia = new CompanhiaX();

        companhia.validarDocumentos("AB123456");
        companhia.emitirCartaoEmbarque("Nayara Soares");

        FlySecure.mensagemSeguranca();

        System.out.println("Peso máximo nacional: " + FlySecure.PESO_MAX_NACIONAL + "kg");
        System.out.println("Peso máximo internacional: " + FlySecure.PESO_MAX_INTERNACIONAL + "kg");
    }
}

