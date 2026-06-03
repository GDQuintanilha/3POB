public class MainEx3{
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("Guilherme", 500.00);

        try{
            conta.sacar(600.00);
        } catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }
}