package Tareas.T28_Retos.GestorTareas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tarea> tareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean bandera = false;
        while (!bandera) {
            System.out.println("""
                =====================================
                ======= GESTOR DE TAREAS JAVA =======
                =====================================
                Ingrese un digito para alguna accion
                1. Agregar tarea
                2. Marcar tarea como completada
                3. Listar tareas incompletas
                4. Salir
                """);
            int desicion = scanner.nextInt();
            scanner.nextLine();
            
            switch (desicion) {
                case 1:
                    System.out.println("Escriba el asunto:");
                    String asunto = scanner.nextLine();
                    System.out.println("Escriba la descripcion de la tarea:");
                    String descipcion = scanner.nextLine();
                    boolean banderaTarea = false;
                    System.out.println("Escriba el dia de inicio:");
                    int diaInicio = scanner.nextInt();
                    System.out.println("Escriba el mes de inicio:");
                    int mesInicio = scanner.nextInt();
                    System.out.println("Escriba el anio de inicio:");
                    int anioInicio = scanner.nextInt();
                    System.out.println("Escriba el dia de fin:");
                    int diaFin = scanner.nextInt();
                    System.out.println("Escriba mes fin:");
                    int mesFin = scanner.nextInt();
                    System.out.println("Escriba anio fin:");
                    int anioFin = scanner.nextInt();
                    
                    Tarea tarea = new Tarea(asunto, descipcion, banderaTarea, diaInicio, mesInicio, anioInicio, diaFin, mesFin, anioFin);
                    tareas.add(tarea);
                    break;
                case 2:
                    System.out.println("\n\n\n===========================================");
                    System.out.println("ELIJA UNA TAREA PARA MARCAR COMO COMPLETADA");
                    System.out.println("===========================================\n\n\n");
                    imprimirTareas(tareas);
                    int desicion2 = scanner.nextInt();
                    tareas.get(desicion2 - 1).setCompletada(true);
                    break;
                case 3:
                    System.out.println("\n\n\n=====================================");
                    System.out.println("==========TAREAS PENDIENTES==========");
                    System.out.println("=====================================\n\n\n");
                    imprimirTareas(tareas);
                    break;
                default:
                    bandera = true;
                    break;
            }
        }
    }

    static void imprimirTareas(ArrayList<Tarea> tareas){
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).isCompletada() == false) {
                System.out.println("=====================================");
                System.out.printf("Tarea numero: %d%n", i + 1);
                System.out.println(tareas.get(i).getAsunto());
                System.out.println(tareas.get(i).getDescripcion());
                System.out.println(tareas.get(i).isCompletada() ? "Completa" : "Incompleta");
                System.out.println("=====================================");
                System.out.printf("Fecha inicio: %d-%d-%d%n", 
                    tareas.get(i).getDiaInicio(),
                    tareas.get(i).getMesInicio(),
                    tareas.get(i).getAnioInicio()
                );
                System.out.printf("Fecha fin: %d-%d-%d%n",
                    tareas.get(i).getDiaFin(),
                    tareas.get(i).getMesFin(),
                    tareas.get(i).getAnioFin()
                );
                System.out.println("=====================================\n");
            }
        }
    }
}
