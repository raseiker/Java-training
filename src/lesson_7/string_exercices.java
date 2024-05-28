package lesson_7;
import java.util.Scanner;

public class string_exercices {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //exercise_one();
        //exercise_two();
        //exercise_three();
        //exercise_fourth();
        //exercise_fifth();
        exercise_fifth_another_version();
    }

    public static void exercise_one(){
        String word, myChar, response;
        /*
         * ✏️  Actividad: Búsqueda de Caracteres
            Escribe un programa que pida al usuario ingresar una palabra y un carácter, y
             determine si el carácter ingresado se encuentra en la palabra utilizando el 
             método indexOf() de la clase String. Muestra un mensaje adecuado en pantalla 
             indicando si el carácter se encuentra o no en la palabra.
         */

        System.out.println("Ingrese una palabra: ");
        word = scanner.nextLine();

        System.out.println("Ingrese un carácter: ");
        myChar = scanner.nextLine();

        response = word.indexOf(myChar.toLowerCase()) == -1 
        ? "El carácter no se encuentra en la palabra" 
        : "El carácter si se encuentra en la palabra";

        System.out.println(response);

        scanner.close();
    }

    public static void exercise_two() {
        /*
         * 1. Reemplazo de Caracteres

            Escribe un programa que solicite al usuario ingresar una frase y dos caracteres. 
            Utiliza el método replace() de la clase String para reemplazar todas las ocurrencias
             del primer carácter con el segundo carácter en la frase ingresada por el usuario. 
             Muestra la frase resultante en pantalla.
         */

         String phrase, char1, char2;
         System.out.println("Ingresa una frase: ");
         phrase = scanner.nextLine();

         System.out.println("Ingresa el caracter a reemplazar: ");
         char1 = scanner.nextLine();

         System.out.println("Ingresa el nuevo caracter: ");
         char2 = scanner.nextLine();

         phrase = phrase.replace(char1, char2);

         System.out.println("La frase reemplazada es: " + phrase);
    }

    public static void exercise_three() {
        /*
         * 2. Eliminación de Espacios en Blanco

        Crea un programa que solicite al usuario ingresar una frase con espacios en blanco al 
        principio y al final. Utiliza el método trim() de la clase String para eliminar los 
        espacios en blanco y luego muestra la frase resultante en pantalla.
         */

        String phrase;

        System.out.println("Ingresa una frase con espacios en blanco al inicio y final");
        phrase = scanner.nextLine();

        System.out.println("Frase sin espacios en blanco: " + phrase.trim());
    }

    public static void exercise_fourth(){
        /*
         * 3. Comparación de Cadenas

        Desarrolla un programa que solicite al usuario ingresar dos palabras. 
        Utiliza el método equals() de la clase String para comparar si las dos palabras son iguales.
         Muestra un mensaje apropiado en pantalla indicando si las palabras son iguales o diferentes.
         */

         String word1, word2, response;

         System.out.print("Ingresa la primera palabra: ");
         word1 = scanner.nextLine();

         System.out.print("Ingresa la segunda palabra: ");
         word2 = scanner.nextLine();

         response = word1.equals(word2) 
         ? "Las palabras son iguales"
         : "Las palabras no son iguales";
         
         System.out.println(response);

    }

    public static void exercise_fifth(){
        /*
         * 4. Calculando la Longitud de Cadenas sin Espacios:

            En esta actividad, se solicita al usuario ingresar una cadena de texto y calcular 
            su longitud, pero esta vez sin contar los espacios en blanco. Para lograr esto,
             se utilizará el método length() de la clase String y se realizará un proceso adicional
              para excluir los espacios de la cuenta.
         */

         String phrase;
         String[] result;
         int count = 0;

         System.out.print("Ingresa una frase: ");
         phrase = scanner.nextLine();

        //split the user phrase
        result = phrase.split(" ");

        //iterate each word and count its lenght
        for (String i : result) {
            count += i.length();
        }
        
        //get lenght of the user phrase and print it
        System.out.println("La longitud de la frase sin espacios (" + phrase + ") es: " + count);

    }

    public static void exercise_fifth_another_version() {
        /*
         * 4. Calculando la Longitud de Cadenas sin Espacios:

            En esta actividad, se solicita al usuario ingresar una cadena de texto y calcular 
            su longitud, pero esta vez sin contar los espacios en blanco. Para lograr esto,
             se utilizará el método length() de la clase String y se realizará un proceso adicional
              para excluir los espacios de la cuenta.
         */

         String phrase;

         System.out.print("Ingresa una frase: ");
         phrase = scanner.nextLine();

        //replace all blank spaces
        phrase = phrase.replace(" ", "");

        //get lenght of the user phrase and print it
        System.out.println("La longitud de la frase sin espacios (" + phrase + ") es: " + phrase.length());
    }
}
