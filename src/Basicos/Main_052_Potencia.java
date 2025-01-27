package Basicos;

import java.util.Scanner;

public class Main_052_Potencia {
    public static double potencia (double base, int exponente){

        double memoriaPotencia = 1;

        if(exponente < 0){
            exponente = -exponente;
            base = 1/base;
        } for (int i = 1; i <= exponente; i++) {
            memoriaPotencia = base * memoriaPotencia;
        }

        return memoriaPotencia;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la base: ");
        double base = teclado.nextDouble();

        System.out.println("Ingrese el exponente: ");
        int exponente = teclado.nextInt();

        double resultado = potencia(base, exponente);

        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
    }
}
