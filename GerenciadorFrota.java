import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorFrota{
    private List<Veiculo> frota = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v){
        frota.add(v);
    }

    public void salvarDadosEmArquivo(String nomeArquivo){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))){
            for(Veiculo v : frota){
                writer.write("Placa: " + v.getPlaca() + " | Custo Total: R$ " + v.calcularCustoTotal());
                if(v instanceof Tributavel){
                    writer.write(" | IPVA: R$ " + ((Tributavel) v).calcularIPVA());
                }
                writer.newLine();
            }
            System.out.println("Arquivo gravado com sucesso!");
        } catch(IOException e){
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }
    }

    public void lerDadosDoArquivo(String nomeArquivo){
        System.out.println("--- Lendo do arquivo " + nomeArquivo + " ---");
        try(BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))){
            String linha;
            while((linha = reader.readLine()) != null){
                System.out.println(linha);
            }
        } catch(IOException e){
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}