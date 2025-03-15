package Herencia;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Nala", 5);
        Gato gato = new Gato("Wiwi", 2);
        
        perro.hacerSonido();
        perro.mostrarEdad();
        perro.mostrarNombre();;

        gato.hacerSonido();
        gato.mostrarEdad();
        gato.mostrarNombre();

        // Poliformismo
        
        List<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Nala", 5));
        animales.add(new Gato("Wiwi", 2));
        animales.add(new Perro("Wereber", 4));
        animales.add(new Gato("Garfiel", 40));

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }

}
