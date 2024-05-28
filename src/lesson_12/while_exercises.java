package lesson_12;
import java.util.Scanner;

public class while_exercises {
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
         * Calculadora de suma acumulada

        Crea un programa que solicite al usuario ingresar una serie de números enteros positivos. 
        Utiliza un bucle do-while para ir acumulando la suma de los números ingresados. Después 
        de cada entrada de número, pregunta al usuario si desea ingresar otro número. Si el usuario
        responde afirmativamente, continúa solicitando números; de lo contrario, muestra la suma
         acumulada de todos los números ingresados y termina el programa.
         */
    }

    private static void exercise_sixth() {
        /*
         * Contador de números pares e impares

        Escribe un programa que solicite al usuario ingresar una serie de números enteros. Utiliza un bucle while para contar 
        la cantidad de números pares e impares ingresados hasta que el usuario decida terminar la entrada de números. 
        Al finalizar, muestra la cantidad de números pares e impares ingresados
         */
        int question = 0, i = 0, numPares = 0, numIMpares = 0;
        int[] userNumbers;

        System.out.print("Cuantos numeros enteros desea ingresar ? ");
        question = scanner.nextInt();

        userNumbers = new int[question];

        while (question > 0) {
            System.out.print("Ingresa el " + (i+1) + " numero entero: ");
            userNumbers[i] = scanner.nextInt();
            i++;
            question--;
        }
        
        for (int j : userNumbers) {
            if (j % 2 == 0 ){
                numPares += 1;
            } else {
                numIMpares += 1;
            }

            System.out.println(j);
        }

        System.out.println("Hay " + numPares + " numeros pares en la lista");
        System.out.println("Hay " + numIMpares + " numeros impares en la lista");

    }

    private static void exercise_fifth() {
        /*
         * Tabla de multiplicar

        Escribe un programa que solicite al usuario un número entero y muestre la tabla de multiplicar de ese número utilizando 
        un bucle while. El programa debe seguir solicitando números hasta que el usuario ingrese un valor igual a cero, en cuyo
         caso debería salir del bucle.
         */
        int userNumber = 1, factor = 1;

        

        while (userNumber > 0) {
            System.out.print("Ingresa un numero entero: ");
            userNumber = scanner.nextInt();

            if (userNumber == 0) break;

            for (int i = 1; i <= 12; i++) {
                System.out.println(userNumber + " x " + i + " = " + (userNumber * i));     
            }
        }
    }

    private static void exercise_fourth() {
        /*
         *  Número de dígitos
        Escribe un programa que te pida que ingreses un número entero y utilice un bucle while para calcular la cantidad de 
        dígitos de ese número. Por ejemplo, el número 4578 tiene 4 dígitos. El programa debe tener en cuenta que el 0 tiene 
        una cifra y también contar las cifras de números negativos.
         */
        int userNumber, factor = 1;
        double divisor = 1.0;

        System.out.print("Ingresa un numero entero: ");
        userNumber = scanner.nextInt();

        int myNum = Math.abs(userNumber);

        while (divisor >= 1.0) {
            factor *= 10;     
            divisor = myNum / factor;
        }

        int numDigits = String.valueOf(factor).length() - 1;

        System.out.println("El numero " + userNumber + " tiene " + numDigits + " digitos");

    }

    private static void exercise_three() {
        /*
         * Validación de contraseña
        Escribe un programa que solicite que ingreses una contraseña y la valide utilizando un
         bucle while. La contraseña correcta es "secreto". Continuará pidiéndote que ingreses 
         la contraseña hasta que sea correcta.
         */
        String password = "";
        final String SECRET = "secreto";
        int attemps = 0;

        while (! password.toLowerCase().equals(SECRET)) {
            System.out.print("Ingresa la contraseña secreta: ");
            password = scanner.nextLine(); 
            attemps++;
            System.out.println("Numero de intentos: " + attemps); 
        }
        System.out.println("COntraseña correcta !");
    }

    private static void exercise_two() {
        /*
         * Adivinando un número 
        Escribe un programa que genere un número aleatorio entre 1 y 20, y muestra por consola 
        un mensaje pidiéndote que adivines ese número utilizando un bucle do-while. El programa 
        te indicará si el número que ingresas es mayor o menor que el número aleatorio, y 
        seguirá pidiéndote que adivines hasta que lo hagas correctamente.
         */
        int aleatorio = (int) (Math.random() * (20 - 1) + 1);
        int userOption;

        do {
            System.out.println("Adivina el numero aleatorio entre 1 y 20: ");
            userOption = scanner.nextInt();

            if (userOption > aleatorio) {
                System.out.println("EL numero aleatorio es menor..");
            } else {
                System.out.println("EL numero aleatorio es mayor...");
            }
        } while (userOption != aleatorio);


        
        System.out.println("Adivinaste !!!! =) El numero aleatorio era " + aleatorio);
    }

    private static void exercise_one() {
        /*
         *  Menú interactivo con while 
        Crea un menú interactivo con 5 opciones para que el usuario elija, como por ejemplo:

        Comprar producto.

        Realizar devolución.

        Ver mis pedidos.

        Preguntas frecuentes.

        Salir.

        Luego, solicita al usuario que elija una opción del menú mostrado en pantalla. El menú 
        debe seguir apareciendo hasta que el usuario elija la opción para salir del programa. 
        En este ejercicio, no es necesario que las opciones del menú realicen acciones reales,
         simplemente muestra un mensaje que indique qué opción eligió el usuario.
         */

         int userChoice = 0;

         

         while (userChoice != 5) {
            System.out.println("\n\nElija entre las siguientes opciones: " +
            "\n1. Comprar producto." + 
            "\n2. Realizar devolución." +
            "\n3. Ver mis pedidos." +
            "\n4. Preguntas frecuentes." +
            "\n5. Salir.");

            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Elegiste comprar producto");
                    break;
                case 2:
                    System.out.println("Elegiste Realizar devolución");
                    break;
                case 3:
                    System.out.println("Elegiste ver mis pedidos");
                    break;
                case 4:
                    System.out.println("Elegiste preguntas frecuentes");
                    break;
                case 5:
                    System.out.println("Elegiste Salir. Chauuu");
                    break;
                default:
                    System.out.println("Escoge una opción válida");
                    break;
             }
         }

         
    }
}
