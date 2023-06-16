package Exercico1_ABSTRACT;

public class Dvd extends Item{
    private int duracao;

    public Dvd(String nome, double preco, int duracao, int codigoDeBarras){
        super(nome, preco, codigoDeBarras);
        this.duracao = duracao;
    }

    @Override
    void mostrarDetalhesDoItem() {
        System.out.printf("\nNome do DVD: %s\nDuração: %d minutos\nPreço: R$ %.2f\n", super.getNome(), duracao, super.getPreco());

    }
}
