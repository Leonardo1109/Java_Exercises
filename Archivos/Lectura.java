package Archivos;

import java.io.BufferedReader;
import java.io.FileReader;

public class Lectura {
    public static void main(String[] args) {
        String ruta = "/home/leonardo/Escritorio/Universidad/Personal_Code/Java_Exercises/Lista";
        int contador = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                contador += palabras.length;
            }
        System.out.printf("Palabras contadas: %d", contador);
        } catch (Exception e) {
            System.out.println("Error de lectura");
        }
    }
}
