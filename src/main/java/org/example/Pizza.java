package org.example;

import java.util.ArrayList;

public class Pizza {

    private String sabor;
    private ArrayList<String> igredientes = new ArrayList<>();
    private double Preco;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public ArrayList<String> getIgredientes() {
        return igredientes;
    }

    public void setIgredientes(ArrayList<String> igredientes) {
        this.igredientes = igredientes;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;

    }



}
