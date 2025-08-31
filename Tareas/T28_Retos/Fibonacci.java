package Tareas.T28_Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    static ArrayList<Integer> serieFibonacci = new ArrayList<>();
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite la cantidad de numeros que desea para la serie: ");
            int cantidad = scanner.nextInt();
            sumaFibonacci(cantidad);
        }
    
        private static void sumaFibonacci(int cantidad) {
            serieFibonacci.add(0);
            serieFibonacci.add(1);

            for (int index = 0; index < cantidad; index++) {                
                serieFibonacci.add(
                    serieFibonacci.get(serieFibonacci.size() - 1) +
                    serieFibonacci.get(serieFibonacci.size() - 2));
            }

            for (int index = 0; index < serieFibonacci.size(); index++) {
                System.out.println(serieFibonacci.get(index));
            }
    }

}
