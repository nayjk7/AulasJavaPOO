package com.senai.aula06_abstração.exemplo_interface.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartWatchAvançado smartWatchAvancado = new SmartWatchAvançado();

        smartWatchAvancado.contarPassos();
        smartWatchAvancado.medirFrequenciaCardiaca();
        smartWatchAvancado.medirQualidadeSono();
        smartWatchAvancado.exibirInfoDispositivos();
    }
}


