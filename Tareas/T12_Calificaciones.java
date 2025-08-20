package Tareas;

import java.util.Scanner;

public class T12_Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite su calificacion numerica: ");

        var calificacion = scanner.nextDouble();
        char notaLetra;

        calificacion = calificacion > 10 ? 10 : calificacion < 0 ? 0 : calificacion;

        if (calificacion <= 10 && calificacion >= 9) {
            notaLetra = 'A';
        } else if (calificacion >= 8 && calificacion < 9) {
            notaLetra = 'B';
        } else if (calificacion >= 7 && calificacion < 8) {
            notaLetra = 'C';
        } else if (calificacion >= 6 && calificacion < 7) {
            notaLetra = 'D';
        } else {
            notaLetra = 'F';
        }

        System.out.printf("La nota obtenida fue: %.2f = %s%n", calificacion, notaLetra);
    }
}
