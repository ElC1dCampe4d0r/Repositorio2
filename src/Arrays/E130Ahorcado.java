package Arrays;

import java.util.Scanner;

public class E130Ahorcado {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Jugador 1, indique la palabra secreta: ");
        String palabraSecreta = teclado.nextLine().toLowerCase();
        System.out.println("\n".repeat(50));

        int longitudPalabraSecreta = palabraSecreta.length();
        char[] letrasPalabraSecreta = new char[longitudPalabraSecreta];

        for (int i = 0; i < longitudPalabraSecreta; i++) {
            letrasPalabraSecreta[i] = palabraSecreta.charAt(i);
        }
        System.out.println("Jugador 2, empiece a introducir letras para adivinar la palabra");

        boolean[] letrasAcertadas = new boolean[longitudPalabraSecreta];
        char letraJugador2;
        int contadorAciertos = 0;
        int cantidadAciertosRondaAnterior = 0;
        int vidas = 6;
        String visorPalabra = "_".repeat(longitudPalabraSecreta);

        do {
            System.out.print("Ingrese una letra: ");
            letraJugador2 = teclado.nextLine().toLowerCase().charAt(0);

            for (int i = 0; i < longitudPalabraSecreta; i++) {
                if (letraJugador2 == letrasPalabraSecreta[i]) {
                    letrasAcertadas[i] = true;
                    contadorAciertos++;

                    StringBuilder sb = new StringBuilder(visorPalabra);
                    sb.setCharAt(i, letraJugador2);
                    visorPalabra = sb.toString();
                    System.out.println(visorPalabra);
                }
            }
            if (contadorAciertos == cantidadAciertosRondaAnterior) {
                vidas--;
                dibujarAhorcado(vidas);
            }
            cantidadAciertosRondaAnterior = contadorAciertos;

            System.out.printf("Has acertado %d letras; te quedan %d letras por adivinar y %d vidas %n", contadorAciertos, longitudPalabraSecreta - contadorAciertos, vidas);
        } while(!todosTrue(letrasAcertadas) && vidas != 0);

        if (todosTrue(letrasAcertadas)) {
            System.out.println("¡Has ganado!");
        } else if (vidas == 0) {
            System.out.println("Has perdido :(");
        }
    }
    public static boolean todosTrue (boolean[] array) {
        for (boolean valor : array) {
            if (!valor) {
                return false;
            }
        }
        return true;
    }
    public static void dibujarAhorcado (int numVidas){
        System.out.println(" ____");

        switch (numVidas) {
            case 5 -> {
                System.out.println(" |  0");
                System.out.println(" |");
                System.out.println(" |");
            }
            case 4 -> {
                System.out.println(" |  0");
                System.out.println(" |  |");
                System.out.println(" |");
            }
            case 3 -> {
                System.out.println(" |  0");
                System.out.println(" | -|");
                System.out.println(" |");
            }
            case 2 -> {
                System.out.println(" |  0");
                System.out.println(" | -|-");
                System.out.println(" |");
            }
            case 1 -> {
                System.out.println(" |  0");
                System.out.println(" | -|-");
                System.out.println(" | /");
            }
            case 0 -> {
                System.out.println(" |  0");
                System.out.println(" | -|-");
                System.out.println(" | / \\ ");
            }
        }
        System.out.println("_|_");
        System.out.println();
    }
}
