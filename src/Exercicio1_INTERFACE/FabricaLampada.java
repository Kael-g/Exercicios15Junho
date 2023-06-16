package Exercicio1_INTERFACE;

abstract class FabricaLampada {

    public static Lampada construir(String tipo){
        if (tipo.equalsIgnoreCase("i")){
            return new Incandescente();
        }
        else if (tipo.equalsIgnoreCase("f")){
            return new Fluorescente();
        } else {
            throw new IllegalArgumentException("Opção inválida");
        }
    }

}
