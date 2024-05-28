package lesson_6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch_exercises {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //divisionSegura();
        //exercise_two();
        exercise_three();
    }

    public static void divisionSegura() {
        /*
         * Actividad: Division Segura
        Escribe un programa que pida al usuario que ingrese dos números enteros y realice la 
        división del primer número entre el segundo número. Implementa un bloque "try-catch" 
        para manejar la excepción en caso de que se intente realizar una división por cero. 
        En caso de que ocurra la excepción, muestra un mensaje apropiado en la pantalla.
         */


        int num1, num2;
        Double result;

        System.out.println("Ingresa un numero: ");
        num1 = scanner.nextInt();

        System.out.println("Ingresa el divisor: ");
        num2 = scanner.nextInt();

        try {
            result = Double.valueOf(num1 / num2);
            System.out.println("El resultado de la división es: " + result);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero..");
        }
      
    }

    public static void exercise_two() {
        /*
         * Escribe un programa que solicite al usuario ingresar dos números. Luego, 
         * realiza la resta del primer número menos el segundo número. Implementa un bloque
         *  "try-catch" para manejar las excepciones que puedan surgir en caso de que el usuario
         *  no ingrese números. En caso de que se produzca una excepción, muestra un mensaje 
         * apropiado en pantalla. Si no se produce ninguna excepción, muestra el resultado de la resta.
         */

        int num1, num2, result;

        try {
            System.out.println("Ingresa un numero: ");
            num1 = scanner.nextInt();

            System.out.println("Ingresa otro numero: ");
            num2 = scanner.nextInt();

            result = num1 - num2;
            
            System.out.println("El resultado de la resta es: " + result);  
    
        } catch (InputMismatchException e) {
            System.out.println("Ingresa solo numeros enteros...");
        }
        
    }

    public static void exercise_three() {
        /*
         * Conversión de Cadena a Entero
        Escribe un programa que solicite al usuario ingresar una cadena de caracteres que 
        represente un número entero. Utiliza el método Integer.parseInt() para convertir la 
        cadena en un número entero. Implementa un bloque "try-catch" para manejar la excepción 
        en caso de que la cadena ingresada no pueda ser convertida en un número entero. En caso
         de que se produzca la excepción, muestra un mensaje apropiado en la pantalla.
         */
        String word;
        int converted;

        System.out.println("Ingresa un numero");
        word = scanner.nextLine();

        try {
            converted = Integer.parseInt(word);
            System.out.println("Convertido con exito.. " + converted);
        } catch (NumberFormatException e) {
            System.out.println("No se pudo convertir a numero porque no ingreaste un numero");
        }
    }
}
