import java.util.Scanner;

/**
 * Solicita 2 números y mediante función determina cuál es menor y cuál es mayor.
 * Luego muestra todos los números de forma decreciente que existen entre ellos.
 * Ejemplo:
 * numero1: 18
 * numero2: 9
 *
 * función calculaMayorMenor (int num1,int num2) {
 *     int mayor = Math.max(num1,num2);
 *     int menor = Math.min(num1,num2);
 *     //como llamo la función?
 * }
 *
 * función mostrarNumeros(int mayor,int menor){
 *     for (i=menor; i<=mayor; i++) {
 *         sout (i);
 *     }
 * }
 */

public class Ejercicio2Funciones {
    public static void main(String[] args) {
        int numero1 = pedirNumeros();
        int numero2 = pedirNumeros();
        calculaMayorMenor(numero1, numero2);
        mostrarNumeros(numero1, numero2);

    }

    static void calculaMayorMenor(int a, int b) {
        int mayor = Math.max(a, b);
        int menor = Math.min(a, b);
        System.out.println("El mayor es: " + mayor + "\nEl menor es: " + menor);
    }

    static void mostrarNumeros(int mayor, int menor) {
        System.out.println("Los números comprendidos en orden descendente entre ambos números son: ");
        for (int i = menor; i <= mayor; i++) {
            System.out.print(i + " - ");
        }
    }

    static int pedirNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número: ");
        return sc.nextInt();
    }
}
