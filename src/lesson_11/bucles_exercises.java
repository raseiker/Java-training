package lesson_11;
import java.util.Scanner;

public class bucles_exercises {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //exercise_one();
        //exercise_two();
        //exercise_three();
        //exercise_fourth();
        //exercise_fifth();
        //exercise_sixth();
        exercise_seventh();
    }

    private static void exercise_seventh() {
        /*
         * Calculando el promedio 
        Genera un array de 20 elementos de tipo float, inicializándolo con los números de tu 
        elección. Luego, suma todos los elementos del array y calcula su promedio. Finalmente,
         muestra por consola tanto el resultado de la suma como el promedio de los elementos.
         Te sugerimos implementar el uso de la sintaxis de for-each.
         */
        float[] numbers = new float[20];
        float sum = 0;
        double avg = 0;

        for (int number = 0; number < numbers.length; number++) {
            numbers[number] = (float) Math.ceil((Math.random() * (20 - 0) + 0));
            System.out.print(numbers[number] + " -> ");
        }

        for (float number : numbers) {
            sum = sum + number;
        }

        avg = Math.round(sum / numbers.length);

        System.out.println("La suma total de elementos es: " + sum);
        System.out.println("El promedio total de elementos es: " + avg);

    }

    private static void exercise_sixth() {
        /*
         * Contando Elementos Pares
        Escribe un programa que genere un array de 10 elementos de tipo entero. Inicializa cada
         elemento con un número aleatorio menor a 100 y luego imprime todos los elementos del array 
         en una única línea. Posteriormente, recorre el array para contar los elementos pares y 
         muestra el total en la consola.
         */
        int[] numbers = new int[10];
        int cont = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (100 - 0) + 0);
        }

        for (int number : numbers) {
            System.out.print(number + " -> ");
        }

        for(int number : numbers) {
            cont = number % 2 == 0
            ? cont += 1
            : cont;
        }
        System.out.println();
        System.out.println("Hay " + cont + " numeros pares dentro del array numbers");
    }

    private static void exercise_fifth() {
        /*
         * Calcular suma acumulada:

        Escribe un programa que recorra un array de enteros y  calcule la suma acumulada de 
        los elementos, reemplazando cada elemento por la suma acumulada hasta ese punto.El
         tamaño y los números  a contener pueden ser de tu elección.
         */
        int[] numbers = {1,2,3,4,5};

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) continue;
            numbers[i] += numbers[i-1];
        }
        
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    private static void exercise_fourth() {
        /*
         * Invertir un array

        Escribe un programa que recorra un array de enteros y lo invierta, es decir, que el 
        primer elemento se convierta en el último y viceversa, luego imprime el array resultante 
        por consola.  El tamaño y los números  a contener pueden ser de tu elección.

        IMPORTANTE: Debes invertir de forma permanente el orden de los elementos. Analiza si 
        necesitas hacer uso de elementos auxiliares para concluir el ejercicio. 
         */
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int[] temp = new int[numbers.length];
        int count = 0;

        for(int i = numbers.length - 1; i >= 0; i--){
            temp[count] = numbers[i];
            count++;
        }
        numbers = temp;
        
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " -> ");
        }
    }

    private static void exercise_three() {
        /*
         * Imprimiendo elementos en orden inverso
        Escribe un programa que recorra un array de enteros y los imprima en orden inverso,
         comenzando desde el último elemento.. El tamaño y los números  a contener pueden ser 
         de tu elección.
         */
        int[] numbers = {100,500,600,1500,3000,9000};

        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }

    private static void exercise_two() {
        /*
         * Encontrando el valor mínimo 
        Escribe un programa que recorra un array de enteros y encuentre el valor mínimo presente
         en el array. El tamaño y los números  a contener pueden ser de tu elección.
         */
        int[] numbers = {111,222,333,444,555,666,120};
        int min = 999999;

        for (int i = 0; i < numbers.length; i++) {
            min = numbers[i] < min ? numbers[i] : min;
        }

        System.out.println("Numero menor es: " + min);
    }

    private static void exercise_one() {
        /*
         * Imprimiendo elementos
        Escribe un programa que recorra un array de enteros y muestre cada elemento en una línea
         separada. El tamaño, tipo de datos y la información a contener pueden ser de tu elección.
         */
        int[] numbers = {100,200,300,400,500};

        for (int i = 0; i < numbers.length; i++) {
            System.err.println(numbers[i]);
        }
    }
}
