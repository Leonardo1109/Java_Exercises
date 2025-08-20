package InputOperacion;

import java.util.Scanner;

/* Programa que el usuario digite numeros y el programa los opere */

public class InputOperacion {

    public static void main(String[] args) {
        int primerValor;
        int segundoValor;
        String nombre;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        primerValor = scanner.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        segundoValor = scanner.nextInt();
        System.out.println("Ingrese su nombre: ");
        nombre = scanner.next();
                
        System.out.println(nombre + " Los numeros digitados son: " + primerValor + " y " + segundoValor);        
        System.out.println(nombre + " La suma de estos digitos es: " + (primerValor + segundoValor));
        System.out.println(nombre + " La resta de estos numeros es: " + (primerValor - segundoValor));
        System.out.println(nombre + " La multiplicacion de estos numeros es: " + (primerValor * segundoValor));
        System.out.println(nombre + " La division de estos valores es: " + (primerValor / segundoValor));

        scanner.close();
    }
}
