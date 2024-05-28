package actividades_integradores_3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class all_exercises {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // exercise_one();
        // exercise_two();
        //exercise_three();
        exercise_fourth();
        // ejercicio_x();

        //System.out.println(1 % 2);
        scanner.close();
    }

    private static void exercise_fourth() {
        /*
         *  Números primos
        Escribe un programa que solicite al usuario que introduzca un número y verifique si es un número primo utilizando 
        un bucle do-while. Si el número no es primo, pedir al usuario que introduzca otro número hasta que introduzca un 
        número primo. Finalizar el programa cuando ingrese 0 (cero).

        Un número es primo si solo tiene dos divisores: 1 y él mismo. 
         */
        int maybePrime;
        int[] rareNUmber = {1,2};

        System.out.print("INgresa un numero primo: ");
        maybePrime = scanner.nextInt();
        if (maybePrime % 2 == 1 || maybePrime == 2) {
            System.out.println("Tu numero primo es: " + maybePrime);
        } else {
            do {
                System.out.print("INgresa un numero primo de verdad pliss: ");
                maybePrime = scanner.nextInt();
    
                if (maybePrime == 0) break;
            } while (maybePrime % 2 == 0 || maybePrime == 1);
        }

     
    }

    private static void exercise_three() {
        /*
         * Actividad:Fibonacci
         * Escribe un programa que imprima los primeros 8 términos de la serie de
         * Fibonacci utilizando un bucle while.
         * La serie de Fibonacci es una secuencia en la que cada número es la suma de
         * los dos anteriores.
         * 
         * La serie de Fibonacci comienza de la siguiente manera:
         * 
         * Posición 0: 0
         * 
         * Posición 1: 1
         * 
         * Posición 2: 1 (la suma de la posición 0 y la posición 1, 0 + 1 = 1)
         * 
         * Posición 3: 2 (la suma de la posición 1 y la posición 2, 1 + 1 = 2)
         * 
         * Posición 4: 3 (la suma de la posición 2 y la posición 3, 1 + 2 = 3)
         * 
         * Entonces, los primeros 5 términos (considerando el índice inicial 0) de la
         * serie de Fibonacci son: 0, 1, 1, 2, 3.
         */
        int[] array = new int[5];
        int index = 0;
        int anotherIndex = 0;

        while (index < array.length) {
            array[index] = index == 0 
            ? 0
            : index == 1
            ? 1
            : (array[index - 2] + array[index - 1]);
            index++;
        }

        while (anotherIndex < array.length) {
            System.out.println("Indice " + anotherIndex + " y su valor fibonacchi: " + array[anotherIndex]);
            anotherIndex++;
        }

    }

    private static void ejercicio_x() {
        Random random = new Random();

        System.out.print("Ingrese cuantos caracteres desea en la contraseña: ");
        int cant = scanner.nextInt();

        char[] array = new char[cant];
        int contraseña = random.nextInt();
        int numeroAleatorio = 0;
        char x = ' ';

        for (int i = 0; i < array.length; i++) {
            if (48 <= 126) {
                numeroAleatorio = (int) ((Math.random() * 122 - 48) + 48);
                x = Character.toChars(numeroAleatorio)[0];
                if (Character.isDigit(x) || Character.isUpperCase(x) || Character.isLowerCase(x)) {
                    array[i] = x;
                }
            }

        }
        System.out.print("contraseña generada es: ");
        for (int numero : array) {
            System.out.println(numero);
        }

    }

    private static void exercise_two() {
        /*
         * Actividad: Estadísticas de calificaciones
         * Vas a desarrollar un programa en Java que genere un arreglo de calificaciones
         * de manera aleatoria. Estas calificaciones
         * se almacenarán en un arreglo de Strings.
         * 
         * Una vez generado el arreglo, el programa deberá generar 3 arreglos nuevos,
         * separando las calificaciones entre desaprobado
         * (< 4), aprobado (>= 4), y excelente (>=10). Necesitarás convertir los String
         * a double para lograrlo.
         * 
         * Luego calcula el promedio del arreglo original y de cada uno de los nuevos
         * arreglos.
         * 
         * Por último, imprimiré los resultados en consola.
         */
        String[] gradesArr = new String[10];
        Double[] gradesArrDouble = new Double[10], disapproved = {}, approved = {}, excellent = {};

        int index = 0;

        // generate a random number
        for (int i = 0; i < gradesArr.length; i++) {
            gradesArr[i] = String.valueOf((int) (Math.random() * 20));
        }

        // convert string array to double array
        for (int i = 0; i < gradesArrDouble.length; i++) {
            gradesArrDouble[i] = Double.valueOf(gradesArr[i]);
        }

        // sort into ascending order
        Arrays.sort(gradesArrDouble);

        // initialize and fit disapprove, approve and excellent arrays base on certain
        // logic
        for (int i = 0; i < gradesArrDouble.length; i++) {

            if (gradesArrDouble[i] >= 4 && disapproved.length == 0) {// disapproved
                if (i == 0) {
                    disapproved = new Double[1];
                    continue;
                }
                disapproved = Arrays.copyOfRange(gradesArrDouble, 0, i);// 1,2,3,5
                index = i;
            } else if (gradesArrDouble[i] >= 10 && approved.length == 0) {// approved and excellent
                approved = Arrays.copyOfRange(gradesArrDouble, index, i);
                excellent = Arrays.copyOfRange(gradesArrDouble, i, gradesArrDouble.length);
            }
        }
        System.out.println("original array -> " + Arrays.toString(gradesArrDouble));
        System.out.println("disapproved -> " + Arrays.toString(disapproved));
        System.out.println("approved -> " + Arrays.toString(approved));
        System.out.println("excellent -> " + Arrays.toString(excellent));

    }

    private static void exercise_one() {
        /*
         * Generando contraseñas
         * Vas a desarrollar un programa en Java que genere una contraseña aleatoria.
         * Esta contraseña estará compuesta por una mezcla
         * de letras mayúsculas, letras minúsculas y dígitos. La contraseña será
         * almacenada en un arreglo de caracteres.
         * 
         * Para generar la contraseña, utilizarás un bucle for que repetirá la operación
         * tantas veces como la longitud de la contraseña
         * especificada por el usuario.
         * 
         * Para asegurarte de que la contraseña generada contenga al menos una letra
         * mayúscula, una letra minúscula y un dígito,
         * usaré bucles do-while y while junto con los métodos isUpperCase, isLowerCase
         * e isDigit de la clase Character.
         * 
         * Finalmente, convertirás el arreglo de caracteres en un String con un bucle
         * for y luego imprimirás la contraseña generada
         * en la consola.
         */
        char[] password;
        char candidate = ' ';
        int passwordSize = 0;

        System.out.print("Longitud de la contraseña: ");
        passwordSize = scanner.nextInt();

        password = new char[passwordSize];

        for (int i = 0; i < password.length; i++) {// 0, 1, 2, 3, 4....9,10,11,12,13,14,15,16,....25----- 10
            // letras mayuscula, letra minuscula, digitos
            // Character.toString(i);

            do {
                int randomNumber = (int) ((Math.random() * 122 - 48) + 48);// [1] [0]
                candidate = Character.toChars(randomNumber)[0];// v
                if (Character.isDigit(candidate) ||
                        Character.isUpperCase(candidate) ||
                        Character.isLowerCase(candidate)) {
                    break;
                }
                ;
            } while (true);

            password[i] = candidate;// [70,M,v,g,10]
        }

        System.out.print("Contraseña generada: ");
        for (char palabra : password) {
            System.out.print(palabra);// 70Mvg10
        }
    }
}
