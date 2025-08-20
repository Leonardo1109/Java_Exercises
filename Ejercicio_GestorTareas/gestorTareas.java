package Ejercicio_GestorTareas;

import java.util.Scanner;

public class gestorTareas {
    public static void main(String[] args) {
        menu();
        Scanner scanner = new Scanner(System.in);
        String desicion = scanner.nextLine();
        
        while (!desicion.equals("5")) {
            if (desicion.equals("1")) {
                menu();
            }
            else if (desicion.equals("2")) {
                menu();
            }
            else if (desicion.equals("3")) {
                menu();
            }
            else if (desicion.equals("4")) {
                menu();
            }
            else{
                System.out.println("Digite un valor valido");
            }
        }
    }

    public static void menu(){
        System.out.println("Presione 1 para Agregar una tarea");
        System.out.println("Presione 2 para Listar las tareas");
        System.out.println("Presione 3 para Marcar como Completada una tarea");
        System.out.println("Presione 4 para Borrar una tarea");
        System.out.println("Presione 5 para Salir");
    }
}
