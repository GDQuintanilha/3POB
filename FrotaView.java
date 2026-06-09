import java.util.Scanner;
import java.util.List;
import java.io.IOException;

public class FrotaView{
    private Scanner scanner = new Scanner(System.in);
    private FrotaController controller = new FrotaController();

    public void exibirMenu(){
        int opcao = 0;
        while(opcao != 5){
            System.out.println("\n--- Menu Frota MVC ---");
            System.out.println("1 - Adicionar Carro");
            System.out.println("2 - Adicionar Caminhão");
            System.out.println("3 - Salvar Frota no Disco");
            System.out.println("4 - Ler Frota do Disco");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            
            if(!scanner.hasNextInt()){
                System.out.println("Entrada inválida!");
                scanner.next();
                continue;
            }
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    adicionarCarro();
                    break;
                case 2:
                    adicionarCaminhao();
                    break;
                case 3:
                    salvarDados();
                    break;
                case 4:
                    lerDados();
                    break;
                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void adicionarCarro(){
        try{
            System.out.print("Digite a placa (7 caracteres): ");
            String placa = scanner.nextLine();
            System.out.print("Digite o custo fixo: ");
            double custo = scanner.nextDouble();
            System.out.print("Digite a quilometragem: ");
            int km = scanner.nextInt();
            scanner.nextLine();

            Carro c = new Carro(placa, custo, km);
            controller.adicionarVeiculo(c);
            System.out.println("Carro adicionado com sucesso!");
        } catch(PlacaInvalidaException e){
            System.out.println("Erro de Validação: " + e.getMessage());
        } catch(Exception e){
            System.out.println("Erro na digitação dos dados.");
            scanner.nextLine();
        }
    }

    private void adicionarCaminhao(){
        try{
            System.out.print("Digite a placa (7 caracteres): ");
            String placa = scanner.nextLine();
            System.out.print("Digite o custo fixo: ");
            double custo = scanner.nextDouble();
            System.out.print("Digite as toneladas de carga: ");
            double carga = scanner.nextDouble();
            scanner.nextLine();

            Caminhao c = new Caminhao(placa, custo, carga);
            controller.adicionarVeiculo(c);
            System.out.println("Caminhão adicionado com sucesso!");
        } catch(PlacaInvalidaException e){
            System.out.println("Erro de Validação: " + e.getMessage());
        } catch(Exception e){
            System.out.println("Erro na digitação dos dados.");
            scanner.nextLine();
        }
    }

    private void salvarDados(){
        try{
            controller.salvarFrota();
            System.out.println("Dados salvos com sucesso no repositório!");
        } catch(IOException e){
            System.out.println("Erro de Sistema (I/O): Não foi possível salvar o arquivo.");
        }
    }

    private void lerDados(){
        try{
            System.out.println("--- Lendo do Repositório ---");
            List<String> linhas = controller.carregarDadosSalvos();
            for(String linha : linhas){
                System.out.println(linha);
            }
            System.out.println("----------------------------");
        } catch(IOException e){
            System.out.println("Erro de Sistema (I/O): Não foi possível ler o arquivo.");
        }
    }
}