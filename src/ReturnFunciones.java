import java.util.Scanner;

/**
 * La cláusula return dentro de una función devuelve un valor que está declarado en el prototipo de la función
 *
 * Ej:
 * Esta función indica que la fución devuelve un valor tipo int
 * static int pedirEdad() {
 *     boolean correcto = false;
 *     int edad = 0;
 *     do{
 *         System.out.print("Indica la edad");
 *         edad = new Scanner.().nextInt();
 *         if (edad >= 0 && edad <= 120){
 *             correcto = true;
 *         }
 *     } while(!correcto);
 *     return edad;
 * }
 */

public class ReturnFunciones {
    public static void main(String[] args) {
        mostrarEdad(pedirEdad());
        mostrarNombre(pedirNombre());
    }

    static int pedirEdad() {
      boolean correcto = false;
      int edad = 0;
      do{
          System.out.print("Indica la edad: ");
          edad = new Scanner(System.in).nextInt();
          if (edad >= 0 && edad <= 120){
              correcto = true;
          } else {
              System.out.println("La edad no es correcta, debe tener un valor entre 0 y 120");
          }
      } while(!correcto);
      return edad; //enviamos la edad leída en un formato correcto.
  }

  //Muestre la edad
    static void mostrarEdad(int edad) {
        System.out.println("\nEdad: " + edad);
    }

    // Crear la función pedirNombre
    static String pedirNombre() {
        boolean correcto = false;
        String nombre = "";
        do {
            System.out.print("Indica un nombre: ");
            nombre = new Scanner(System.in).nextLine();
            if (!nombre.isEmpty()) {
                correcto = true;
            } else {
                System.out.print("Debes indicar un nombre.\n");
            }
        } while (!correcto);
        return nombre;
    }

    //Crear la función mostrar nombre
    static void mostrarNombre(String nombre) {
        System.out.println("\nNombre: " + nombre);
    }
}
