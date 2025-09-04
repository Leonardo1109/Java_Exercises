package Tareas.T28_Retos;

import java.util.Scanner;

public class Caracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el texto donde buscaremos el caracter: ");
        String texto = scanner.nextLine();
        System.out.print("Escriba el caracter a buscar: ");
        String caracter = scanner.nextLine();
        caracter = caracter.length() > 1 ? caracter.substring(0, 1) : caracter;
        System.out.printf("El texto %s tiene %d veces este caracter: %s%n" ,
            texto, vecesRepetidas(texto, caracter), caracter);
    }

    private static int vecesRepetidas(String texto, String caracter){
        if (caracter.isEmpty() || texto.isEmpty()) {
            System.out.println("Valores invalidos");
            return 0;
        }
        
        texto = texto.toLowerCase();
        caracter = caracter.toLowerCase();

        int vecesRepetidas = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter.charAt(0)) {
                vecesRepetidas += 1;
            }
        }

        return vecesRepetidas;
    }
}
