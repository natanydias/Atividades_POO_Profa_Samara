public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco; // Associação com a classe Endereco

    // Construtor
    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    // Método para mostrar os dados
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: Rua " + endereco.getRua() + ", Número " + endereco.getNumero());
        System.out.println("--------------------------");
    }
}
