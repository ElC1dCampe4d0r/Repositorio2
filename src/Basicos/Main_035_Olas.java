import java.util.Scanner;

public class Main_035_Olas {
    public static void ola(int x) {
        for(int i = 1; i <= (x + (x - 1)); i++) {
            if(i <= x){
                System.out.println("* ".repeat(i));
            } else {
                System.out.println("* ".repeat((2*x-i)));
            }
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Indique número de olas: ");
        int numeroOlas = teclado.nextInt();

        System.out.print("Indique la amplitud de las olas: ");
        int amplitudOlas = teclado.nextInt();

        for (int i = 1; i <= numeroOlas; i++) {
            ola(amplitudOlas);
        }
    }
}