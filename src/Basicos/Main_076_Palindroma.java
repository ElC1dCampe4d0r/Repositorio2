package Basicos;

import java.util.Scanner;

public class Main_076_Palindroma {
    public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase();
        int longitud = texto.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (texto.charAt(i) != texto.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba una palabra:");
        String texto = teclado.nextLine();

        if (esPalindromo(texto)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }
}
