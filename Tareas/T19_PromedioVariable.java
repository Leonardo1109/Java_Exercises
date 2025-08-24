package Tareas;

import java.util.ArrayList;
import java.util.Scanner;

public class T19_PromedioVariable {
    public static void main(String[] args) {
        ArrayList<Integer> calificaciones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        var bandera = false;
        
        do {
            System.out.println("""
                1. Agregue una calificacion
                2. Consultar calificaciones
                3. Salir

                Elija una opcion: """);
            var decision = scanner.nextInt();
            decision = decision != 1 && decision != 2 ? 3 : decision;

            if (decision == 1) {
                System.out.print("Ingrese la calificacion: ");
                var calificacion = scanner.nextInt();
                calificacion = calificacion > 10 ? 10 : calificacion < 0 ? 0: calificacion;
                calificaciones.add(calificacion);
            } else if (decision == 2) {
                double promedio = 0;
                for (int i = 0; i < calificaciones.size(); i++) {
                    System.out.printf("Calificacion %d: %d%n", i + 1, calificaciones.get(i));
                    promedio += calificaciones.get(i);
                }
                promedio = calificaciones.size() != 0 ? promedio / calificaciones.size() : 0;
                System.out.println("Promedio: " + promedio);
            } else{
                bandera = true;
            }
            
        } while (!bandera);
    }
}
