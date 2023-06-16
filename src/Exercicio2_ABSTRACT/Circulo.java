package Exercicio2_ABSTRACT;

public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return Math.PI*Math.pow(raio,2);
    }

    @Override
    double calcularPerimetro() {
        return 2*Math.PI*raio;
    }

    @Override
    void mostraMedidas() {
        System.out.printf("Raio do círculo: %s\n", raio);

    }
}
