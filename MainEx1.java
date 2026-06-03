public class MainEx1{
    public static void main(String[] args){
        Funcionario func1 = new Gerente("Alice", 5000.0, 2000.0);
        Funcionario func2 = new Desenvolvedor("Breno", 4000.0, 10);

        System.out.println(func1.getNome() + " - Salário: R$ " + func1.calcularSalario());
        System.out.println(func2.getNome() + " - Salário: R$ " + func2.calcularSalario());
    }
}