package Bucles;

import java.util.Scanner;

/* 
 * Crear un programa que muestre x valor de la serie de Fibonacci
 */

public class Fibonacci {
    public static void main(String[] args) {
        int primerValor;
        int segundoValor;
        int tercerValor;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite los numeros que desea ver de la serie de Fibonacci: ");
        int i = scanner.nextInt();

        if (i > 2) { // evitamos problemas con la serie
            System.out.print("Digite el primer valor: ");
            primerValor = scanner.nextInt();
            System.out.print("Digite el segundo valor: ");
            segundoValor = scanner.nextInt();

            System.out.print(primerValor + " ");
            System.out.print(segundoValor + " ");
            for (int j = 0; j < i - 2; j++) {
                tercerValor = primerValor + segundoValor;
                primerValor = segundoValor;
                segundoValor = tercerValor;
                System.out.print(tercerValor + " ");
            }
        }

        scanner.close();
    }
}
