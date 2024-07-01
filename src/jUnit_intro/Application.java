package jUnit_intro;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
         * Actividad: Hola mundo
         * Crea un método en tu clase Main que imprima "Hola Mundo" en la consola.
         * 
         * Crea una clase test para testear este método.
         */

        // printGreeting();

        /*
         * Actividad: Imprimir nombre y edad
         * Crea un método en tu clase Main que reciba por parámetro el nombre y la edad,
         * y luego imprima el mensaje "Me llamo [nombre] y tengo [edad] años". No debes
         * hacer uso de la clase Scanner. En su lugar, simplemente crea el método
         * correspondiente y reemplaza [nombre] y [edad] con tus datos almacenados
         * previamente en una variable, para comparar con la salida del output.
         * 
         * Crea una clase para testear esta actividad.
         */
        // printNameAndAge("iker", 27);

        /*
         * Actividad: Imprimir nombre y edad 2.0
         * Dado lo aprendido en la actividad Nombre y Edad, procede a resolver la
         * siguiente actividad contemplando las siguientes mejoras:
         * 
         * Crea dos métodos para obtener el nombre y la edad, respectivamente. Ambos
         * métodos deben recibir por parámetro una variable de tipo "Scanner".
         * 
         * Crea una clase para testear esta actividad, incluyendo cada uno de los
         * métodos.
         */
        Scanner scanner = new Scanner(System.in);
        printName(scanner);
    }

    public static void printName(Scanner scanner) {
        System.out.println("My name is " + scanner.nextLine());
        scanner.close();
    }

    public static void printNameAndAge(String name, int age) {
        System.out.println("My name is " + name + " and I have " + age + " years.");
    }

    public static void printGreeting() {
        System.out.println("Hello world");
    }
}
