package Arrays;

public class E120AprobadoYCalificacionMediaPonderada {
    public static void main(String[] args) {
        boolean aprobado = true;
        double mediaPonderada = 0;

        double[] calificaciones = {5.7, 9.5, 3.9, 7.0, 7.75};
        double[] ponderaciones = {0.15, 0.20, 0.25, 0.30, 0.10};

        for (int i = 0; i < calificaciones.length; i++) {
            mediaPonderada = calificaciones[i] * ponderaciones[i] + mediaPonderada;
        }

        for (double calificacion : calificaciones) {
            if (calificacion < 4 || mediaPonderada < 5) {
                aprobado = false;
                break;
            }
        }

        String aprobadoSuspendido = aprobado ? "aprobado" : "suspendido";
        System.out.printf("El alumno ha %s la asignatura con una calificación de %.2f", aprobadoSuspendido, mediaPonderada);
    }
}
