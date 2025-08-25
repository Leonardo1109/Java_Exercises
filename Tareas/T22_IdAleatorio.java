package Tareas;

import java.util.Random;

public class T22_IdAleatorio {
    public static void main(String[] args) {
        System.out.println(generador("Leonardo", "Olvera", 2003));
    }

    private static String generador(String nombre, String apellido, int anioNacimiento){
        var subNombre = nombre.substring(0, 2).toUpperCase();
        var subApellido = apellido.substring(0, 2).toUpperCase();
        Random random = new Random();
        int r = random.nextInt(9000) + 1000;
        String iD = subNombre + subApellido + anioNacimiento + r;
        return iD;
    }
}
