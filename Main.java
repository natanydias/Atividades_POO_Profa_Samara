public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem("Teclado", 2, 150);
        pedido.adicionarItem("Mouse", 1, 80);
        pedido.adicionarItem("Monitor", 1, 800);

        System.out.println("Valor total do pedido: R$ " + pedido.valorTotal());
    }
