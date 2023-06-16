package Exercicio2_INTERFACE;

public class ContaCorrente extends Conta implements Tributos{


    public ContaCorrente(double saldo) {
        super(saldo);
    }
    @Override
    public double getSaldo() {
        return super.getSaldo();
    }
    @Override
    public double calculaTributos() {
        return super.getSaldo()*0.01;
    }

}
