package Basicos;

import java.util.Scanner;

public class Main_054_SumarDigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int memoriaDigito = 0;
        int sumaDigitos = 0;

        System.out.print("Ingrese un número entero para calcular la suma de sus dígitos: ");
        int numero = teclado.nextInt();
        numero = Math.abs(numero);

        int cantidadDigitos = (int) Math.log10(numero) + 1;

        for (int i = 1; i <= cantidadDigitos ; i++) {
            memoriaDigito = numero % 10;
            sumaDigitos = memoriaDigito + sumaDigitos;
            numero = numero / 10;
        }
        System.out.println("La suma de los dígitos del número ingresado es: " + sumaDigitos);
    }
}
