public class Produto implements Promocional{
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }

    @Override
    public void aplicarDesconto(double percentual){
        this.preco -= this.preco * (percentual / 100.0);
    }
}