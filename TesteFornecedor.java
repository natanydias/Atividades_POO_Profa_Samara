package br.exercicio03;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor f = new Fornecedor("Empresa X", "Rua A, 123", "99999-9999", 5000.0, 1500.0);

        System.out.println("Nome: " + f.getNome());
        System.out.println("Endereço: " + f.getEndereco());
        System.out.println("Telefone: " + f.getTelefone());
        System.out.println("Valor de Crédito: " + f.getValorCredito());
        System.out.println("Valor de Dívida: " + f.getValorDivida());
        System.out.println("Saldo: " + f.obterSaldo());
    }
}
