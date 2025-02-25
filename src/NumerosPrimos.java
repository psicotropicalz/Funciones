import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.print("\nDime un número, te diré todos los números primos que hay hasta ese número: ");
        int nUsuario = new Scanner(System.in).nextInt();
        for (int i = 2; i <= nUsuario; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;  // 1 y los números menores que 1 no son primos
        for (int i = 2; i <= Math.sqrt(n); i++) {  // Verifica los divisores hasta sqrt(n)
            if (n % i == 0) return false;
        }
        return true;
    }

}
