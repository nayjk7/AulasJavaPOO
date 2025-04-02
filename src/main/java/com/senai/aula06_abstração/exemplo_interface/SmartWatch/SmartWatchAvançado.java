package com.senai.aula06_abstração.exemplo_interface.SmartWatch;

public class SmartWatchAvançado implements SensorCardiaco, SensorPassos,SensorSono{


        @Override
        public void medirFrequenciaCardiaca() {
            System.out.println("Medição cardiaca : 80bpm ");
        }

        @Override
        public void contarPassos() {
            System.out.println(" Passos Hoje: 3 passos ");

        }

        @Override
        public void medirQualidadeSono() {
            System.out.println(" Qualidade do sono: profundo");

        }
        void exibirInfoDispositivos(){
            System.out.println(" Dispositivos conectados: ... ");
        }
    }

