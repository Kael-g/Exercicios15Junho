package Exercicio1_INTERFACE;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos criar uma lâmpada!\nQuer criar uma lâmpada Fluorescente ou Incandescente? [ F / I ]");
        String tipo = input.next();
        Lampada lampada = FabricaLampada.construir(tipo);
        lampada.ligar();
        lampada.desligar();
    }
}
