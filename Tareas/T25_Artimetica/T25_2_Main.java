package Tareas.T25_Artimetica;

public class T25_2_Main {
    public static void main(String[] args) {
        T25_1_Aritmetica operaciones = new T25_1_Aritmetica(154, 32.21);
        System.out.printf("""
                %.2f
                %.2f
                %.2f
                %.2f
                """, operaciones.sumar(), operaciones.restar(),
                operaciones.multiplicar(), operaciones.dividir());
    }
}
