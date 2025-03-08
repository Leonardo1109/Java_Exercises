package InputOperacion;

import java.util.Scanner;

/* Programa que el usuario digite numeros y el programa los opere */

public class InputOperacion {
    public int primerValor;
    public int segundoValor;

    public static void main(String[] args) {
        InputOperacion inputOperacion = new InputOperacion();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        inputOperacion.primerValor = scanner.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        inputOperacion.segundoValor = scanner.nextInt();
        
        System.out.printf("Los numeros digitados son: " + inputOperacion.primerValor + " y " +
            inputOperacion.segundoValor);        
        
        System.out.println("\nLa suma de estos digitos es: " + 
            (inputOperacion.primerValor + inputOperacion.segundoValor));
        System.out.println("La resta de estos numeros es: "+
            (inputOperacion.primerValor - inputOperacion.segundoValor));
        System.out.println("La multiplicacion de estos numeros es: " +
            (inputOperacion.primerValor * inputOperacion.segundoValor));
        System.out.println("La division de estos valores es: " + 
            (inputOperacion.primerValor / inputOperacion.segundoValor));

        scanner.close();
    }
}
