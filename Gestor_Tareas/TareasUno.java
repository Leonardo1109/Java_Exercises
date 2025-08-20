package Gestor_Tareas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TareasUno {
    public static void main(String[] args) {
        String tituloTarea;
        String descripcionTarea;
        LocalDate fechaInicio;
        LocalDate fechaFin;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la tarea:");
        tituloTarea = scanner.nextLine();
        System.out.println("Ingrese la descripcion de la tarea:");
        descripcionTarea = scanner.nextLine();
        System.out.println("Ingrese la fecha de inicio: en fomato dd-mm-aaaa");
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fechaInicio = LocalDate.parse(scanner.nextLine(), formatoFecha);
        System.out.println("Ingrese la fecha de fin en formato dd-mm-aaaa");
        fechaFin = LocalDate.parse(scanner.nextLine(), formatoFecha);

        System.out.printf("%s%n%s%n%s%n%s", tituloTarea, descripcionTarea, fechaInicio, fechaFin);
    }
}
