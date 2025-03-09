import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el numero a verificar: ");
        double numero = scanner.nextDouble();

        if(numero > 0){
            System.out.printf("%.2f Es positivo", numero);
        }
        if (numero < 0) {
            System.out.printf("%.2f Es negativo", numero);
        }
        if (numero == 0) {
            System.out.println("El numero es 0");
        }

        scanner.close();
    }
}
