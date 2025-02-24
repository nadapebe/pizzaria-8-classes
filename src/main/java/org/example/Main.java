package org.example;


public class Main {
    public static void main(String[] args) {

        Cardapio cardapio = new Cardapio();

        // Adiciona pizzas no cardápio
        cardapio.adicionarPizza(new Pizza("Calabresa", 35.00));
        cardapio.adicionarPizza(new Pizza("Marguerita", 38.00));

        // Adiciona bebidas no cardápio
        cardapio.adicionarBebida(new Bebida("Coca-Cola 1L", 8.00));
        cardapio.adicionarBebida(new Bebida("Suco Natural", 10.00));

        // Adiciona acompanhamentos
        cardapio.adicionarAcompanhamento(new Acompanhamento("Batata Frita", 15.00));

        // Lista itens do cardápio
        cardapio.listarPizzas();
        cardapio.listarBebidas();
        cardapio.listarAcompanhamentos();

//-----------------------------------------------------------------------------------------------------------------
        Cozinha cozinha = new Cozinha();

        Cliente cliente1 = new Cliente("João", "99999-9999", "Rua A, 123");
        Pedido pedido1 = new Pedido(1, cliente1);

        Cliente cliente2 = new Cliente("Maria", "88888-8888", "Rua B, 456");
        Pedido pedido2 = new Pedido(2, cliente2);

        cozinha.adicionarPedido(pedido1);
        cozinha.adicionarPedido(pedido2);

        cozinha.exibirPedidosEmPreparo();

        cozinha.finalizarPedido(1);

        cozinha.exibirPedidosFinalizados();

    }
}
