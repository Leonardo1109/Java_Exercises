package Cifrado;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Cifrado {
    public static void main(String[] args) {
        String textoCifrar = "Нажми на кнопку Черниковская Хата\n" + //
                        "Каждую ночь ты сидишь у окна\n" + //
                        "Перемещая звезды\n" + //
                        "Каждую ночь тебе не до сна\n" + //
                        "Все это так серьезно\n" + //
                        "Я помню, я знаю\n" + //
                        "Ветер в твоих руках\n" + //
                        "Искусственным раем\n" + //
                        "Бредишь в своих мечтах\n" + //
                        "Нажми на кнопку - получишь в результат\n" + //
                        "И твоя мечта осуществится\n" + //
                        "Нажми на кнопку, но что же ты не рад\n" + //
                        "Тебе больше не к чему стремиться\n" +  //
                        "В шорохе капель ночного дождя\n" + //
                        "Зашифровал надежду\n" + //
                        "Выстроил мир, где ты у руля\n" + //
                        "Что ж ты не спишь как прежде\n" + //
                        "Скажи, почему ты\n" + //
                        "Медлишь исполнить план\n" + //
                        "Считая минуты\n" + //
                        "Смотришь на пустой экран\n" + //
                        "Нажми на кнопку - получишь в результат\n" + //
                        "И твоя мечта осуществится\n" + //
                        "Нажми на кнопку, но что же ты не рад\n" + //
                        "Тебе больше не к чему стремиться\n" + //
                        "Нажми на кнопку - получишь в результат\n" + //
                        "И твоя мечта осуществится\n" + //
                        "Нажми на кнопку, но что же ты не рад\n" + //
                        "Тебе больше не к чему стремиться\n" + //
                        "Нажми на кнопку - получишь в результат\n" + //
                        "И твоя мечта осуществится\n" + //
                        "Нажми на кнопку, но что же ты не рад\n" + //
                        "Тебе больше не к чему стремиться\n" + //
                        "Нажми на кнопку - получишь в результат\n" + //
                        "И твоя мечта осуществится\n" + //
                        "Нажми на кнопку, но что же ты не рад\n" + //
                        "Тебе больше не к чему стремиться\n" + //
                        "\nVаlегiа Оlvега Магтiиеz";

        System.out.println(textoCifrar);

        System.out.println(cifrar(textoCifrar));
        
        String textoCifrado = cifrar(textoCifrar);
        guardarEnArchivo("salida.txt", textoCifrar, textoCifrado);
    }
        
    public static String cifrar(String texto){
        StringBuilder textoCifrado = new StringBuilder();
        String abecedarioRuso = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯVLIZабвгдеёжзийклмнопрстуфхцчшщъыьэюяvliz";
        // Valeria Olvera Martinez
        // Vаlегiа Olvега Магтiиеz  vliz
        String primerCifrado = "☰☱☲☳☴☵☶☷~⚔⚖⚙✠✡✢❂❇❖❘❥⟁⨀⨁⨂⨃⬢⬡⬣⬤♠♣♥♦¶µ¦|☰☱☲☳☴☵☶☷~⚔⚖⚙✠✡✢❂❇❖❘❥⟁⨀⨁⨂⨃⬢⬡⬣⬤♠♣♥♦¶µ¦|";
        String segundoCifrado = "⨄⨅⨆⨇⨈⨉⨊⨋⨌⨍⨎⨏⨐⨑⨒⨕⨖⨗⨘⨙⨚⨛⨜⨝⨞⨟⨠⨡⨢⨣⨤⨥⨦∞†≈_⨄⨅⨆⨇⨈⨉⨊⨋⨌⨍⨎⨏⨐⨑⨒⨕⨖⨗⨘⨙⨚⨛⨜⨝⨞⨟⨠⨡⨢⨣⨤⨥⨦∞†≈_";
        String tercerCifrado = "≠≡≢≣≤≥≦≧≨≩≪≬≭≮≯≰≱≲≳≴≵≶≷≸≹≺≻≼≽+*/!-^¬°≠≡≢≣≤≥≦≧≨≩≪≬≭≮≯≰≱≲≳≴≵≶≷≸≹≺≻≼≽+*/!-^¬°";
        
        Map<Character, String> cifradoMap = new HashMap<>();
        for (int i = 0; i < abecedarioRuso.length(); i++) {
            char letra = abecedarioRuso.charAt(i);
            cifradoMap.put(letra, "" + primerCifrado.charAt(i) + segundoCifrado.charAt(i) + tercerCifrado.charAt(i));
        }

        Set<Character> caracteresNoEncontrados = new HashSet<>();

        for (int i = 0; i < texto.length(); i++) {
            char currentChar = texto.charAt(i);

            if (currentChar == '\n' || currentChar == ' ') {
                textoCifrado.append(currentChar);
            } else {
                String cifrado = cifradoMap.get(currentChar);
                if (cifrado != null) {
                    textoCifrado.append(cifrado);
                } else {
                    caracteresNoEncontrados.add(currentChar);
                }
            }
        }
        
        if (!caracteresNoEncontrados.isEmpty()) {
            System.out.println("Caracteres no encontrados en el cifrado: " + caracteresNoEncontrados);
        }

        System.out.println();
        System.out.println();
        System.out.println(cifradoMap);
        System.out.println();
        System.out.println();

        return textoCifrado.toString();
    }

    public static void guardarEnArchivo(String nombreArchivo, String textoOriginal, String textoCifrado) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write("TEXTO ORIGINAL:\n");
            writer.write(textoOriginal + "\n\n");

            writer.write("TEXTO CIFRADO:\n");
            writer.write(textoCifrado + "\n\n");

            writer.write("DICCIONARIO DE CIFRADO:\n");
            String abecedarioRuso = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯVLIZабвгдеёжзийклмнопрстуфхцчшщъыьэюяvliz";
            String primerCifrado = "☰☱☲☳☴☵☶☷~⚔⚖⚙✠✡✢❂❇❖❘❥⟁⨀⨁⨂⨃⬢⬡⬣⬤♠♣♥♦¶µ¦|☰☱☲☳☴☵☶☷~⚔⚖⚙✠✡✢❂❇❖❘❥⟁⨀⨁⨂⨃⬢⬡⬣⬤♠♣♥♦¶µ¦|";
            String segundoCifrado = "⨄⨅⨆⨇⨈⨉⨊⨋⨌⨍⨎⨏⨐⨑⨒⨕⨖⨗⨘⨙⨚⨛⨜⨝⨞⨟⨠⨡⨢⨣⨤⨥⨦∞†≈_⨄⨅⨆⨇⨈⨉⨊⨋⨌⨍⨎⨏⨐⨑⨒⨕⨖⨗⨘⨙⨚⨛⨜⨝⨞⨟⨠⨡⨢⨣⨤⨥⨦∞†≈_";
            String tercerCifrado = "≠≡≢≣≤≥≦≧≨≩≪≬≭≮≯≰≱≲≳≴≵≶≷≸≹≺≻≼≽+*/!-^¬°≠≡≢≣≤≥≦≧≨≩≪≬≭≮≯≰≱≲≳≴≵≶≷≸≹≺≻≼≽+*/!-^¬°";

            for (int i = 0; i < abecedarioRuso.length(); i++) {
                writer.write(abecedarioRuso.charAt(i) + " -> " +
                        primerCifrado.charAt(i) + segundoCifrado.charAt(i) +
                        tercerCifrado.charAt(i) + "\n");
            }

            System.out.println("Archivo guardado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    
}
