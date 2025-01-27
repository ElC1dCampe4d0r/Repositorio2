package Arrays;

import java.util.Scanner;

public class E140ContarCasosDeUnaLista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] buscados = {17, 23, 3};
        int[] lista = {8, 23, 3, 47, 17, 5, 17, 21, 2};
        int contador = 0;

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < buscados.length; j++) {
                if (buscados[j] == lista[i]) {
                    contador++;
                }
            }
        }
        System.out.printf("Los numero buscados aparecen %d veces", contador);
    }
}
