package Tareas;

import java.util.Scanner;

public class T7_ValorPositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el valor para verificar: ");
        var valorAVerificar = scanner.nextInt();
        
        if (valorAVerificar > 0) {
            System.out.println(valorAVerificar + " es mayor a 0");
        }else{
            System.out.println(valorAVerificar + " es menor a 0");
        }
    }
}
