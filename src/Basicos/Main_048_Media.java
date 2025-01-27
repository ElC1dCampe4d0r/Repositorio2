package Basicos;

import java.util.Scanner;

public class Main_048_Media {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        double media = 0;
        int repeticiones = 0;

        System.out.println("Diga numeros para hacer su medi, cuando diga 0, el programa parará y hará la media");
        int numero = teclado.nextInt();

        while (numero != 0){
            suma = numero + suma;

            numero = teclado.nextInt();

            repeticiones++;
        }

        if (repeticiones > 0) {
            media = (double)suma / repeticiones;
        } else {
            System.out.println("No se ingresaron valores.");
            return;
        }
        System.out.println("La media de los valores ingresados es: " + media);
    }
}
