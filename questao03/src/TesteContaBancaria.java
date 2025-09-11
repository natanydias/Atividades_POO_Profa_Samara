public class TesteContaBancaria {
    public static void main(String[] args) {
        // Criar uma conta com número 12345 e saldo inicial de R$1000
        ContaBancaria conta = new ContaBancaria(12345, 1000.0);

        System.out.println("Conta número: " + conta.getNumeroConta());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        // Realizando um depósito
        conta.depositar(500.0);

        // Tentativa de saque válida
        conta.sacar(300.0);

        // Tentativa de saque inválida (saldo insuficiente)
        conta.sacar(1500.0);

        // Tentativa de depósito inválido
        conta.depositar(-50.0);

        // Tentativa de saque com valor negativo
        conta.sacar(-100.0);

        // Mostrar saldo final
        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
