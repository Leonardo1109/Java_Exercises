package Tareas.T28_Retos;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el primer numero para obtener su MCD: ");
        int numeroAVerificar = scanner.nextInt();
        System.out.println(verificarPrimo(numeroAVerificar));
    }
    
    private static boolean verificarPrimo(int numero){
        if (numero <= 1) {
            return false;
        } else {
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
