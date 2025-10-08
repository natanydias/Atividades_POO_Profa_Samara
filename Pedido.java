import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemPedido> itens = new ArrayList<>();

    public class ItemPedido {
        private String nomeProduto;
        private int quantidade;
        private double precoUnitario;

        public ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        public double subtotal() {
            return quantidade * precoUnitario;
        }
    }

    public void adicionarItem(String nome, int qtd, double preco) {
        itens.add(new ItemPedido(nome, qtd, preco));
    }

    public double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.subtotal();
        }
        return total;
    }

}
