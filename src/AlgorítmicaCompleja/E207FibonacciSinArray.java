package AlgorítmicaCompleja;

public class E207FibonacciSinArray {
    public static void main(String[] args) {
        int numeroFibonacci = 0;
        int numeroFibonacciAnterior = 1;
        int numeroFibonacciAnterior2 = 0;

        for (int i = 0; i < 30; i++) {
            if (i < 2) {
                numeroFibonacci = i;
            } else {
                numeroFibonacci = numeroFibonacciAnterior + numeroFibonacciAnterior2;
                numeroFibonacciAnterior2 = numeroFibonacciAnterior;
                numeroFibonacciAnterior = numeroFibonacci;
            }
            System.out.println(numeroFibonacci);
        }
    }
}
