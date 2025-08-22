package Tareas;

import java.util.Scanner;

public class T16_Cajero_Automatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dinero = 1000;

        var bandera = false;
        do {
            System.out.println("""
                ELoja una opcion:
                1. Depositar
                2. Retirar
                3. Consultar Saldo
                4. Salir
                """);
            var opcionElegida = scanner.nextInt();

            switch (opcionElegida) {
                case 1:
                    System.out.print("Ingrese una cantidad a depositar: ");
                    var montoExtra = scanner.nextDouble();
                    dinero += montoExtra;
                    break;
                case 2:
                    System.out.print("Ingrese una cantidad: ");
                    var montoMenos = scanner.nextDouble();
                    dinero -= montoMenos;
                    break;
                case 3:
                    System.out.println("Su saldo es de: " + dinero);
                    break;
                default:
                    bandera = true;
                    break;
            }
        } while (!bandera);
    }
}
