package Arrays;

import java.util.Scanner;

public class E112ModuloDeVector {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese las dimensiones del espacio en el que vamos a trabajar:");
        double[] parametrosVector = new double[teclado.nextInt()];

        double sumaParametros = 0;

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < parametrosVector.length; i++) {
            parametrosVector[i] = teclado.nextInt();
            sumaParametros = Math.pow(parametrosVector[i], 2) + sumaParametros;
        }
        double modulo = Math.sqrt(sumaParametros);

        System.out.printf("El modulo de el vector definido es: %f", modulo);
    }
}
