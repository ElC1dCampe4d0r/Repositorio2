package Arrays;

public class E102ArrayLiteral {
    public static void main(String[] args) {
        int[] numeros = {17, 23, 5, 21};
        double[] longitudes = {11.36, 0.0, 1.184, -3.98, 1495739.2};
        boolean[] indicadores = {false, false, true, false, true};

        for (int num : numeros) {
            System.out.println(num);
        }
        for (double longitud : longitudes) {
            System.out.println(longitud);
        }
        for (boolean indicador : indicadores) {
            System.out.println(indicador);
        }
    }
}
