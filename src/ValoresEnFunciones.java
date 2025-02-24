import java.util.Scanner;

public class ValoresEnFunciones {
    public static void main(String[] args) {
        //Solicita un número y verifica que multiplicandole 10, cual de los dos valores es mayor
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int numero = entrada.nextInt();
        entrada.close();
        int numero2 = numero * 10;
        int numeroMayor = mostrarMayor(numero, numero2);
        System.out.println("Lógicamente el numero mayor es: " + numeroMayor);
        numero = crearRandom();
        numero2 = crearRandom();
        System.out.println("El mayor de dos número aleatorios (número 1 -> " + numero + " y numero 2-> " + numero2 + ") es: " + mostrarMayor(numero, numero2));
        mostrarTexto("Cualquier texto.");

    }


    /**
     * Función que devuelve el mayor de los números
     * @param a;
     * @param b;
     * @return int
     */
    static int mostrarMayor(int a, int b) {
        return Math.max(a, b); //Devuelve el valor del mayor número
    }

    static int crearRandom() {
        return (int) (Math.random()*101);
    }

    //función para mostrar en pantalla cualquier texto con salto de línea
    static void mostrarTexto(String texto) {
        System.out.println(texto);
    }
}
