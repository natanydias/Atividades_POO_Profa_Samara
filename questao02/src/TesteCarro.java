public class TesteCarro {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro("Toyota", 2020);

        // Exibindo as informações usando os getters
        System.out.println("Marca do carro: " + meuCarro.getMarca());
        System.out.println("Ano do carro: " + meuCarro.getAno());
    }
}
