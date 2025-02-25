/*
 * Solicita al usuario una letra, e indica si es vocal o no mediante un booleano.
 *
 */

import java.util.Scanner;

public class Ejercicio4Funciones {
    public static void main(String[] args) {
        mostrarResultado();
//        /**
//         * Otro ejemplo de cómo llamar y recibir parámetros
//         */
//        char miLetra = solicitarLetra();
//        boolean resultado = comprobarVocal(miLetra);
//        if (resultado) {
//            System.out.println("Letra es una vocal");
//        } else {
//            System.out.println("Letra no es una vocal");
//        }

    }

    //creamos una función de solicitar la letra
    static char solicitarLetra() {
        char letra;
        System.out.print("Dime una letra: ");
        letra = new Scanner(System.in).next().charAt(0); //lo que hace es cortar un String a la primera letra ingresada. Ejemplo: Maestra = M
        return letra;
    }

    static boolean comprobarVocal(char letra) {
        if (letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U' && letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
            return false;
        } else {
            return true;
        }
    }

    static void mostrarResultado() {
        if (comprobarVocal(solicitarLetra())) {
            System.out.println("Letra es una vocal");
        } else {
            System.out.println("Letra no es una vocal");
        }
    }
}
