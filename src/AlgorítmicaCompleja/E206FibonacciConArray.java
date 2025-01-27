package AlgorítmicaCompleja;

public class E206FibonacciConArray {
    public static void main(String[] args) {
        int[] sucesionFibonacci = new int[30];

        for (int i = 0; i < 30; i++) {
            if (i < 2) {
                sucesionFibonacci[i] = i;
            } else {
                sucesionFibonacci[i] = sucesionFibonacci[i - 1] + sucesionFibonacci[i - 2];
            }
            System.out.printf("%d ", sucesionFibonacci[i]);
        }
    }
}
