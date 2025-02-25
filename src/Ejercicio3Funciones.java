/*
 * Vamos a realizar una función que calcule y muestre el área y volumen de un cilíndro, según se especifique en el menú. 1 para el área y 2 para el volumen.
 * Los datos que son necesarios son el radio da la base y la altura.
 *
 * area = 2PI * radio * (altura + radio)
 *
 * volumen = PI * radio^2 * altura
 */

import java.util.Scanner;

public class Ejercicio3Funciones {
    public static void main(String[] args) {
        menu();
    }

    static double valorRadio(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Indica la altura del cilindro: ");
        return entrada.nextDouble();
    }
    static double valorAltura(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Indica el radio del cilindro: ");
        return entrada.nextDouble();
    }
    static double calcularArea(){
        double radio = valorRadio();
        double altura = valorAltura();
        double resultado = 2 * Math.PI * radio * (altura + radio);
        return Math.round(resultado * 100.0) / 100.0;
    }

    static double calcularVolumen(){
        double radio = valorRadio();
        double altura = valorAltura();
        double resultado = Math.PI * (radio * radio) * altura;
        return Math.round(resultado * 100.0) / 100.0;
    }

    static void menu (){
        Scanner entrada = new Scanner(System.in);
        String opcion = "";
        do {
            System.out.print("\n[1]-> Calcular el área \n[2]-> Calcular el volumen \n[3]-> Salir\nElije qué operación quieres realizar: ");
            opcion = entrada.nextLine();
            switch (opcion) {
                case "1" -> System.out.println("El área es: " + calcularArea());
                case "2" -> System.out.println("El volumen es: " + calcularVolumen());
                case "3" -> {
                    System.out.println("Adiós! :)");
                }
                default -> {
                    System.out.println("No has seleccionado una opción válida\n");
                }
            }
        } while (!opcion.equals("3"));
    }

}
