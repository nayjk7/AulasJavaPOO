package com.senai.Exercícios_aula06.EX04;

public class DesafioRelampago extends Evento{
    private static final int TEMPO_DESAFIO = 10;

    @Override
    public void iniciarEvento() {
        validarEvento();
        System.out.println("Desafio Relâmpago iniciado! Tempo limite: " + TEMPO_DESAFIO + " minutos.");
    }

    @Override
    public void finalizarEvento() {
        System.out.println("Desafio Relâmpago encerrado.");
    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Premiação: Moeda rara exclusiva.");
    }
}