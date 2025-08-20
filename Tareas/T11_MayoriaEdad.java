package Tareas;

import java.util.Scanner;

public class T11_MayoriaEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite su edad: ");
        var edad = scanner.nextInt();

        System.out.println(edad >= 18 ? edad + " es mayor de edad" :
            edad + " no es mayor de edad");
    }
}
