import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FrotaRepository{
    public void salvarEmArquivo(List<Veiculo> frota, String nomeArquivo) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))){
            for(Veiculo v : frota){
                writer.write("Placa: " + v.getPlaca() + " | Custo Total: R$ " + v.calcularCustoTotal());
                if(v instanceof Tributavel){
                    writer.write(" | IPVA: R$ " + ((Tributavel) v).calcularIPVA());
                }
                writer.newLine();
            }
        }
    }

    public List<String> lerDoArquivo(String nomeArquivo) throws IOException{
        List<String> linhas = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))){
            String linha;
            while((linha = reader.readLine()) != null){
                linhas.add(linha);
            }
        }
        return linhas;
    }
}