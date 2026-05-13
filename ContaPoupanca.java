public class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double taxaDeSaque = 2.00;
        if (saldo >= (valor + taxaDeSaque)) {
            saldo -= (valor + taxaDeSaque);
        } else {
            System.out.println("Saldo insuficiente para cobrir o saque e a taxa.");
        }
    }
}