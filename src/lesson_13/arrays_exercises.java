package lesson_13;
import java.util.Arrays;
import java.util.Scanner;

public class arrays_exercises {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //exercise_one();
        //exercise_two();
        //exercise_three();
        //exercise_fourth();
        //exercise_fifth();
        exercise_sixth();

        scanner.close();
    }

    private static void exercise_sixth() {
        /*
         * Rellenando un arreglo de manera personalizada

        Escribe un programa en Java que realice lo siguiente:

        Solicita al usuario un tamaño para un arreglo.

        Luego, pídele que ingrese un número con el que desea rellenar el array.

        Solicita el índice hasta el cual quiere rellenar el array con el número anterior.

        El array deberá ser rellenado con el número proporcionado hasta el índice ingresado 
        por el usuario.

        Asegúrate de validar lo siguiente:

        La primera vez que se pide al usuario un número para rellenar el arreglo, el índice inicial
         debe ser 0.

        Si el índice ingresado no es el índice del último elemento del arreglo, el programa debe
         continuar pidiendo al usuario nuevos números e índices para rellenar el arreglo.

        El índice siempre debe ser menor que el tamaño total del arreglo.

        Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice ingresado debe 
        ser mayor que el último índice ingresado; a su vez, se debe rellenar el array con el 
        nuevo número desde el índice anterior hasta el nuevo índice.

        Por último, el programa debe imprimir por consola el arreglo completo.
         */

         int[] arr;
         int userNumber, userIndex = 0, userLastIndex = 0;

        System.out.print("INgresa el tamaño del arreglo: ");
        arr = new int[scanner.nextInt()];

        while (userLastIndex < arr.length) {
            if (userIndex == 0) {
                System.out.print("Ingresa un numero para rellenar el array: ");
                userNumber = scanner.nextInt();   
            } else {
                System.out.print("Ingresa un nuevo numero para rellenar el array: ");
                userNumber = scanner.nextInt();
            }
            

            System.out.print("Hasta que indice deseas llenar el array? ");
            userIndex = scanner.nextInt();

            if (userIndex > arr.length) {
                System.out.println("El indice debe ser menor igual a " + arr.length);
                continue;
            }

            if (userIndex <= userLastIndex) {
                System.out.println("El indice debe ser mayor a " + userLastIndex);
                continue;
            }

            for (int i = userLastIndex; i < userIndex; i++) {
                arr[i] = userNumber;
            }

            userLastIndex = userIndex;
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void exercise_fifth() {
        /*
         *  Rellenando un arreglo
        El método fill() de la clase Arrays cambia todos los elementos en un arreglo por un 
        valor estático, desde el índice start (por defecto 0) hasta el índice end (por defecto 
        array.length) y devuelve el arreglo modificado. Vamos a escribir un programa que solicite
         al usuario el tamaño para un arreglo y un número entero con el que quiera rellenarlo. 
         Luego crea el arreglo y utiliza Arrays.fill(). Finalmente, imprime el arreglo resultante.
         */
        int[] arr;
        int arrSize, arrValue;

        System.out.print("Tamaño del arreglo: ");
        arrSize = scanner.nextInt();

        System.out.print("Valores del arreglo: ");
        arrValue = scanner.nextInt();

        arr = new int[arrSize];

        Arrays.fill(arr, arrValue);

        System.out.println("Array final: ");
        System.out.println(Arrays.toString(arr));
    }

    private static void exercise_fourth() {
        /*
         * Copiando parte de un arreglo. 
        Crea un programa en Java que declare y muestre un arreglo de enteros junto con sus índices. 
        Luego, solicita al usuario dos índices: un índice inicial y un índice final. Con estos dos 
        índices, copia la parte del arreglo original comprendida entre ellos (inclusive) en un 
        nuevo arreglo utilizando el método Arrays.copyOfRange(). Asegúrate de incluir validaciones 
        para confirmar que el índice inicial es menor que el índice final y que ambos índices
         están dentro del rango válido del arreglo original. Finalmente, imprime el nuevo arreglo 
         por consola.
         */
        int[] arr = {1,5,6,7,8,9,10};
        int initIndex = 0, finalIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] -> " + arr[i]);
        }

        while (true) {
            System.out.print("INgresa indice inicial: ");
            initIndex = scanner.nextInt();

            System.out.print("INgresa indice final: ");
            finalIndex = scanner.nextInt();
            
            if (initIndex > finalIndex) {
                System.out.println("El indice inicial debe ser mayot al indice final");
            } else if (initIndex < 0 || initIndex > arr.length) {
                System.out.println("El indice inicial debe estar entre 0 y " + arr.length);
            } else if (finalIndex < 0 || finalIndex > arr.length) {
                System.out.println("El indice final debe estar entre 0 y " + arr.length);
            } else {
                break;
            }
        }
        

        int[] newArray = Arrays.copyOfRange(arr, initIndex, finalIndex);

        System.out.println("Nuevo array:");
        System.out.println(Arrays.toString(newArray));
    }

    private static void exercise_three() {
        /*
         * Comparando arreglos
        Escribe un programa que compare dos arreglos de enteros utilizando el método Arrays.equals().
         El programa debe imprimir si los arreglos son iguales o no.
         */

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Boolean result = Arrays.equals(arr1, arr2);

        String message = result
        ? "Los arreglos son iguales"
        : "Los arreglos son distintos";

        System.out.println(message);
    }

    private static void exercise_two() {
        /*
         * Búsqueda binaria
        La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista 
        ordenada de elementos. La clase Arrays ya incluye su implementación mediante el método
         binarySearch(). Escribe un programa que realice una búsqueda binaria en un arreglo ordenado
          de enteros utilizando el método Arrays.binarySearch(). El programa debe imprimir el 
          arreglo generado originalmente, solicitar al usuario el valor buscado e imprimir el 
          índice del valor buscado si está presente en el arreglo.
         */
        int[] arr = new int[10];
        int userNumber ;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 50 - 15) + 15);
        }

        System.out.println("Arreglo de enteros original");
        System.out.println(Arrays.toString(arr));

        System.out.print("Ingresa el valor numerico a buscar: ");
        userNumber = scanner.nextInt();

        //search by binary method
        int index = Arrays.binarySearch(arr, userNumber);

        String message = index == -11
        ? "El numero " + userNumber + " no se encuentra en el arreglo"
        : "El numero " + userNumber + " se encuentra en el indice " + index + " del arreglo";

        System.out.println(message);
    }

    private static void exercise_one() {
        /*
         * Ordenar en forma descendente
        Escribe un programa en el que declares una variable de tipo array que contenga 10 elementos 
        de tipo entero. Inicializa el arreglo con valores aleatorios entre 1 y 100, imprime por 
        consola el arreglo inicial y luego ordenalo en forma descendente utilizando el método 
        Arrays.sort(). Finalmente, imprime los elementos ordenados en la consola.
         */

         int[] numbers = new int[10];

         for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * 100 - 1) + 1);
         }

        System.out.println("Lista original sin ordernar: ");
        for (int i : numbers) {
            System.out.print(i + " -> ");
        }

        Arrays.sort(numbers);
        

        System.out.println("\nLista ordenada descendentemente: ");
        for ( int i = numbers.length - 1; i >= 0; i--) {
           System.out.print(numbers[i] + " -> ");     
        }
    }
}
