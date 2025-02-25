package org.example;

public Entregador(String nome, String telefone, String veiculo) {
    private nome = nome;
    private telefone = telefone;
    private veiculo = veiculo;
}

public void atribuirEntrega(Entrega entrega) {
    System.out.println("Entrega atribuída a " + nome);
}

public void atualizarLocalizacao() {
    System.out.println("Localização do entregador " + nome + " atualizada.");
}

// Getters e Setters
public String getNome() {
    return nome;
}

public String getTelefone() {
    return telefone;
}

public String getVeiculo() {
    return veiculo;
}
}