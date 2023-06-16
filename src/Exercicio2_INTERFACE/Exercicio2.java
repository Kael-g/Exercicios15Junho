package Exercicio2_INTERFACE;

public class Exercicio2 {
    public static void main(String[] args) {
        ContaCorrente cCorrente = new ContaCorrente(1000);
        ContaPoupanca cPoupanca = new ContaPoupanca(3000);
        SeguroDeVida seguro = new SeguroDeVida();

        System.out.printf("Tributos de conta corrente com saldo de R$ %.2f :\t\t R$ %.2f\n", cCorrente.getSaldo(), cCorrente.calculaTributos());
        System.out.printf("Tributos de conta poupança com saldo de R$ %.2f :\t\t R$ %.2f\n", cPoupanca.getSaldo(), cPoupanca.calculaTributos());
        System.out.printf("Tributos de seguro de vida:\t\t R$ %.2f\n", seguro.calculaTributos());

    }
}
