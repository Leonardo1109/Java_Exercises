package Tareas.T27_Animal;

public class Perro extends Animal {
    private boolean ladradando = false;

    public Perro(boolean dormido, boolean comido, boolean ladradando) {
        super(dormido, comido);
        this.ladradando = ladradando;
    }
    
    public void estaLadrando() {
        System.out.println(ladradando ? "Esta ladrando" : "No esta ladrando");
    }
    
}
