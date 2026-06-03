public class Desenvolvedor extends Funcionario{
    private int horasExtras;
    private final double valorHoraExtra = 50.00;

    public Desenvolvedor(String nome, double salarioBase, int horasExtras){
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() + (horasExtras * valorHoraExtra);
    }
}