import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * Programa que, dado:
 * - La velocidad actual (km/h),
 * - La hora actual (HH:mm),
 * - Los kilómetros restantes al destino,
 * calcula:
 * - Cuánto tiempo falta para llegar.
 * - A qué hora se llegará.
 */

public class Ejercicio7Funciones {
    public static void main(String[] args) {
        calcularLlegada();
    }

    static double solicitarNumero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    static LocalTime solicitarLocalTime(String mensaje) {
        Scanner sc = new Scanner(System.in);
        LocalTime hora = null;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        while (hora == null) {
            System.out.print(mensaje + " (formato HH:mm): ");
            String entrada = sc.nextLine();
            try {
                hora = LocalTime.parse(entrada, formato);
            } catch (DateTimeParseException e) {
                System.out.println("Hora inválida. Por favor, ingresa el formato correcto (HH:mm).");
            }
        }
        return hora;
    }

    static void calcularLlegada() {
        double velocidad = solicitarNumero("Indica la velocidad actual (km/h): ");
        double km = solicitarNumero("Indica cuántos kilómetros faltan: ");
        LocalTime horaActual = solicitarLocalTime("Dime qué hora es");

        double tiempoHoras = Math.round((km / velocidad) * 100) / 100.0;

        // Convierte las horas en minutos para sumarlos a la hora actual
        int minutosTotales = (int) Math.round(tiempoHoras * 60);
        LocalTime horaLlegada = horaActual.plusMinutes(minutosTotales);

        System.out.println("\nTardarás en llegar: " + minutosTotales + " minutos.");
        System.out.println("Hora estimada de llegada: " + horaLlegada.format(DateTimeFormatter.ofPattern("HH:mm")));
    }
}