import java.util.Scanner;

/**
 * Solicitar los siguientes datos al usuario, al final mostrarlos de forma organizada en pantalla.
 * Nombre:
 * Apellidos:
 * Teléfono:
 * Dirección:
 * Email:
 * Luego lo vamos a mostrar en pantalla en una línea, concatenando los datos
 */

public class Ejercicio5Funciones {
    public static void main(String[] args) {
        mostrarDatos();
    }

    static String solicitarDato (String dato) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu " + dato + ": ");
        return sc.nextLine();
    }

    static byte solicitarNumero(String dato){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu " + dato + ": ");
        return sc.nextByte();
    }

    /**
     * Sobrecarga de funciones:
     * Se puede dar el caso de llamar igual a una función pero según el paso de parámetros, irá al que corresponda.
     */

    static int solicitarNumero(String dato, String nombre) {
        Scanner sc = new Scanner(System.in);
        System.out.print(nombre + " indica el número del " + dato + ": ");
        return sc.nextInt();
    }

    //Pensar otro ejemplo de sobrecarga de funciones, ejemplo de la función solicitarNumero

    static char solicitarDato() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la letra de tu DNI: ");
        return sc.next().charAt(0);
    }


    static void mostrarDatos () {
        String nombre = solicitarDato("nombre");
        String apellido = solicitarDato("apellido");
        String telefono = solicitarDato("telefono");
        String direccion = solicitarDato("direccion");
        String email = solicitarDato("email");
        byte edad = solicitarNumero("Edad");
        int dni = solicitarNumero("DNI", nombre);
        char letra = solicitarDato();
        System.out.println("\nNombre: " + nombre + " " + apellido + "\nEdad: " + edad + "\nTeléfono: " + telefono + "\nDirección: " + direccion + "\nEmail: " + email + "\nDNI: " + dni + " - " + letra);
    }
}
