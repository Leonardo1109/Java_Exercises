package Tareas;

import java.util.Scanner;

public class T5_Rango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer valor: ");
        var primerValor = scanner.nextInt();
        System.out.println("Segundo valor: ");
        var segundoValor = scanner.nextInt();
        System.out.println("Valor para verificar: ");
        var valorAVerificar = scanner.nextInt();

        if (primerValor > segundoValor) {
            var tmp = primerValor;
            primerValor = segundoValor;
            segundoValor = tmp;
        }

        if(valorAVerificar >= primerValor && valorAVerificar <= segundoValor){
            System.out.println("El valor esta en el rango. OK");
        }else{
            System.out.println("El valor no esta en el rango. Not OK");
        }
    }
}
