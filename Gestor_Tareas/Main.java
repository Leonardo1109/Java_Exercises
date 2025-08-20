package Gestor_Tareas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaUno = LocalDate.parse("2003-09-11");
        LocalDate fechaDos = LocalDate.now();
        TareasDos tareasDos = new TareasDos(
            "Primer tarea", 
            "Esta es la primer tarea realizada con un constructor", 
            fechaUno, 
            fechaDos);
        System.out.println(LocalDate.now());

        System.out.println(tareasDos.getFechaInicio());
        tareasDos.setFechaInicio(tareasDos.getFechaInicio().plusDays(10));
        System.out.println(tareasDos.getFechaInicio());
        System.out.println(tareasDos.getFechaFin().compareTo(tareasDos.getFechaInicio()));
        tareasDos.setFechaInicio(tareasDos.getFechaInicio().minusDays(10));
        System.out.println(tareasDos.getFechaInicio());

        long semanas = ChronoUnit.WEEKS.between(tareasDos.getFechaInicio(), tareasDos.getFechaFin());

        System.out.println(semanas);

    }

}
