package Tareas;

import java.util.Scanner;

public class T15_Sistema_Ejemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcionElegida;
        var bandera = false;

        do {
            System.out.println("""
                \nElija una opcion:

                Menu:
                1. Crear una cuenta
                2. Eliminar una cuenta
                3. Salir del sistema
                """);
            opcionElegida = scanner.nextInt();

            switch (opcionElegida) {
                case 1:
                    System.out.println("Creando una cuenta...");
                    break;
                case 2:
                    System.out.println("Eliminando cuenta...");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    bandera = true;
                    break;
                default:
                    break;
            }
        } while (!bandera);
        
    }
}
