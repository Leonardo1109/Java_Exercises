package Tareas;

public class T14_Suma_For {
    public static void main(String[] args) {
        final var VALORFINAL = 5;
        var sumaFinal = 0;

        for (int i = 0; i <= VALORFINAL; i++) {
            sumaFinal += i;
        }

        System.out.println(sumaFinal);

    }
}
