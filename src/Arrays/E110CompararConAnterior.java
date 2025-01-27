package Arrays;

public class E110CompararConAnterior {
    public static void main(String[] args) {
        String menorMayorIgual = "";

        double arrayDoubles[] = {1.2, 3.4, 5.6, 7.8, 9.0};

        for (int i = 1; i < arrayDoubles.length; i++) {
            menorMayorIgual= arrayDoubles[i - 1] < arrayDoubles[i] ? "menor" :
            arrayDoubles[i - 1] > arrayDoubles[i] ? "mayor" : "igual";

            System.out.printf("El número %d es %s que el numero %d%n", i, menorMayorIgual, (i + 1));
        }
    }
}
