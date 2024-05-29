package actividades_integradoras_4;

import java.util.Arrays;
import java.util.Scanner;

public class all_exercises {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // calculo_factorial();
        // finonacci_mejorado();
        // primo_plus();
        dibujando_cuadrados();
        grafico_barras();
        // System.out.println(9 % 5);
    }

    private static void grafico_barras() {
        /*
         * Creando un gráfico de barras:

        Escribe un programa que solicite al usuario ingresar 4 números entre 1 y 20. Luego, imprime una representación 
        visual de estos números en forma de gráfico de barras utilizando asteriscos. Cada número ingresado corresponderá
         a la longitud de una barra en el gráfico, donde cada asterisco representa una unidad en la escala. 
         A modo de ejemplo:

        2**

        5*****

        1*

        4****
         */
    }

    private static void dibujando_cuadrados() {
        /*
         * Dibujando cuadrados
         * 
         * Realiza un programa para crear un cuadrado de N elementos por lado utilizando
         * el carácter “*”.
         * 
         * Para ello simplemente dibuja una línea de N asteriscos. Repite este proceso N
         * veces para completar el cuadrado.
         * 
         * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo
         * siguiente
         */

        int userNumber;
        String boundary = "", row = "*";

        System.out.println("Elementos del cuadrado: ");
        userNumber = scanner.nextInt();

        for (int i = 0; i < userNumber; i++) {
            boundary += "*";
        }

        for (int j = 0; j < userNumber - 2; j++) {
            row += " ";
        }

        row += "*";

        System.out.println(boundary);
        for (int i = 0; i < userNumber - 2; i++) {
            System.out.println(row);
        }
        System.out.println(boundary);

    }

    private static void primo_plus() {
        /*
         * Números primos plus
         * 
         * Siguiendo el ejemplo del ejercicio de “números primos”, ahora el desafío es
         * que desarrolles un programa que te
         * solicite la cantidad deseada de números primos que deseas obtener.
         * 
         * Tu programa deberá generar y mostrar la cantidad de números primos que hayas
         * solicitado.
         * 
         * Si estás comprobando si un número es divisible por todos los anteriores a él,
         * intenta pensar en formas de
         * optimizar el algoritmo para reducir la cantidad de divisiones necesarias.
         */
        int userNumber, count = 0, factor = 2;
        int[] primeArr;
        Boolean isPrime = true;

        System.out.print("Cuantos numeros primos deseas generar: ");
        userNumber = scanner.nextInt();
        primeArr = new int[userNumber + 100];

        while (count < userNumber) {
            for (int j = 2; j < factor; j++) {
                if (factor % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeArr[factor] = factor;
                count++;
            } else {
                isPrime = true;
            }
            factor++;
        }
        System.out.println("NUmeros primos generados en total: " + count);
        for (int i : primeArr) {
            if (i > 0) System.out.print(i + " -> ");
        }
    }

    private static void finonacci_mejorado() {
        /*
         * Serie Fibonacci mejorada
         * En esta actividad, te propongo un desafío adicional relacionado con la serie
         * de Fibonacci. La tarea consiste
         * en crear un programa que te permita ingresar la posición de un número en la
         * serie de Fibonacci y, a continuación,
         * mostrar el valor correspondiente a esa posición.
         * 
         * Recuerda que la serie de Fibonacci comienza con valores específicos para las
         * primeras posiciones:
         * 
         * Posición 0: 0
         * 
         * Posición 1: 1
         * 
         * Posición 2: 1
         * 
         * Posición 3: 2
         * 
         * Posición 4: 3
         * 
         * Tu objetivo es desarrollar un programa que sea capaz de calcular y mostrar el
         * valor de la serie de Fibonacci
         * para cualquier posición ingresada por el usuario. Este ejercicio te ayudará a
         * consolidar tu comprensión sobre
         * cómo generar y trabajar con la serie de Fibonacci. ¡Anímate a enfrentar este
         * reto y sigue profundizando en
         * tus habilidades de programación!
         */
        int[] fibonacchi;
        int userNumber;

        System.out.print("Ingresa la posición de un número en la serie Fibonacci: ");
        userNumber = scanner.nextInt();

        fibonacchi = new int[userNumber + 1];

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

    private static void calculo_factorial() {
        /*
         * Cálculo del factorial
         * El objetivo de esta actividad es que desarrolles un programa que solicite al
         * usuario ingresar un número y
         * posteriormente calcule su factorial mediante un bucle do-while. El factorial
         * de un número se define como el
         * producto de todos los enteros desde 1 hasta ese número. A continuación, te
         * presentamos algunos ejemplos
         * para mayor claridad:
         * 
         * El factorial de 3 se calcula como 1 * 2 * 3, lo que resulta en 6.
         * 
         * El factorial de 5 se obtiene multiplicando 1 * 2 * 3 * 4 * 5, dando como
         * resultado 120.
         * 
         * Para calcular el factorial de 7, multiplicamos 1 * 2 * 3 * 4 * 5 * 6 * 7, que
         * da 5040.
         */
        int userNumber, factorial = 1, count = 2;
        System.out.print("Ingresa un numero: ");
        userNumber = scanner.nextInt();

        do {
            factorial *= count;

            count++;
        } while (count <= userNumber);// 1<= 10

        System.out.println("EL factorial de " + userNumber + " es: " + factorial);

    }
}
