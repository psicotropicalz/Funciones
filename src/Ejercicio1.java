/*
 * Diseña una función que solicite un número y muestre "ECO" las veces que se ha indicado
 * Ejemplo: El usuario indica el número 5 -> ECO se muestra 5 veces.
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuántas veces quieres que se muestre \"ECO\": ");
        int n = entrada.nextInt();
        entrada.close();
        repetirEco(n);
    }
    public static void repetirEco (int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". ECO");
        }
    }
}
