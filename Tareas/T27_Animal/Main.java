package Tareas.T27_Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(false, false);
        animal.estaComido();
        animal.estaDormido();

        Perro perro = new Perro(false, true, false);
        perro.estaComido();
        perro.estaDormido();
        perro.estaLadrando();
    }
}
