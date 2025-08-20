package InputOperacion;

import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) {
        String dia;
        String mes;
        String anio;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el dia: ");
        dia = scanner.nextLine();
        System.out.println("Digite el mes: ");
        mes = scanner.nextLine();
        System.out.println("Digite el año: ");
        anio = scanner.nextLine();
        System.out.printf("La fecha seleccionada es: %s-%s-%s", dia, mes, anio);
    }
}
