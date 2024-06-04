package methods_exercises;

import java.util.Scanner;

public class All {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        tabla_multiplicar();

        scanner.close();
    }

    private static void tabla_multiplicar() {
        /*
         * Tabla de multiplicar 2.0
         * 
         * En esta actividad, vas a crear un programa que solicita al usuario que
         * ingrese 3 números (incluida la lógica en un método llamado pedirNumeros()) y
         * luego imprime la tabla de multiplicar de cada uno de ellos 1 al 10 (incluida
         * la lógica en un método llamado imprimirTablasMultiplicar(int[] numeros)).
         * Para ello, implementarás un un array para almacenar los números ingresados y
         * luego invocarás el método para cada uno de ellos.
         */
        int n1 = 0, n2 = 0, n3 = 0;

        setUserNumbers(n1,n2,n3);

       
    }

    private static void setUserNumbers(int n1, int n2, int n3) {
        System.out.print("Ingrese numero 1:");
        n1 = scanner.nextInt();

        System.out.print("Ingrese numero 2:");
        n2 = scanner.nextInt();

        System.out.print("Ingrese numero 3:");
        n3 = scanner.nextInt();

        getMultiTable(n1, "1");
        getMultiTable(n2, "2");
        getMultiTable(n3, "3");
    }



    private static void getMultiTable(int number, String tableName) {
        System.out.println("Tabla del " + tableName + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
