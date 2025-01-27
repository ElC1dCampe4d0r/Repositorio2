package Basicos;

import java.util.Scanner;

public class Main_046_FigurasDeAsteriscos {
    public static void rectangulo(int x, int y) {
        if(x <= 0 || y <= 0){
            System.out.println("Las longitudes son positivas; ingrese un numero entero positivo.");
            return;
        }
        for (int i = 1; i <= y; i++) {
            if(i == 1 || i == y) {
                System.out.println("*  ".repeat(x));
            } else {
                String espacio = "   ";

                System.out.format("* %s *\n", espacio.repeat(x - 2));
            }
        }
    }

    public static void trianguloRectangulo(int x, int y) {
        if(x <= 0 || y <= 0){
            System.out.println("Las longitudes son positivas; ingrese un numero entero positivo.");
            return;
        }
        for (int i = 1; i <= y; i++) {
            if(i == 1) {
                System.out.println("*");
            } else if(i == y) {
                System.out.println("*  ".repeat(x));
            } else {
                String espacio = " ";

                System.out.format("*%s*\n", espacio.repeat(3 * (i-1) * ((x - 2) / (y - 2)) - 1));
            }
        }
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime que figura quieres formar de entre todas estas:Rectángulo, Triángulo rectángulo (solo para casos co la base base mayor que altura");
        String figura = teclado.nextLine().toUpperCase();

        if (figura.equals("RECTÁNGULO")) {
            System.out.print("Ingrese la base del rectágulo: ");
            int base = teclado.nextInt();

            System.out.print("Ingrese la altura del rectángulo: ");
            int altura = teclado.nextInt();

            rectangulo(base, altura);
        } else if (figura.equals("TRIÁNGULO RECTÁNGULO")) {
            System.out.print("Ingrese la base del triángulo: ");
            int longitud = teclado.nextInt();

            System.out.print("Ingrese la altura del triángulo: ");
            int altura = teclado.nextInt();

            trianguloRectangulo(longitud, altura);
        }
    }
}
