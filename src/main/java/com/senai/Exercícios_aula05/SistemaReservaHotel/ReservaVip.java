package com.senai.Exercícios_aula05.SistemaReservaHotel;

public class ReservaVip extends Reservas {
    public ReservaVip(int dias, double valorDiaria) {
        super(dias, valorDiaria);
    }

    @Override
    public double calcularCusto() {
        return super.calcularCusto() + 100.0; // VIP tem taxa fixa extra
    }

}
