package Tareas.T28_Retos;

import java.util.Scanner;

public class MCD2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el primer numero para obtener su MCD: ");
        int primerNumero = scanner.nextInt();
        System.out.print("Digite el segundo numero para obtener su MCD: ");
        int segundoNumero = scanner.nextInt();
        calculadorMCD(primerNumero, segundoNumero);
    }

    private static void calculadorMCD(int primerNumero, int segundoNumero){
        if (primerNumero > 0 && segundoNumero > 0) {
            if (primerNumero < segundoNumero) {
                int tmp = primerNumero;
                primerNumero = segundoNumero;
                segundoNumero = tmp;
            }

            int tmpPrimerNumero = primerNumero;
            int tmpSegundoNumero = segundoNumero;

            while (segundoNumero != 0) {
                int tmp = segundoNumero;
                segundoNumero = primerNumero % segundoNumero;
                primerNumero = tmp;
            }

            System.out.printf("El MCD de %d y de %d es: %d%n", tmpPrimerNumero, tmpSegundoNumero, primerNumero);
        }
    }
}
