package Tareas;

import java.util.Scanner;

public class T8_ComparacioCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba la primer cadena: ");
        var primeraCadena = scanner.nextLine();
        System.out.println("Escriba la segunda cadena: ");
        var segundaCadena = scanner.nextLine();

        if (primeraCadena.equals(segundaCadena)) {
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Las cadenas no son iguales");
        }
    }
}
