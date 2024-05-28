package lesson_5;
import java.util.InputMismatchException;
import java.util.Scanner;

public class switch_exercises {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exercise_one();
        //exercise_two();
    }

    public static void exercise_one(){
        /*
         *  Ejercicio de Días de la Semana
        En esta actividad, escribirás un programa que solicite al usuario ingresar un número 
        del 1 al 7, que representará un día de la semana. Luego, el programa mostrará en pantalla 
        el nombre correspondiente a ese día. Utilizaremos la estructura "switch" para implementar
        este programa.
         */

        int number = 0;
        String selectedDay = "Youy selected day is ";

        try {
            while(number < 1 || number > 7) {

                System.out.println("Ingresa un numero del 1 al 7");
                number = scanner.nextInt();
            }

            selectedDay += switch(number) {
                case 1 -> "monday";
                case 2 -> "tueday";
                case 3 -> "wedneday";
                case 4 -> "thurday";
                case 5 -> "friday";
                case 6 -> "saturday";
                case 7 -> "sunday";
                default -> "";
            };
    
            System.out.println(selectedDay);
        } catch (InputMismatchException e) {
            System.out.println("Escribe un numero del 1 al 7..");
        }

        scanner.close();
    }

    public static void exercise_two() {
        /*
         * Selección de Figura Geométrica
        Mediante una estructura switch, desarrollarás un programa que pida al usuario ingresar un
         número del 1 al 3 para seleccionar una figura geométrica: 1 para círculo, 2 para 
         cuadrado y 3 para triángulo. Después, solicitará al usuario los datos necesarios 
         para calcular el área de la figura seleccionada. Estos datos serán:

        Para el círculo: el radio.

        Para el cuadrado: el lado.

        Para el triángulo: la base y la altura.

        Finalmente, el programa mostrará en pantalla el área correspondiente a la figura seleccionada.
         */

        System.out.println("ingresa un número del 1 al 3 para seleccionar una figura geométrica:\n" +
        "1 para círculo\n" +
        "2 para cuadrado\n" +
        "3 para triángulo");

        int selectedNumber = scanner.nextInt();

        switch (selectedNumber) {
            case 1 -> {//circle
                System.out.println("Ingrese el radio del circulo: ");
                int radius = scanner.nextInt();
                
                System.out.println("El área del circulo es : " + (Math.PI * Math.pow(radius, 2)));
            }
            case 2 -> {//square
                System.out.println("Ingrese el lado del cuadrado: ");
                int square = scanner.nextInt();

                System.out.println("El área del cuadrado es : " + (Math.pow(square, 2)));
            }

            case 3 -> {//triangle
                System.out.println("Ingrese la base del triangulo: ");
                int base = scanner.nextInt();

                System.out.println("Ingrese la altura del triangulo: ");
                int height = scanner.nextInt();

                System.out.println("El área del triangulo es : " + ((base * height) /2 ));
            }
            default -> System.out.println("Opcion invalida");
        };

        scanner.close();
    }
}
