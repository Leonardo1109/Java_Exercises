package Tareas;

public class T13_Do_While {
    public static void main(String[] args) {
        System.out.println("Pequeño ejercicio do while");

        var contador = 1;

        do {
            System.out.println("El contador vale: " + contador);
            contador++;
        } while (contador <= 10);
    }
}
