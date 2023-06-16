package Exercico1_ABSTRACT;

public class Livro extends Item{
    private String autor;

    public Livro(String nome, double preco, String autor, int codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.autor = autor;
    }

    @Override
    void mostrarDetalhesDoItem() {
        System.out.printf("\nNome do livro: %s\nAutor: %s\nPreço: R$ %.2f\n", super.getNome(), autor, super.getPreco());

    }
}
