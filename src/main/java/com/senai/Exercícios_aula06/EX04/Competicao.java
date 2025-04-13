package com.senai.Exercícios_aula06.EX04;

public class Competicao extends Evento {
    @Override
    public void iniciarEvento() {
        validarEvento();
        System.out.println("Competição iniciada. Tempo limite: " + TEMPO_PADRAO_MINUTOS + " minutos.");
    }

    @Override
    public void finalizarEvento() {
        System.out.println("Competição finalizada.");
    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Premiação: Troféu de Ouro e pontos no ranking.");
    }
}