package Tareas;

public class T21_Funciones {
    public static void main(String[] args) {
        imprimir("Hola mundo");
        System.out.println(sumar(10, 15));
        par(10);
        par(5);
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
}
