package Exercico1_ABSTRACT;

public class Cd extends Item {
    private int faixas;

    public Cd(String nome, double preco, int faixas, int codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.faixas = faixas;
    }

    @Override
    void mostrarDetalhesDoItem() {
        System.out.printf("\nNome do CD: %s\nNúmero de faixas: %d\nPreço: R$ %.2f\n", super.getNome(), faixas, super.getPreco());
    }
}
