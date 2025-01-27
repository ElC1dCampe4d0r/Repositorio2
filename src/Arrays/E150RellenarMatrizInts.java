package  Arrays;

import java.util.Scanner;
import java.util.Random;

public class E150RellenarMatrizInts {
    public static int[][] marcarPosicion(int[][] matriz, int fil, int col) {
        Random r = new Random();
        matriz[fil][col] = r.nextInt(10);
        return matriz;
    }

    public static void pintarMatriz(int[][] matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[4][6];

        System.out.println("Seleccione la posición de la matriz (primero fila y luego columna): ");
        int fila = teclado.nextInt();
        int columna = teclado.nextInt();
    }
}
