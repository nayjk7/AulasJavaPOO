package com.senai.Aula05_polimorfismo.exemplos.SistemaDePagamentos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamentos> listaPagamentos = new ArrayList<>();

        listaPagamentos.add(new CLT("Ana", 1000));
        listaPagamentos.add(new PJ("Carol", 24, 1000));
        listaPagamentos.add(new Freelancers("João", 10000));

        listaPagamentos.forEach(pagamentos -> System.out.printf(
                "%s recebe R$,.2f", pagamentos.getNome(), pagamentos.calcularPagamento()
        ));
    }
}
