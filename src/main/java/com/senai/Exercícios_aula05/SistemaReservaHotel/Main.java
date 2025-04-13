package com.senai.Exercícios_aula05.SistemaReservaHotel;

public class Main {
    public static void main(String[] args) {
        Reservas r1 = new ReservaSimples(3, 200);
        Reservas r2 = new ReservaVip(3, 200);

        System.out.println("Custo Reserva Simples: " + r1.calcularCusto());
        System.out.println("Custo Reserva VIP: " + r2.calcularCusto());
    }
}