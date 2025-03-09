package Funciones;

import java.util.Scanner;

/*
 * clase que tenga funciones para cambiar Celsius a Fahrenheit y viceversa
 */

public class CelsiusFahrenheitCelcius {
    public static double CelsiusToFahrenheit(double Celsius){
        double Fahrenheit = (Celsius * 9 / 5) + 32;
        return Fahrenheit;
    }

    public static double FahrenheitToCelsius(double Fahrenheit){
        double Celsius = (Fahrenheit - 32) * 5 / 9;
        return Celsius;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 si quiere convertir Celsius a Fahrenheit");
        System.out.println("Digite 2 si quiere convertir Fahrenheit a Celsius");
        int i = scanner.nextInt();

        System.out.print("Digite la temperatura que desea cambiar: ");
        double temp = scanner.nextDouble();

        if (i == 1) {
            System.out.println(CelsiusToFahrenheit(temp));
        }else if (i == 2) {
            System.out.println(FahrenheitToCelsius(temp));
        }else{
            System.out.println("Digite un valor valido");
        }

        scanner.close();
    }
}