package Exercicio1_INTERFACE;

public class Fluorescente extends FabricaLampada implements Lampada{

    @Override
    public void ligar() {
        System.out.println("Lâmpada fluorescente ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("Lâmpada fluorescente desligada!");
    }
}
