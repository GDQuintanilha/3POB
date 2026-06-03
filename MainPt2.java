public class MainPt2{
    public static void main(String[] args){
        GerenciadorFrota gerenciador = new GerenciadorFrota();

        System.out.println("--- AÇÃO 1: Testando Exceção ---");
        try{
            Carro carroInvalido = new Carro("ABC12", 1000.0, 50);
        } catch(PlacaInvalidaException e){
            System.out.println("Erro capturado com sucesso: " + e.getMessage());
        }

        System.out.println("\n--- AÇÃO 2: Adicionando Frota Válida ---");
        Carro carroValido = new Carro("RIO1A23", 2000.0, 1000);
        Caminhao caminhaoValido = new Caminhao("SPX9Z87", 5000.0, 15.5);
        
        gerenciador.adicionarVeiculo(carroValido);
        gerenciador.adicionarVeiculo(caminhaoValido);
        System.out.println("Veículos adicionados na memória.");

        System.out.println("\n--- AÇÃO 3: Gravando no Disco ---");
        gerenciador.salvarDadosEmArquivo("frota.txt");

        System.out.println("\n--- AÇÃO 4: Lendo do Disco ---");
        gerenciador.lerDadosDoArquivo("frota.txt");
    }
}