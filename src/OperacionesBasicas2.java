import java.util.Scanner;

public class OperacionesBasicas2 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        Integer n1, n2, n3, n4;

        //1. Pide al usuario que ingrese dos números, y:
        System.out.println("first number...");
        n1 = entry.nextInt();

        System.out.println("second number...");
        n2 = entry.nextInt();

        //A. Compara si el primer  número  ingresado  es mayor al segundo número  ingresado.
        System.out.println("is n1 greater than n2?.. " + (n1 > n2));

        //B. Verifica si el primer número ingresado  es distinto al segundo número ingresado .
        // Muestra el resultado en consola.
        System.out.println("is n1 different than n2.. " + (n1 != n2));

        //C. Verifica si el primer número ingresado  es divisible por 2 . Muestra el resultado en consola.
        System.out.println(n1 % 2 == 1 ? false : true);


        //2. Pide al usuario que ingrese otros 2 números, y realiza las siguientes validaciones:
        System.out.println("third number...");
        n3 = entry.nextInt();

        System.out.println("fourth number...");
        n4 = entry.nextInt();

        //A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
        System.out.println((n1 > n2 && n3 > n4));

        //B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
        System.out.println((n1 > n2 || n3 > n4));
        entry.close();
    }
}
