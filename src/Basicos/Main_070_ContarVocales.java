package Basicos;

import java.util.Scanner;

public class Main_070_ContarVocales {
    public static int contarVocales(String texto){
        texto.toLowerCase();

        int contador = 0;

        int longitudaTexto = texto.length();

        for (int i = 0; i < longitudaTexto; i++){
            char letra = texto.charAt(i);

            // Si la letra es una vocal (incluyendo acentuadas)
            if (letra == 'a' || letra == 'á' || letra == 'e' || letra == 'é' || letra == 'i' || letra == 'í' || letra == 'o' || letra == 'ó' || letra == 'u' || letra == 'ú') {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba una palabra");
        String texto = teclado.nextLine();

        int numeroVocales = contarVocales(texto);

        System.out.println("El número de vocales es: " + numeroVocales );
    }

}
