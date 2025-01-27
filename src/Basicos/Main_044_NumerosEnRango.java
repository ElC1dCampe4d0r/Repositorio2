package Basicos;

import java.util.Scanner;

public class Main_044_NumerosEnRango {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese 2 números enteros para decir los números que están entre ellos y a la vez son múltiplos de 3:");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();

        if (numero1 > numero2){
            int aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        for (int i = numero1; i <= numero2; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}