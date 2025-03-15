package Herencia;

public class Animal {
    protected String nombre;
    protected int edad;

    // constructor
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodo sobreescrito
    public void hacerSonido(){
        System.out.println("");
    }

    public void mostrarNombre(){
        System.out.println("El animal se llama " + nombre);
    }

    public void mostrarEdad(){
        System.out.println(nombre + " tiene " + edad + " años");
    }
}