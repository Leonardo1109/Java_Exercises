package Tareas.T28_Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class MCD {
    static ArrayList<Integer> multiplosParaMCD = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el primer numero para obtener su MCD: ");
        int primerNumero = scanner.nextInt();
        System.out.print("Digite el segundo numero para obtener su MCD: ");
        int segundoNumero = scanner.nextInt();
        generadorMCD(primerNumero, segundoNumero);
    }

    static void generadorMCD(int primerNumero, int segundoNumero){
        if (primerNumero < segundoNumero) {
            int tmp = primerNumero;
            primerNumero = segundoNumero;
            segundoNumero = tmp;
        }

        int contador = 2;
        
        int tmpPrimerNumero = primerNumero, tmpSegundoNumero = segundoNumero;
        do {
            if (primerNumero % contador == 0 && segundoNumero % contador == 0) {
                System.out.println(contador);
                multiplosParaMCD.add(contador);
                primerNumero /= contador;
                segundoNumero /= contador;
            }else{
                contador++;
            }
        } while (contador < primerNumero);

        if (multiplosParaMCD.size() == 0) {
            System.out.println("Sin maximo comun divisor");
        }else{
            int mcd = 1;
            for (int i = 0; i < multiplosParaMCD.size(); i++) {
                mcd *= multiplosParaMCD.get(i);
            }
            System.out.printf("El maximo comun divisor de %d y de %d es: %d%n", tmpPrimerNumero,
            tmpSegundoNumero, mcd);
        }
    }
}
