package InputOperacion;

import java.util.Scanner;

public class CambioTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("La temperatura que ingreso en grados Fahrenheit es: " + fahrenheit);
        scanner.close();
    }
}
