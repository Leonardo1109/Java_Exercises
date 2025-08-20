package Tareas;

import java.util.Scanner;

public class T6_Rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer lado del rectangulo: ");
        var primerLado = scanner.nextInt();
        System.out.println("Ingrese el segundo lado del rectangulo: ");
        var segundoLado = scanner.nextInt();

        var area = primerLado * segundoLado;
        var perimetro = primerLado * 2 + segundoLado * 2;
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro es: " + perimetro);
    }
}
