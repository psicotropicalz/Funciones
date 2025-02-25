import java.util.Scanner;

/**
 * Crea una calculadora de + - * / donde la función operación recibirá los números y la operación a realizar y muestre el resultado.
 * Crea otra función para el menú
 */

public class Ejercicio6Funciones {
    public static void main(String[] args) {
    menu();
    }

    static double solicitarNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        return entrada.nextDouble();
    }
    static double suma(double a, double b) {
        return a + b;
    }
    static double resta(double a, double b) {
        return a - b;
    }
    static double multiplicacion(double a, double b) {
        return a * b;
    }
    static double division(double a, double b) {
        return a / b;
    }

    static void menu (){
        Scanner entrada = new Scanner(System.in);
        String opcion = "";
        do {
            System.out.print("\n[1]-> Sumar 2 números \n[2]-> Restar 2 números\n[3]-> Multiplicar 2 números\n[4]-> Dividir 2 números\n[5]-> Salir\nElije qué operación quieres realizar: ");
            opcion = entrada.nextLine();
            switch (opcion) {
                case "1" -> System.out.println("\nEl resultado de la suma sería: " + suma(solicitarNumero(), solicitarNumero()));
                case "2" -> System.out.println("\nEl resultado de la resta sería: " + resta(solicitarNumero(), solicitarNumero()));
                case "3" -> System.out.println("\nEl resultado de la multipicación sería: " + multiplicacion(solicitarNumero(), solicitarNumero()));
                case "4" -> System.out.println("\nEl resultado de la división sería: " + division(solicitarNumero(), solicitarNumero()));
                case "5" -> System.out.println("Adiós! :)");
                default -> System.out.println("\nNo has seleccionado una opción válida");
            }
        } while (!opcion.equals("5"));
    }

}
