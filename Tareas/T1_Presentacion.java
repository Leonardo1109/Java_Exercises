package Tareas;
public class T1_Presentacion {
    public static void main(String[] args) {
        // esta primera parte solo es un print en la consola sencillo
        System.out.println("Hola, mi nombre es Leonardo");
        System.out.println("Tengo 22 años");
        System.out.println("Vivo en México");

        // Ahora usaremos variables
        String nombre = "Leo";
        int edad = 22;
        String pais = "Mexico";

        // %s -> String | %n -> Salto linea | %d -> numero
        System.out.printf("%s%n%d%n%s%n", nombre, edad, pais);

        // var nombreDos = "Leonardo";
    }
}
