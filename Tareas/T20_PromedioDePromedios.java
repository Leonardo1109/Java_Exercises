package Tareas;

import java.util.ArrayList;
import java.util.Scanner;

public class T20_PromedioDePromedios {
    public static void main(String[] args) {
        ArrayList<ArrayList<Object>> calificaciones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        var bandera = false;
        do {
            System.out.println("""
                1. Agregue una calificacion
                2. Consultar calificaciones
                3. Salir

                Elija una opcion: """);
            var decision = scanner.nextInt();
            scanner.nextLine();
            decision = decision != 1 && decision != 2 ? 3 : decision;

            if (decision == 1) {
                ArrayList<Object> fila = new ArrayList<>();
                System.out.print("Ingrese su nombre: ");
                var nombre = scanner.nextLine();
                fila.add(nombre);
                var bandera2 = false;
                do {
                    System.out.println("¿Desea agregar una calificacion?: \n1. Si\n2. No");
                    var decision2 = scanner.nextInt();
                    decision2 = decision2 != 1 ? 2 : decision2;
                    if (decision2 == 1) {
                        System.out.print("Ingrese la calificacion: ");
                        var calificacion = scanner.nextInt();
                        calificacion = calificacion > 10 ? 10 : calificacion < 0 ? 0 : calificacion;
                        fila.add(calificacion);
                    }else{
                        bandera2 = true;
                    }
                } while (!bandera2);

                calificaciones.add(fila);
            } else if (decision == 2) {

                for (ArrayList<Object> fila : calificaciones) {
                    double promedio = 0;
                    for (int i = 1; i < fila.size(); i++) {
                        promedio += (Integer) fila.get(i);
                    }
                    promedio = promedio != 0 ? promedio / (fila.size() - 1) : 0;
                    System.out.println("Promedio de " + fila.get(0) + ": " + promedio);
                }
            } else{
                bandera = true;
            }
        } while (!bandera);
    }
}
