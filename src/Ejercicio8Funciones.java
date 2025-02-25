import java.util.Scanner;

/**
 * 1. Implementa una función convertirMoneda(), que reciba una cantidad de dólares Canadienses o Americanos y la convierta en euros
 * 2. Implementa una función convertirGradosCelsius() que reciba en ºF y los convierta en ºC
 * 3. Implementa una función convertirMilimetros() donde recibas un dato en metros, y los milímetros
 * 4. Implementa una función convertirLibras() que reciba un peso en libras y lo convierta en kg
 * 5. Implementa una función convertirMillas() que reciba una distancia en millas y te la convierta en km
 * 6. Indica cuánto falta para llegar a tu destino, teniendo en cuenta el tipo de vía en que transita (autovía o carretera nacional) y los km que faltan.
 * 7. Indica los segundos y conviértelos en días, horas minutos y segundos.
 */

public class Ejercicio8Funciones {
    public static void main(String[] args) {

    }
    static double solicitarNumero(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        return entrada.nextDouble();
    }
    static double convertirDolaresA () {
        double dolares = solicitarNumero("Dime cuántos dólares quieres convertir");
        return (dolares * 1.05);
    }
    static double convertirDolaresC () {
        double dolares = solicitarNumero("Dime cuántos dólares quieres convertir");
        return (dolares * 1.5);
    }
    static double convertirAGradosCelsius (){
        double fahrenheit = solicitarNumero("Cuántos grados Fahrenheit hay");
        return (fahrenheit - 32) * (5 / 9);
    }
    static double convertirAGradosFahrenheit (){
        double celsius = solicitarNumero("Cuántos grados Celsius hay");
        return celsius * 1.8 + 32;
    }
    static double convertirMilimetros (){
        double metros = solicitarNumero("Cuántos metros quieres convertir a milímetros");
        return (metros * 1000);
    }
    static double convertirALibras () {
        double kg = solicitarNumero("Cuántos kg quieres convertir");
        return (kg / 2.205);
    }
    static double convertirAKilos () {
        double libras = solicitarNumero("Cuántas libras quieres convertir");
        return (libras * 2.205);
    }
    static void menu (){
        Scanner entrada = new Scanner(System.in);
        String opcion = "";
        do {
            System.out.print("\n[1]-> Convertir monedas \n[2]-> Convertir temperatura\n[3]-> Multiplicar 2 números\n[4]-> Dividir 2 números\n[5]-> Salir\nElije qué operación quieres realizar: ");
            opcion = entrada.nextLine();
            switch (opcion) {
                case "1" -> {
                    do {
                        System.out.println("\n[1]-> Dólares Estadounidenses\n[2]-> Dólares Canadienses\n[3]-> Salir \nIndica qué tipo de moneda quieres convertir: ");
                        String moneda = entrada.nextLine();
                        switch (moneda) {
                            case "1" -> System.out.println("\nEso serían " + convertirDolaresA() + " dólares Estadounidenses.");
                            case "2" -> System.out.println("\nEso serían " + convertirDolaresC() + " dólares Canadienses.");
                            case "3" -> System.out.println("Adiós! :)");
                            default -> System.out.println("\nNo has seleccionado una opción válida");
                        }
                    } while (!opcion.equals("3"));
                }
                case "2" -> {
                    do {
                        System.out.println("\n[1]-> Convertir grados Fahrenheit a Celsius\n[2]-> Convertir grados Celsius a Fahrenheit\n[3]-> Salir \nIndica qué temperatura quieres convertir: ");
                        String moneda = entrada.nextLine();
                        switch (moneda) {
                            case "1" -> System.out.println("\nEso serían " + convertirAGradosCelsius() + " º Celsius.");
                            case "2" -> System.out.println("\nEso serían " + convertirAGradosFahrenheit() + " º Fahrenheit.");
                            case "3" -> System.out.println("Adiós! :)");
                            default -> System.out.println("\nNo has seleccionado una opción válida");
                        }
                    } while (!opcion.equals("3"));
                }
                case "3" -> System.out.println("\nEso serían " + convertirMilimetros() + " milímetros.");
                //case "4" -> System.out.println("\nEl resultado de la división sería: " + division(solicitarNumero(), solicitarNumero()));
                case "5" -> System.out.println("Adiós! :)");
                default -> System.out.println("\nNo has seleccionado una opción válida");
            }
        } while (!opcion.equals("5"));
    }
}
