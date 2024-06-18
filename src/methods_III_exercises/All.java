package methods_III_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class All {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        fibonacci_recursivo();
    }

    private static void fibonacci_recursivo() {
        /*
         * Actividad: Fibonacci y recursividad
         * Reorganiza el código extrayendo la lógica en métodos sin alterar su
         * funcionamiento. Después, intenta modificar la lógica para resolverlo de forma
         * recursiva.
         */
        int[] fibonacchi;
        int userNumber;

        System.out.print("Ingresa la posición de un número en la serie Fibonacci: ");
        userNumber = scanner.nextInt();

        fibonacchi = new int[userNumber + 1];

        //pending

        for (int i = 0; i < fibonacchi.length; i++) {
            fibonacchi[i] = i == 0
                    ? 0
                    : i == 1
                            ? 1
                            : fibonacchi[i - 1] + fibonacchi[i - 2];
        }

        int value = fibonacchi[userNumber];

        System.out.println(Arrays.toString(fibonacchi));
        System.out.println("Valor de la posición [" + userNumber + "] de la serie Fibonacchi es: " + value);
    }
}
