package Basicos;

import java.util.Scanner;

public class Main_060_EsPrimo {
    public static boolean esPrimo(int numComprobarPrimo){
        if(numComprobarPrimo <= 1){
            return false;
        }
        for(int i = 2; i < numComprobarPrimo; i++){
            if(numComprobarPrimo % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        if(esPrimo(numero)){
            System.out.println(numero + " es un numero primo.");
        } else {
            System.out.println(numero + " no es un numero primo.");
        }
    }
}
