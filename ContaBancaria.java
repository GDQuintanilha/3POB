public class ContaBancaria{
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor > saldo){
            throw new SaldoInsuficienteException(saldo, valor);
        }
        saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
    }
}