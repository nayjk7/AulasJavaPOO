package com.senai.Exercícios_aula06.EX04;
public abstract class Evento {
    protected static final int TEMPO_PADRAO_MINUTOS = 60;
    protected static final String PREMIACAO_PADRAO = "Medalha de Participação";

    public abstract void iniciarEvento();
    public abstract void finalizarEvento();
    public abstract void premiarParticipantes();

    protected void validarEvento() {
        System.out.println("[Validação] Evento verificado com sucesso.");
    }
}

