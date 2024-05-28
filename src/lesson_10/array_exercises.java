package lesson_10;
import java.util.Scanner;

public class array_exercises {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exercise_one();
        exercise_two();
    }

    private static void exercise_two() {
        /*
         * Promediando elementos
        Escribe un programa en el cual se cree una variable de tipo array que contenga cuatro elementos de tipo entero.
         Estos elementos deben ser ingresados por el usuario. El programa debe sumar y promediar los cuatro elementos de
        forma manual e imprimir por consola el resultado, utilizando solamente las herramientas adquiridas hasta el momento.
         */
        int[] elements = new int[4];
        
    }

    private static void exercise_one() {
        /*
         * Sumando elementos
        Escribe un programa en el cual se cree una variable de tipo array que contenga tres elementos de tipo entero.
         El programa debe sumar los tres elementos de forma manual e imprimir por consola el resultado utilizando solamente 
        las herramientas adquiridas hasta el momento.
         */

        int[] elements = {1,2,3};

        try {
            int sum = elements[0] + elements[1] + elements[2];

            System.out.println("La suma total es: " + sum);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error al referenciar el indice en el array");
        }

       
    }
}
