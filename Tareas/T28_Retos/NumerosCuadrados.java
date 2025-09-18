package Tareas.T28_Retos;

public class NumerosCuadrados {
    public static void main(String[] args) {
        int n = 24;
        if (n < 0) {
            System.out.println(false);
        }
        int raiz = (int) Math.sqrt(n);
        System.out.println(raiz * raiz == n);
    }
}
