package Tareas;

import java.util.Scanner;

public class T23_GeneradorGmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba su nombre: ");
        String nombre = scanner.nextLine().toLowerCase();
        System.out.print("Escriba su apellido: ");
        String apellido = scanner.nextLine().toLowerCase();

        String gmail = nombre + "." + apellido + "@gmail.com";
        System.out.println(gmail);
    }
}
