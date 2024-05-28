package lesson_8;
import java.util.InputMismatchException;
import java.util.Scanner;

public class math_exercises {
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
         *  Generación aleatoria y análisis de raíz cuadrada

        Escribe un programa que cumpla con las siguientes condiciones:

        Pide al usuario que ingrese un número entre 1 y 30. Este número será almacenado en una variable llamada numeroLimite .

        Utiliza la clase Math para generar un número aleatorio entre 1 y el numeroLimite recibido del usuario.

        Utiliza el método Math.sqrt() para calcular la raíz cuadrada del número aleatorio generado y muéstralo en pantalla.

        Analiza si el número aleatorio generado es primo y muestra un mensaje en pantalla indicando si lo es o no.

        Finalmente, muestra el número aleatorio generado y su raíz cuadrada en pantalla.
         */

         int numeroLimite = -1;
         Double randomNumber, sqrt;

        //set user limit number
        while(numeroLimite < 1 || numeroLimite > 30) {
            System.out.println("INgresa un numero entre 1 y 30");
            numeroLimite = scanner.nextInt();    
        }

        //generate random number
        randomNumber = Math.floor(Math.random() * (numeroLimite - 1) + 1);

        //get sqrt for randomNumber and print it
        sqrt = Math.sqrt(randomNumber);

        System.out.println("NUmero random generado: " + randomNumber);
        System.out.println("Su raiz cuadrada es: " + sqrt);

        //resolve if randomNumber is prime and print it
        String isPrime = (randomNumber % 2) == 0
        ? randomNumber + " NO es numero primo"
        : randomNumber + " Es numero primo";

        System.out.println(isPrime);

        //show results
        System.out.println("El numero random generado entre 1 y "+ numeroLimite + " es: " + randomNumber +
         " y su raiz cuadrada es: " + sqrt);
         
    }

    private static void exercise_sixth() {
        /*
         * Generando un número aleatorio entre dos límites

        Escribe un programa que pida al usuario ingresar dos números enteros: un límite inferior y un límite superior. 
        Luego, utiliza el método random() de la clase Math para generar y mostrar en pantalla un número aleatorio dentro 
        del rango especificado por los límites ingresados.
         */
        int lowerLimit, upperLimit;
        Double result;

        System.out.println("Ingresa el limite inferior:");
        lowerLimit = scanner.nextInt();

        System.out.println("Ingresa el limite superior");
        upperLimit = scanner.nextInt();

        result = Math.floor(Math.random() * (upperLimit - lowerLimit) + lowerLimit);

        System.out.println("Numero random entre " + lowerLimit + " y " + upperLimit + " = " + result);
    }

    private static void exercise_fifth() {
        /*
         * Calculando la raíz cuadrada
        Escribe un programa que pida al usuario un número positivo y calcule su raíz cuadrada utilizando el método sqrt() 
        de la clase Math. Si el número ingresado es negativo, muestra un mensaje adecuado en pantalla.
         */
        Double positiveNumber;
        String result;

        System.out.println("Ingresa un numero positivo");
        positiveNumber = scanner.nextDouble();

        result = positiveNumber > 0
        ? "La raiz cuadrada de " + positiveNumber + " es " + (Math.sqrt(positiveNumber))
        : "Solo ingresa numeros positivos";

        System.out.println(result);
    }

    private static void exercise_fourth() {
        /*
         * Calculando la potencia
        Escribe un programa que pida al usuario dos números enteros, representando la base y el exponente, y calcula el resultado
         de elevar la base al exponente utilizando el método pow() de la clase Math. Muestra el resultado en pantalla.
         */
        int base, exponent;

        try {
            System.out.println("Ingresa la base");
            base = scanner.nextInt();

            System.out.println("Ingresa el exponente");
            exponent = scanner.nextInt();

            Double result = Math.pow(base, exponent);

            System.out.println(base + " al " + exponent + " es " + result );
        } catch (InputMismatchException e) {
            System.out.println("SOlo ingresa numeros enterros..");
            scanner.reset();
        }

        scanner.close();
        

        
    }

    private static void exercise_three() {
        /*
         * Generando números aleatorios
        Escribe un programa que genere y muestre en pantalla un número aleatorio en el rango del 1 al 355  utilizando el 
        método random() de la clase Math. Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo.
         */
        Double randomNumber = Math.floor(Math.random() * (355 - 1) + 1);
        System.out.println(randomNumber);
    }

    private static void exercise_two() {
        /*
         * Redondeo de números
        Escribe un programa que pida al usuario un número decimal y muestra en pantalla su valor redondeado utilizando el
         método round() de la clase Math.
         */
        Double number;
        long result;

        try {
            System.out.println("Ingresa un numero decimal");
            number = scanner.nextDouble();
            result = Math.round(number);
            System.out.println("El valor redondeado de " + number + " es " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ingresa solo numeros decimales...");
        }

        scanner.close();
         
    }

    private static void exercise_one() {
        /*
         * Calculando el valor absoluto
        Escribe un programa que  pida al usuario un número entero y muestra en pantalla su valor absoluto utilizando el método abs()
         de la clase Math.
         */
        int number, absoluteNumber;

        try {
            System.out.println("Ingresa un numero entero..");
            number = scanner.nextInt();    
            absoluteNumber = Math.abs(number);
            System.out.println("El valor absoluto de " + number + " es: " + absoluteNumber);
        } catch (InputMismatchException e) {
            System.out.println("Solo ingresa numeros enteros positivos..");
        }

        scanner.close();
    }
}
