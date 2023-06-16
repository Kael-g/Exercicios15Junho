package Exercicio2_ABSTRACT;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Retangulo(3,5));
        formas.add(new Quadrado(2));
        formas.add(new Circulo(4));
        formas.add(new Retangulo(10,10));
        formas.add(new Circulo(1));

        for (Forma f : formas){
            f.mostraMedidas();
            System.out.printf("Área: %.2f\n",f.calcularArea());
            System.out.printf("Perímetro: %.2f\n",f.calcularPerimetro());
            System.out.println();
        }
    }
}
