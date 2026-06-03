public class MainEx2{
    public static void main(String[] args){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Produto p1 = new Produto("Portátil de Trabalho", 1200.00);
        Produto p2 = new Produto("Rato Sem Fios", 50.00);

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);

        System.out.println("Total antes do desconto: R$ " + carrinho.calcularTotal());

        carrinho.aplicarDescontoGeral(10.0);

        System.out.println("Total após 10% de desconto: R$ " + carrinho.calcularTotal());
    }
}