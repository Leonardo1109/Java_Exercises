package Tareas;

import java.util.Scanner;

public class T10_IdentificarEstaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un mes del año: ");
        var mesAnio = scanner.nextInt();
        mesAnio = mesAnio > 12 ? 1 : mesAnio < 1 ? 1 : mesAnio;
        String estacion;

        estacion = mesAnio == 1 || mesAnio == 2 || mesAnio == 12 ? "Invierno" :
            mesAnio >= 3 && mesAnio <=  5 ? "Primavera" :
            mesAnio >= 6 && mesAnio <= 8 ? "Verano" :
            mesAnio >= 9 && mesAnio <= 11 ? "Otoño" : "Estacion desconocida";
        
        System.out.println("El mes: " + mesAnio + " corresponde a esta estacion: " + estacion);
    }
}
