package com.senai.Exercícios_aula06.EX04;

public class EventoSocial extends Evento {
    @Override
    public void iniciarEvento() {
        validarEvento();
        System.out.println("Evento Social iniciado. Duração: " + TEMPO_PADRAO_MINUTOS + " minutos.");
    }

    @Override
    public void finalizarEvento() {
        System.out.println("Evento Social encerrado.");
    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Premiação: " + PREMIACAO_PADRAO);
    }

}
