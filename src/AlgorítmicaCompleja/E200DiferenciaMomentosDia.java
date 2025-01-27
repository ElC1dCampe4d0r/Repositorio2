package AlgorítmicaCompleja;

public class E200DiferenciaMomentosDia {
    public static void main(String[] args) {

        int h1 = 22, m1 = 20; // Serían las 17:20.
        int h2 = 17, m2 = 30; // Serían las 16:00.

        int hora1 = h1 * 60 + m1;
        int hora2 = h2 * 60 + m2;
        int diferenciaMinutos = Math.abs((hora1 - hora2) % 60);
        int diferenciaHoras = (Math.abs(hora1 - hora2) - diferenciaMinutos) / 60;

        System.out.printf("La diferencia es de %02d:%02d.", diferenciaHoras, diferenciaMinutos);
    }
}
