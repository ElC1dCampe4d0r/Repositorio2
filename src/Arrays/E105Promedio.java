package Arrays;

public class E105Promedio {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        double suma = 0;

        for (int numero : numeros) {
            suma = numero + suma;
        }

        double media = suma / numeros.length;
        System.out.println("El promedio es: " + media);
    }
}
