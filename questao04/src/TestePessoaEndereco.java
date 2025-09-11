public class TestePessoaEndereco {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua das Flores", 123);
        Pessoa pessoa1 = new Pessoa("João", 30, endereco1);

        pessoa1.mostrarDados();
    }
}