package Datos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenamientoDatos {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String ruta = "/home/leonardo/Escritorio/Universidad/Personal_Code/Java_Exercises/Lista";
        List<String> palabrasOrdenadas = new ArrayList<String>();


        try (BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (String palabra : palabras) {
                    palabrasOrdenadas.add(palabra);
                }
            }
            Collections.sort(palabrasOrdenadas);
            System.out.println(palabrasOrdenadas);
        }
    }
}
