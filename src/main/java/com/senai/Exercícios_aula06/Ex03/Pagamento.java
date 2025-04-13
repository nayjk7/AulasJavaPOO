package com.senai.Exercícios_aula06.Ex03;

public abstract class Pagamento {
    protected String usuario;
    protected double valor;

    public Pagamento(String usuario, double valor) {
        this.usuario = usuario;
        this.valor = valor;
    }

    // Etapas comuns (métodos concretos)
    public void autenticarUsuario() {
        System.out.println("Autenticando usuário: " + usuario);
    }

    public void validarAntifraude() {
        System.out.println("Validando antifraude para valor: R$ " + valor);
    }

    public void registrarLog() {
        System.out.println("Registrando log da transação.");
    }

    public void registrarTransacao() {
        System.out.println("Transação registrada para: " + usuario + " no valor de R$" + valor);
    }
    public abstract void processarPagamento();

    public final void executarTransacao() {
        autenticarUsuario();
        validarAntifraude();
        processarPagamento();
        registrarLog();
        registrarTransacao();
    }
}
