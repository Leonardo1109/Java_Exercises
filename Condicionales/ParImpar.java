import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero a verificar si es par o impar: ");
        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.printf("%d es par", numero);
        }else{
            System.out.printf("%d es impar", numero);
        }

        scanner.close();
    }
}
