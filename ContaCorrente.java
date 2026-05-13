public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if ((saldo + limite) >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Limite do cheque especial excedido.");
        }
    }
}