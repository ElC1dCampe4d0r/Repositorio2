package Basicos;

import java.util.Scanner;

public class Main_074_FraseInvertida{
    public static String invertirPalabra(String texto) {
        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        return textoInvertido;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba una palabra:");
        String texto = teclado.nextLine();

        String textoInvertido = invertirPalabra(texto);

        System.out.println("La palabra invertida es: " + textoInvertido);
    }
}
