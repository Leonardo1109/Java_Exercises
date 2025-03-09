package Bucles;

import java.util.Scanner;

/* 
 * Generar la tabla de multiplicar deseada por el usuario
 */

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite la tabla de multiplicar que desea: ");
        int numeroX = scanner.nextInt();
        System.out.print("Digite hasta que numero desea la tabla: ");
        int numeroY = scanner.nextInt();

        for (int i = 1; i <= numeroY; i++) {
            System.out.printf("%d * %d = %d\n", numeroX, i, numeroX * (i));
        }

        scanner.close();
    }
}
