public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String cpf, double salario, double comissao) {
        super(cpf, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}