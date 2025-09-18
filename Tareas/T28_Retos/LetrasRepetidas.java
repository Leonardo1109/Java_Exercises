package Tareas.T28_Retos;
import java.util.Scanner;

/*
 * El siguiente codigo tiene como funcion poder encontrar letras repetidas en una oracion
 * Por ejemplo si tenemos "Hola mundo!", de esta frase generaremos un nuevo string en donde
 * si algun caracter se repite lo cambiaremos por ), en caso que no lo cambiaremos por (
 * 
 * Retomando el ejemplo de "Hola mundo!" la salida será la siguente:
 * Hola mundo!
 * ()((((((()(
 *  
 */

public class LetrasRepetidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba la frase para modificar: ");    
        String textoPrevio = scanner.nextLine().toLowerCase();

        StringBuilder resultado = new StringBuilder();

        // Hola mundo!

        for (int i = 0; i < textoPrevio.length(); i++) {
            char c = textoPrevio.charAt(i);
            int ocurrencias = 0;

            for (int j = 0; j < textoPrevio.length(); j++) {
                if (textoPrevio.charAt(j) == c) {
                    ocurrencias++;
                }
            }

            resultado.append(ocurrencias > 1 ? ")" : "(");
        }

        System.out.println(textoPrevio);
        System.out.println(resultado);
    }    
}
