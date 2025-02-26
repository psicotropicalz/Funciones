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
    static String mensajeEuros = "Dime cuántos euros quieres convertir";
    public static void main(String[] args) {
        menu();
    }
    static double solicitarNumero(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        return entrada.nextDouble();
    }
    static double convertirDolaresA () {
        double euros = solicitarNumero(mensajeEuros);
        return (euros * 1.05);
    }
    static double convertirDolaresC () {
        double euros = solicitarNumero(mensajeEuros);
        return (euros * 1.5);
    }
    static double convertirAGradosCelsius (){
        double fahrenheit = solicitarNumero("Cuántos grados Fahrenheit hay");
        return (fahrenheit - 32) * ((double) 5 / 9);
    }
    static double convertirAGradosFahrenheit (){
        double celsius = solicitarNumero("Cuántos grados Celsius hay");
        return celsius * 1.8 + 32;
    }
    static double convertirMilimetros (){
        double metros = solicitarNumero("Cuántos metros quieres convertir a milímetros");
        return (metros * 1000);
    }
    static double convertirMasa (int numero) {
        double resultado = 0;
        if (numero == 1) {
            double kg = solicitarNumero("Cuántos kg quieres convertir");
            resultado = (kg / 2.205);
        } else if (numero == 2) {
            double libras = solicitarNumero("Cuántas libras quieres convertir");
            resultado = (libras * 2.205);
        }
        return resultado;
    }
    static double convertirDistancia (int numero) {
        double resultado = 0;
        if (numero == 1) {
            double millas = solicitarNumero("Cuántas millas quieres convertir");
            resultado = (millas * 1.609);
        } else if (numero == 2) {
            double km = solicitarNumero("Cuántos kilómetros quieres convertir");
            resultado = (km / 1.609);
        }
        return resultado;
    }
    static String convertirSegundos () {
        double segundos = (int)solicitarNumero("Cuántos segundos quieres convertir");
        int minutos = 0, horas = 0, dias = 0, semanas = 0;
        String mensaje;
        if (segundos >= 60) {
            minutos = (int) segundos / 60;
            segundos = segundos % 60;
        }
        if (minutos >= 60) {
            horas = minutos / 60;
            minutos = minutos % 60;
        }
        if (horas >= 24) {
            dias = horas / 24;
            horas = horas % 24;
        }
        if (dias >= 7) {
            semanas = dias / 7;
            dias = dias % 7;
        }
        return "\nLa cantidad de segundos que has introducido son: " + semanas + " semanas - " + dias + " dias - " + horas + " horas - " + minutos + " minutos - " + (int)segundos + " segundos";
    }

    static void menu (){
        Scanner entrada = new Scanner(System.in);
        String opcion, subOpcion;
        do {
            System.out.print("\n[1]-> Convertir monedas \n[2]-> Convertir temperatura\n[3]-> Convertir a milímetros\n[4]-> Convertir masa\n[5]-> Convertir distancias\n[6]-> Convertir cantidad de segundos\n[7]-> Calcular la hora de llegada\n[8]-> Salir\nElije qué operación quieres realizar: ");
            opcion = entrada.nextLine();
            switch (opcion) {
                case "1" -> {
                    do {
                        System.out.print("\n[1]-> Dólares Estadounidenses\n[2]-> Dólares Canadienses\n[3]-> Salir \nIndica qué tipo de moneda quieres convertir: ");
                        subOpcion = entrada.nextLine();
                        switch (subOpcion) {
                            case "1" -> System.out.println("\nEso serían " + convertirDolaresA() + " dólares Estadounidenses.");
                            case "2" -> System.out.println("\nEso serían " + convertirDolaresC() + " dólares Canadienses.");
                            case "3" -> System.out.println("\nVolviendo al menú principal...");
                            default -> System.out.println("\nNo has seleccionado una opción válida");
                        }
                    } while (!subOpcion.equals("3"));
                }
                case "2" -> {
                    do {
                        System.out.print("\n[1]-> Convertir grados Fahrenheit a Celsius\n[2]-> Convertir grados Celsius a Fahrenheit\n[3]-> Salir \nIndica qué temperatura quieres convertir: ");
                        subOpcion = entrada.nextLine();
                        switch (subOpcion) {
                            case "1" -> System.out.println("\nEso serían " + convertirAGradosCelsius() + " º Celsius.");
                            case "2" -> System.out.println("\nEso serían " + convertirAGradosFahrenheit() + " º Fahrenheit.");
                            case "3" -> System.out.println("\nVolviendo al menú principal...");
                            default -> System.out.println("\nNo has seleccionado una opción válida");
                        }
                    } while (!subOpcion.equals("3"));
                }
                case "3" -> System.out.println("\nEso serían " + convertirMilimetros() + " milímetros.");
                case "4" -> {
                    do {
                        System.out.print("\n[1]-> Convertir Kilogramos a Libras\n[2]-> Convertir Libras a Kilogramos\n[3]-> Salir \nIndica qué masa quieres convertir: ");
                        subOpcion = entrada.nextLine();
                        switch (subOpcion) {
                            case "1" -> System.out.println("\nEso serían " + convertirMasa(2) + " Kg.");
                            case "2" -> System.out.println("\nEso serían " + convertirMasa(1) + " Libras.");
                            case "3" -> System.out.println("\nVolviendo al menú principal...");
                            default -> System.out.println("\nNo has seleccionado una opción válida");
                        }
                    } while (!subOpcion.equals("3"));
                }
                case "5" -> {
                    do {
                        System.out.print("\n[1]-> Convertir Millas a Kilómetros\n[2]-> Convertir Kilómetros a Millas\n[3]-> Salir \nIndica qué distancia quieres convertir: ");
                        subOpcion = entrada.nextLine();
                        switch (subOpcion) {
                            case "1" -> System.out.println("\nEso serían " + convertirDistancia(1) + " kilómetros.");
                            case "2" -> System.out.println("\nEso serían " + convertirDistancia(2) + " millas.");
                            case "3" -> System.out.println("\nVolviendo al menú principal...");
                            default -> System.out.println("\nNo has seleccionado una opción válida");
                        }
                    } while (!subOpcion.equals("3"));
                }
                case "6" -> System.out.println(convertirSegundos());
                case "7" -> Ejercicio7Funciones.calcularLlegada();
                case "8" -> System.out.println("\n\nAdiós! :)");
                default -> System.out.println("\nNo has seleccionado una opción válida");
            }
        } while (!opcion.equals("8"));
        System.out.println("\nPrograma desarrollado por Daniel Cano");
    }
}
