package Arrays;

public class E108CompararDosArrays {
    public static void main(String[] args) {
        String menorMayorIgual = "";

        int[] numeros1 = {17, 23, 5, 21, 45};
        int[] numeros2 = {19, 23, 1, 865};

        int cantidadMayorValoresNumeros = Math.max(numeros1.length, numeros2.length);
        int cantidadMenorValoresNumeros = Math.min(numeros1.length, numeros2.length);

        double[] longitudes1 = {11.36, 0.0, 1.184, -3.98, 1495739.2};
        double[] longitudes2 = {11.36, 0.1, 66.459, -23.45, 14951.1, 56.87};

        int cantidadMayorValoresLongitudes = Math.max(longitudes1.length, longitudes2.length);
        int cantidadMenorValoresLongitudes = Math.min(longitudes1.length, longitudes2.length);

        boolean[] indicadores1 = {false, false, false, false, true};
        boolean[] indicadores2 = {false, true, true, false, false, false};

        int cantidadMayorValoresIndicadores = Math.max(indicadores1.length, indicadores2.length);
        int cantidadMenorValoresIndicadores = Math.min(indicadores1.length, indicadores2.length);

        for (int i = 0; i < cantidadMayorValoresNumeros; i++) {
            if (i < cantidadMenorValoresNumeros) {
               menorMayorIgual = numeros1[i] < numeros2[i] ? "menor" :
                        numeros1[i] > numeros2[i] ? "mayor" : "igual";

                System.out.printf("El número %d es %s que %d%n", numeros1[i], menorMayorIgual, numeros2[i]);
            }
            if (numeros1.length > cantidadMenorValoresNumeros && i >= cantidadMenorValoresNumeros) {
                System.out.println("Solo hay un valor, y es " + numeros1[i]);
            } else if (numeros2.length > cantidadMenorValoresNumeros && i >= cantidadMenorValoresNumeros) {
                System.out.println("Solo hay un valor, y es " + numeros2[i]);
            }
        }
        for (int i = 0; i < cantidadMayorValoresLongitudes; i++) {
            if (i < cantidadMenorValoresLongitudes) {
                menorMayorIgual= longitudes1[i] < longitudes2[i] ? "menor" :
                        longitudes1[i] > longitudes2[i] ? "mayor" : "igual";

                System.out.printf("El número %f es %s que %f%n", longitudes1[i], menorMayorIgual, longitudes2[i]);
            }
            if (longitudes1.length > cantidadMenorValoresLongitudes && i >= cantidadMenorValoresLongitudes) {
                System.out.println("Solo hay un valor, y es " + longitudes1[i]);
            } else if (longitudes2.length > cantidadMenorValoresLongitudes && i >= cantidadMenorValoresLongitudes){
                System.out.println("Solo hay un valor, y es " + longitudes2[i]);
            }
        }
        for (int i = 0; i < cantidadMayorValoresIndicadores; i++) {
            if (i < cantidadMenorValoresIndicadores) {
                menorMayorIgual = indicadores1[i] == indicadores2[i] ? "igual" : "diferente";

                System.out.printf("El par %d de arrays es %s%n", i, menorMayorIgual);
            }
            if (indicadores1.length > cantidadMenorValoresIndicadores && i >= cantidadMenorValoresIndicadores) {
                System.out.println("Solo hay un valor, y es " + indicadores1[i]);
            } else if (indicadores2.length > cantidadMenorValoresIndicadores && i >= cantidadMenorValoresIndicadores) {
                System.out.println("Solo hay un valor, y es " + indicadores2[i]);
            }
        }
    }
}