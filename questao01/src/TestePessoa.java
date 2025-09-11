public class TestePessoa {
    public static void main(String[] args) {
        // Criando dois objetos da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Ana", 25);
        Pessoa pessoa2 = new Pessoa("Carlos", 30);

        // Imprimindo os valores
        System.out.println("Pessoa 1: " + pessoa1.nome + ", Idade: " + pessoa1.idade);
        System.out.println("Pessoa 2: " + pessoa2.nome + ", Idade: " + pessoa2.idade);
    }
}
