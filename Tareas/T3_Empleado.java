package Tareas;

import java.util.Scanner;

public class T3_Empleado {

    /**
     * Clase Main 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Esta clase servirá ára imprimir algunos valores que el usuario digite
        // cambaindo
        // algunas varibles para su mejor uso ya que solo leeremos cadenas
        // No es una buena practica pero sirve para el ejercicio

        System.out.printf("Escriba su nombre: ");
        var nombre = scanner.nextLine();
        System.out.printf("Escriba su edad: ");
        var edad = scanner.nextLine();
        System.out.printf("Escriba su sueldo: ");
        var sueldo = scanner.nextLine();
        System.out.printf("Es un empleado de confianza? S/N: ");
        var empleadoConfianza = scanner.nextLine();

        var edad2 = Integer.parseInt(edad);
        var sueldo2 = Float.parseFloat(sueldo);
        var empleadoConfianza2 = false;

        if (empleadoConfianza.equals("S")) {
            empleadoConfianza2 = true;
        }
        System.out.printf("Empleado: %s%nEdad: %d%nSueldo: %.2f%nEmpleado de confianza: %b%n",
                nombre, edad2, sueldo2, empleadoConfianza2);
    }
}
