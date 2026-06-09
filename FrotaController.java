import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FrotaController{
    private List<Veiculo> frota = new ArrayList<>();
    private FrotaRepository repositorio = new FrotaRepository();
    private final String nomeArquivo = "frota.txt";

    public void adicionarVeiculo(Veiculo v){
        frota.add(v);
    }

    public List<Veiculo> getFrota(){
        return frota;
    }

    public void salvarFrota() throws IOException{
        repositorio.salvarEmArquivo(frota, nomeArquivo);
    }

    public List<String> carregarDadosSalvos() throws IOException{
        return repositorio.lerDoArquivo(nomeArquivo);
    }
}