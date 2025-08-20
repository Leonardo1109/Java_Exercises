package Tareas;

import java.util.Scanner;

public class T2_Libro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingresa el nombre del libro: ");
        var nombre = scanner.nextLine();
        System.out.printf("Ingresa el año: ");
        var anio = scanner.nextLine();

        System.out.printf("Libro: %s%nAño publicacion: %s%n", nombre, anio);

        var resultado = Integer.parseInt(anio) + 10;

        System.out.println(resultado);
    }
}
