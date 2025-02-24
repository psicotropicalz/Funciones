import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        saludo();
        //Paso de parámetros -> se incluye un valor mediante una variable o el valor directamente y se le pasa a la función en el momento de la invocación
        otroSaludo("Daniel Cano");//usando directamente un valor
        String name= JOptionPane.showInputDialog("Nombre: ");
        otroSaludo(name); //usando la variable
        String edadString = JOptionPane.showInputDialog("Edad: ");
        byte edad = Byte.parseByte(edadString);
        //Ojo!! Los parámetros tienen que ir en el orden que indica la función
        saludoConEdad(name, edad);
        saludoCumpleanos(name, edad);
        String nombre2 = pedirNombre(); //el dato recibido debe ser guardado en una variable del mismo tipo o hacer algo con el valor
        otroSaludo(nombre2); //llama la función y le pasa el parámetro recibido por la función pedirNombre()

    }

    //Declaramos la función
    static void saludo() { //saludo() es el identificador o nombre de la función
        JOptionPane.showMessageDialog(null, "Hola Mundo");
    }

    //En esta función va a recibir un valor tipo String con el nombre
    static void otroSaludo(String name) {
        JOptionPane.showMessageDialog(null, "Hola, " +  name);
    }

    //En esta función se van a recibir dos parámetros, el nombre y la edad
    static void saludoConEdad (String name, byte edad) {
        JOptionPane.showMessageDialog(null, "Hola " + name + ". Tienes " + edad + " años.");
    }

    //Crea una función que incremente en uno la edad que ha insertado el usuario y dile que un su próximo cumpleaños tendrá esa edad
    static void saludoCumpleanos (String name, byte edad) {
        JOptionPane.showMessageDialog(null, "Hola " + name + ". Tienes " + edad + " años.\nEn tu próximo cumpleaños tendrás " + (edad+1) + " años." + " \nN = ");
    }

    //Esta función devuelve un valor de tipo String... return valor/Variable
    static String pedirNombre() {
        String nombre = JOptionPane.showInputDialog("Nombre: ");
        return nombre;
        //return "valorNombre valorApellido".
    }
}