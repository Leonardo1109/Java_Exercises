package InputOperacion;

import java.time.Year;
import java.util.Scanner;

public class CalculadoraEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anioActual = Year.now().getValue();

        System.out.print("Digite el año de su nacimiento en formato AAAA: ");
        int anio = scanner.nextInt();

        System.out.printf("Su edad es de: %d", anioActual - anio);

        scanner.close();
    }
}
