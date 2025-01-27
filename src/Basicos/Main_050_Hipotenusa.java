package Basicos;

import java.util.Scanner;

public class Main_050_Hipotenusa {
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Vamos a calcular la hipotesusa de un triángulo, proporcioname los catetos para ello");

        System.out.print("Dime la medida del cateto 1: ");
        double cateto1 = teclado.nextInt();

        System.out.print("Dime la medida del cateto 2: ");
        double cateto2 = teclado.nextInt();

        double hipotenusa = calcularHipotenusa(cateto1, cateto2);

        System.out.printf("La hipotenusa mide: %.2fm%n", hipotenusa);
    }
}
