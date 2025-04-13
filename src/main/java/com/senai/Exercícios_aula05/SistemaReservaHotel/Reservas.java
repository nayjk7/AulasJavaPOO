package com.senai.Exercícios_aula05.SistemaReservaHotel;

public class Reservas {
    protected int dias;
    protected double valorDiaria;

    public Reservas(int dias, double valorDiaria) {
        this.dias = dias;
        this.valorDiaria = valorDiaria;
    }

    public double calcularCusto() {
        return dias * valorDiaria;
    }
}

