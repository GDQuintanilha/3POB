public class Diretor extends Funcionario {
    private double bonificacao;

    public Diretor(String cpf, double salario, double bonificacao) {
        super(cpf, salario);
        this.bonificacao = bonificacao;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
}