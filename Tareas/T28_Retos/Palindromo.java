package Tareas.T28_Retos;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba la palabra a encontrar para verificar un palindromo: ");
        String palabra = scanner.nextLine();
        System.out.println(esPalindromo(palabra));
        System.out.println(palabra.length());
    }

    private static boolean esPalindromo(String palabra){
        palabra = palabra.replaceAll(" ", "");
        palabra = palabra.toLowerCase();
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
