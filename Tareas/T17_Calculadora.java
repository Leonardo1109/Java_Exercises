package Tareas;

import java.util.Scanner;

public class T17_Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var bandera = false;
        var resultado = 0.00;
        do {
            System.out.printf("""
                    Menu:
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Dividir
                    5. Salir
                    
                    Resultado %.2f
                    Escoja una opcion:
                    """, resultado);
            var decision = scanner.nextInt();
            decision = (decision == 1 || decision == 2 || decision == 3 ||
            decision == 4 || decision == 5)
                ? decision 
                : 5;

            switch (decision) {
                case 1 -> {
                    System.out.print("Ingrese una cantidad para sumar: ");    
                    var tmp = scanner.nextDouble();
                    resultado += tmp;
                }
                case 2 -> {
                    System.out.print("Ingrese una cantidad para restar: ");    
                    var tmp = scanner.nextDouble();
                    resultado -= tmp;
                }
                case 3 -> {
                    System.out.print("Ingrese una cantidad para multiplicar: ");    
                    var tmp = scanner.nextDouble();
                    resultado *= tmp;
                }
                case 4 -> {
                    System.out.print("Ingrese una cantidad para dividir: ");    
                    var tmp = scanner.nextDouble();
                    resultado /= tmp;
                }
                default -> {
                    bandera = true;
                    break;
                }
            }
        } while (!bandera);
    }
}
