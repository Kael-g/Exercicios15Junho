package Exercicio2_ABSTRACT;

public class Retangulo extends Forma{

    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    @Override
    double calcularArea() {
        return base*altura;
    }

    @Override
    double calcularPerimetro() {
        return base*2+altura*2;
    }

    @Override
    void mostraMedidas() {
        System.out.printf("Base do retângulo: %s\nAltura do retângulo: %s\n",base,altura);
    }
}
