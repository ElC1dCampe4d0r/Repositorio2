package tresEnRaya;

import java.util.Scanner;

public class E230TresEnRaya {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char[][] matriz = new char[3][3];
        boolean seguir;
        int fila = 0;
        int columna = 0;
        boolean casillaRellena = false;

        System.out.println("Vamos a jugar al 3 en raya. Se pedirán las posiciones e la casilla donde quieres introducir tu marca (empiez el jugador 1). Para introducir la posición, primero pon la fila y luego la columna");

        do {
            seguir = true;

            do {
                System.out.println("Jugador 1, seleccione la casilla donde va a poner su marca (O)");
                fila = teclado.nextInt() - 1;
                columna = teclado.nextInt() - 1;

                if (fila < 0 || columna < 0 || fila > 2 || columna > 2) {
                    System.out.println("Esa casilla está fuera de rango");
                    casillaRellena = true;
                } else if (matriz[fila][columna] != 0) {
                    System.out.println("Esa casilla está rellena");
                    casillaRellena = true;
                } else if (matriz[fila][columna] == 0){
                    casillaRellena = false;
                }
            } while (casillaRellena == true);

            matriz[fila][columna] = 'O';
            pintarMatriz(matriz);
            if (hayGanador(matriz, 'O')) {
                System.out.println("Ha ganado el jugador 1");
                break;
            }
            if (juegoTerminado(matriz)) {
                System.out.println("Habeis quedado en empate");
                break;
            }

            do {
                System.out.println("Jugador 2, seleccione la casilla donde va a poner su marca (X)");
                fila = teclado.nextInt() - 1;
                columna = teclado.nextInt() - 1;

                if (fila < 0 || columna < 0 || fila > 2 || columna > 2) {
                    System.out.println("Esa casilla está fuera de rango");
                    casillaRellena = true;
                } else if (matriz[fila][columna] != 0) {
                    System.out.println("Esa casilla está rellena");
                    casillaRellena = true;
                } else if (matriz[fila][columna] == 0){
                    casillaRellena = false;
                }
            } while (casillaRellena == true);

            matriz[fila][columna] = 'X';
            pintarMatriz(matriz);
            if (hayGanador(matriz, 'X')) {
                System.out.println("Ha ganado el jugador 2");
                break;
            }
            if (juegoTerminado(matriz)) {
                System.out.println("Habeis quedado en empate");

                break;
            }

        } while (seguir == true);
    }
    
    public static void pintarMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean hayGanador (char[][] matriz, char simbolo) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == simbolo && matriz[i][1] == simbolo && matriz[i][2] == simbolo) {
                return true;
            } else if (matriz[0][i] == simbolo && matriz[1][i] == simbolo && matriz[2][i] == simbolo) {
                return true;
            }
        }
        if (matriz[0][0] == simbolo && matriz[1][1] == simbolo && matriz[2][2] == simbolo) {
            return true;
        }
        if (matriz[0][2] == simbolo && matriz[1][1] == simbolo && matriz[2][0] == simbolo) {
            return true;
        }
        return false;
    }

    public static boolean juegoTerminado (char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }


}
