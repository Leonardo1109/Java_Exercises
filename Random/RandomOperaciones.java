package Random;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.Random;
import java.awt.Desktop;

/* 
 * Programa para generar operaciones matematicas con el fin de fortalecer habilidades matematicas
 * 2 -> 1 digito
 * 2 -> 2 digitos
 * 2 -> 5 digitos
 * 2 -> 8 digitos
 * Conectar a Whatsapp
 */

public class RandomOperaciones {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder operaciones = new StringBuilder();

        generarOperaciones(random, operaciones, 0, 10, 0, 7);
        generarOperaciones(random, operaciones, 10, 100, 8, 15);
        generarOperaciones(random, operaciones, 10000, 100000, 16, 23);
        generarOperaciones(random, operaciones, 10000000, 100000000, 24, 31);

        System.out.println(operaciones);
        WhatsappSender(operaciones);
    }

    private static void generarOperaciones(Random random, StringBuilder operaciones, int x, int y, int inicio, int fin) {
        for (int i = inicio; i <= fin; i += 2) {
            double primerStr = x + (y - x) * random.nextDouble();
            double segundoStr = x + (y - x) * random.nextDouble();

            String primerValor = String.format("%.2f", primerStr);
            String segundoValor = String.format("%.2f", segundoStr);;

            String operacion = switch (i % 8) {
                case 0, 1 -> primerValor + " + " + segundoValor;
                case 2, 3 -> primerValor + " - " + segundoValor;
                case 4, 5 -> primerValor + " * " + segundoValor;
                case 6, 7 -> primerValor + " / " + segundoValor;
                default -> "";
            };

            operaciones.append(operacion).append("\n");
        }
    }

    private static void WhatsappSender(StringBuilder operaciones) {
        try {
            String encodedMessage = URLEncoder.encode(operaciones.toString(), "UTF-8");
            String numeroTelefono = "5553857310";
            String url = "https://wa.me/" + numeroTelefono + "?text=" + encodedMessage;
    
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(new URI(url));
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            System.err.println("Error al intentar abrir WhatsApp.");
        }
    }
    
}
