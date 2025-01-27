package Arrays;

import java.util.Scanner;

public class E104SumaTotalConArrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Diga cuantos números va a sumar");

        int[] numeros = new int[teclado.nextInt()];
        int sumaNumeros = 0;

        System.out.println("A continuación, te pedirá números y los sumará sucesivamente");
        for (int i = 0; i < numeros.length; i++) {
            numeros [i] = teclado.nextInt();
            sumaNumeros = numeros[i] + sumaNumeros;

        }
        System.out.println("El resultado de la suma es " + sumaNumeros);
    }
}
