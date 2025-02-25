package org.example;

class Entrega {
    private Pedido pedido;
    private String status;
    private Entregador entregador;


    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public int tempoEstimado() {
        return 30;
    }

    public void entregarPedido() {
        System.out.println("Pedido entregue por " + entregador.getNome());
    }


    public Pedido getPedido() {
        return pedido;
    }

    public String getStatus() {
        return status;
    }

    public Entregador getEntregador() {
        return entregador;
    }
}


