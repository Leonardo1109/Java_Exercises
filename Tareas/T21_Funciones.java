package Tareas;

public class T21_Funciones {
    public static void main(String[] args) {
        imprimir("Hola mundo");
        System.out.println(sumar(10, 15));
        par(10);
        par(5);
        System.out.println(sumaRecursiva(5));
        cadena("Hola mundo");
    }

    private static void imprimir(String texto){
        System.out.println(texto);
    }

    private static int sumar (int a, int b){
        int resultado = a + b;
        return resultado;
    }

    private static void par (int numero){
        boolean esPar = numero % 2 == 0 ? true : false;
        System.out.println(esPar == true ? numero + " es par" : numero + " no es par");
    }

    private static int sumaRecursiva (int numeroFinal){
        if (numeroFinal <= 0) {
            return 0;
        }else{
            return numeroFinal + sumaRecursiva(numeroFinal - 1);
        }
    }

    private static void cadena (String cadena){
        System.out.printf("%s tiene %d caracteres%n", cadena, cadena.length());
        for (int i = 0; i < cadena.length(); i++) {
            System.out.printf("%s ", cadena.charAt(i));
        }
    }
}
