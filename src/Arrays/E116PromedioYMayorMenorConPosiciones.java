package Arrays;
import java.util.Scanner;

public class E116PromedioYMayorMenorConPosiciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad;

        // Pedir cantidad válida
        do {
            System.out.print("Por favor, introduzca la cantidad de números deseada: ");
            cantidad = scanner.nextInt();
            if (cantidad < 2) {
                System.out.println("La cantidad debe ser al menos 2. Inténtelo de nuevo.");
            }
        } while (cantidad < 2);

        int[] numeros = new int[cantidad];

        // Recoger números y almacenarlos en el array
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduzca el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Calcular el promedio
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        double promedio = (double) suma / cantidad;
        System.out.printf("El promedio es %.1f\n", promedio);

        // Encontrar el mayor y el menor valor junto a sus posiciones
        int mayor = numeros[0], menor = numeros[0];
        int posMayor = 0, posMenor = 0;

        for (int i = 1; i < cantidad; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }
        // Mostrar el mayor y el menor con posiciones en base a 1
        System.out.println("El mayor era " + mayor + " (posición " + (posMayor + 1) + ") y el menor era " + menor + " (posición " + (posMenor + 1) + ").");
    }
}
