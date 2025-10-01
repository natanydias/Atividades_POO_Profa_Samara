package br.exercicio03;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    // Construtor
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone); // chama o construtor da superclasse Pessoa
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    // Getters e Setters
    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    // Método para obter saldo
    public double obterSaldo() {
        return valorCredito - valorDivida;
    }
}
