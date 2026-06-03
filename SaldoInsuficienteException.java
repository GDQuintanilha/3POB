public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(double saldoDisponivel, double valorSolicitado){
        super("Falha no saque. Saldo disponível: R$ " + saldoDisponivel + " | Valor solicitado: R$ " + valorSolicitado);
    }
}