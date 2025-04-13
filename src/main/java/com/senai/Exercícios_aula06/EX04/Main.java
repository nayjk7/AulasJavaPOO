package com.senai.Exercícios_aula06.EX04;

public class Main {
    public static void main(String[] args) {
        Evento[] eventos = {
                new EventoSocial(),
                new Competicao(),
                new DesafioRelampago()
        };

        for (Evento evento : eventos) {
            evento.iniciarEvento();
            evento.finalizarEvento();
            evento.premiarParticipantes();
            System.out.println("------------------------");
        }
    }
}