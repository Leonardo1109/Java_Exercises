package Tareas;

import java.util.Scanner;

public class T9_MayorDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el primer valor: ");
        var primerValor = scanner.nextDouble();
        System.out.println("Escriba el segundo valor: ");
        var segundoValor = scanner.nextDouble();

        /*
        if (primerValor > segundoValor) {
            System.out.println(primerValor + " es mayor");
        } else if (segundoValor > primerValor) {
            System.out.println(segundoValor + " es mayor");
        } else {
            System.out.println("Ambos valores son iguales");
        }
        */

        System.out.println(primerValor > segundoValor ? primerValor + " es mayor" : 
                                segundoValor > primerValor ? segundoValor + " es mayor"
                                    : "Ambos son iguales");

    }
}
