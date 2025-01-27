package AlgorítmicaCompleja;

public class E208FibonacciN {
    public static final int N = 4;
    public static final int HASTA = 30;

    public static void main(String[] args) {
        int[] sucesionFibonacci = new int[HASTA];
        int[] NnumerosAnterioresSucesionFibonacci = new int[N];

        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
                NnumerosAnterioresSucesionFibonacci[i] = 1;
            } else {
                NnumerosAnterioresSucesionFibonacci[i] = 0;
            }
        }

        for (int i = N + 1; i < HASTA; i++) {
            for (int j = 0; j < N; j++) {
                sucesionFibonacci[i] = NnumerosAnterioresSucesionFibonacci[j] + sucesionFibonacci[i];
            }
            System.out.printf("%d ", sucesionFibonacci[i]);
        }
    }
}
