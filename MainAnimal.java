import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        
        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal a : animais) {
            a.fazerSom(); 
        }
    }
}