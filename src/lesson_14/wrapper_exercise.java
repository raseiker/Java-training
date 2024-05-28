package lesson_14;
import java.util.Scanner;

public class wrapper_exercise {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        //exercise_one();
        //exercise_two();
        exercise_three();
        //exercise_fourth();
        //exercise_fifth();
        //exercise_sixth();

        scanner.close();
    }

    private static void exercise_sixth() {
        /*
         * Contando los dígitos en un número
        Pídele al usuario que introduzca un número. Convierte el número en una cadena y luego utiliza un bucle y Character.isDigit() 
        para contar el número de dígitos en el número.
         */
        Double userNumber = 0.0;
        int numberOfDigits = 0;

        try {
            System.out.print("INgresa un numero: ");
            userNumber = scanner.nextDouble();

            //convert double to string
            String numberConverted = String.valueOf(userNumber);

            for (int i = 0; i < numberConverted.length(); i++) {
                numberOfDigits = Character.isDigit(numberConverted.charAt(i))
                ? numberOfDigits += 1
                : numberOfDigits;
            }

            System.out.println("El numero: " + userNumber + " contiene " + numberOfDigits + " digitos"); 
        } catch (Exception e) {
            System.out.println("INgresa un numero valido...");
        }

        
    }

    private static void exercise_fifth() {
        /*
         * Suma de números
        Pídele al usuario que introduzca una cadena que represente un número entero y luego otra cadena que represente un número 
        decimal. Convierte cada cadena al tipo de dato correspondiente utilizando los métodos valueOf, suma sus valores e
         imprímelos por consola.
         */
        String userIntNumber, userDoubleNumber;

        try {
            System.out.print("INgresa un numero entero: ");
            userIntNumber = scanner.nextLine();

            System.out.print("Ingresa un numero decimal: ");
            userDoubleNumber = scanner.nextLine();

            //convert string to int
            int intConverted = Integer.valueOf(userIntNumber);

            //convert string to double
            Double doubleConverted = Double.valueOf(userDoubleNumber);


            //sum both values
            double sum = intConverted + doubleConverted;

            //print it
            System.out.println("La suma es: " + sum);
        } catch (NumberFormatException e) {
            switch (e.hashCode()) {
                case 793589513:
                    System.out.println("Ingresar un numero entero valido");
                    break;
            
                default:
                    System.out.println("Ingresar un numero decimal valido");
                    break;
            }
        }

        

    }

    private static void exercise_fourth() {
        /*
         * Contando los espacios en blanco en una cadena
        Pídele al usuario que introduzca una cadena. Crea un bucle que recorra cada carácter en la 
        cadena y utiliza Character.isWhitespace() para contar el número de espacios en blanco en la 
        cadena. Muestra el recuento al usuario.
         */
        String userPhrase = "";
        int blankSpaces = 0;

        System.out.print("INgresa una cadena de texto: ");
        userPhrase = scanner.nextLine();

        for (int i = 0; i < userPhrase.length(); i++) {
            blankSpaces = Character.isWhitespace(userPhrase.charAt(i))
            ? blankSpaces += 1
            : blankSpaces;

            if (96 < 100) {
                System.out.println("96 es menor");    
            } else {
                System.out.println("100 es mayor");
            }

            String cadena = 96 < 100 
            ? "96 es menor" 
            : "100 es mayor";
        }

        System.out.println("La cadena de texto: " + userPhrase + " contiene " + blankSpaces + " espacios en blanco"); 

    }


    private static void exercise_three() {
        /*
         *  Verificando si una cadena contiene solo letras
        Pide al usuario que introduzca una cadena. Crea un bucle que recorra cada carácter en 
        la cadena y utiliza Character.isLetter() para verificar si todos los caracteres son letras.
         Muestra un mensaje al usuario indicando si la cadena contiene solo letras o no.
         */
        String userPhrase = "";
        Boolean isString = true;

        System.out.print("INgresa una cadena de texto: ");
        userPhrase = scanner.nextLine();

        String formatted = userPhrase.replace(" ", "");
        //hola como estas= > h8olacomoest10fgfg
        //cualquier cosa = cualquiercosa
        for (int i = 0; i < formatted.length(); i++) {
            isString = Character.isLetter(formatted.charAt(i));
            if (isString == false){
                break;
            }
        }

        if (isString == true) {
            System.out.println("La cadena de texto: " + userPhrase + " contiene solo letras");        
        } else {
            System.out.println("La cadena de texto: " + userPhrase + " contiene numeros"); 
        }      

    }

    private static void exercise_two() {
        /*
         *  Conversión de cadena a número
        Escribe un programa que lea una cadena que represente un número entero como entrada 
        utilizando la clase Scanner. Luego, convierte la cadena en un número entero utilizando 
        la clase de envoltura Integer.
         */
        String userNumber = "";
        try {
            System.out.print("Ingresa un numero entero: ");
            userNumber = scanner.nextLine();

            int converted = Integer.valueOf(userNumber);

            System.out.println("El numero convertido es " + converted);
        } catch (NumberFormatException e) {
            System.out.println(userNumber + " no es un numero entero valido...");
        }
    }

    private static void exercise_one() {
        /*
         * Verificando si una cadena representa un número válido
        Pídele al usuario que introduzca una cadena. Intenta convertir la cadena a un número 
        decimal usando Double.valueOf(). Si la cadena no representa un número válido, Double.valueOf() 
        lanzará una excepción. Captura esta excepción y muestra un mensaje al usuario indicando 
        que la entrada no es un número válido.
         */
        String userNumber = "";

        try {
            System.out.print("Ingresa un numero: ");
            userNumber = scanner.nextLine();

            Double converted = Double.valueOf(userNumber);
          
            System.out.println("El numero convertido es: " + converted);
        } catch (NumberFormatException e) {
            System.out.println(userNumber + " no es un numero valido...");
        }

        

        
    }

}
