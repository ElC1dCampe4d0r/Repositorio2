package Arrays;

import java.util.Scanner;

public class E106MayorYMenor {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Ingrese la cantidad de números a comparar");
        int[] numeros = new int[teclado.nextInt()];

        System.out.println("Ingrese los números a comparar");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
