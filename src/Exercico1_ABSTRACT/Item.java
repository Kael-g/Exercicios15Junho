package Exercico1_ABSTRACT;

import java.util.Objects;

abstract class Item {
    private String nome;
    private double preco;

    private int codigoDeBarras;

    abstract void mostrarDetalhesDoItem();

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Item)) return false;
//        Item item = (Item) o;
//        return codigoDeBarras == item.codigoDeBarras;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return getCodigoDeBarras() == item.getCodigoDeBarras();
    }

    public Item(String nome, double preco, int codigoDeBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public int getCodigoDeBarras(){
        return codigoDeBarras;
    }

}
