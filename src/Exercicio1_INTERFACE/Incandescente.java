package Exercicio1_INTERFACE;

public class Incandescente extends FabricaLampada implements Lampada {
    @Override
    public void ligar() {
        System.out.println("Lâmpada incandescente ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("Lâmpada incandescente desligada!");
    }
}
