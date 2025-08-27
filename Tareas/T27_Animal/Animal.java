package Tareas.T27_Animal;

public class Animal {
    private boolean dormido = false;
    private boolean comido = true;

    public Animal(boolean dormido, boolean comido) {
        this.dormido = dormido;
        this.comido = comido;
    }

    public void estaDormido() {
        System.out.println(dormido ? "Esta dormido" : "No esta dormido");
    }

    public void estaComido() {
        System.out.println(comido ? "Esta comido" : "No esta comido");
    }
}
