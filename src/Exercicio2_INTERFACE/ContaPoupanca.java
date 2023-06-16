package Exercicio2_INTERFACE;

public class ContaPoupanca extends Conta implements Tributos{


    public ContaPoupanca(double saldo) {
        super(saldo);
    }
    @Override
    public double calculaTributos() {
        return 0;
    }
}
