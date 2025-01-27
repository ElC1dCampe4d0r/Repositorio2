package Basicos;

import java.util.Scanner;

public class Main_072_ContarConsonantes {
    public static int contarConsonantes(String texto) {
        texto = texto.toLowerCase();  // Convertimos a minúsculas
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            // Si es una letra pero no es vocal
            if (letra > 'a' && letra <= 'z' && !( letra == 'á' || letra == 'e' || letra == 'é' || letra == 'i' || letra == 'í' || letra == 'o' || letra == 'ó' || letra == 'u' || letra == 'ú')) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba una palabra:");
        String texto = teclado.nextLine();

        int numeroConsonantes = contarConsonantes(texto);

        System.out.println("El número de consonantes es: " + numeroConsonantes);
    }
}
