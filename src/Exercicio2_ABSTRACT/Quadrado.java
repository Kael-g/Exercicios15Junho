package Exercicio2_ABSTRACT;

public class Quadrado extends Retangulo{

    public Quadrado(double base) {
        super(base, base);
    }

    @Override
    void mostraMedidas() {
        System.out.println("Medida dos lados do quadrado: "+ getBase());
    }
}
