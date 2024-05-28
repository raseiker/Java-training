import java.util.Scanner;

public class OperacionesBasicas {

    public static void main(String args []) {

        Scanner entry = new Scanner(System.in);

        //Aplica lo aprendido resolviendo los siguientes ejercicios:
        //Declara dos variables, y asígnales un valor a cada una de ellas.
        Integer v1 = 5;
        Integer v2 = 8;
        System.out.println(v2);

        //Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en consola. 
        //Te animamos a mostrar el resultado dentro de un texto para que se vea ordenado el resultado, 
        //Ej: La suma de las 2 variables es : “[resultado]”;
        System.out.println("La suma de las 2 variables es: " + (v1 + v2));
        System.out.println("La resta de las 2 variables es: " + (v1 - v2));
        System.out.println("La multiplicación de las 2 variables es: " + (v1 * v2));
        System.out.println("La división de las 2 variables es: " + (v1 / v2));


        //Posteriormente, pide al usuario que ingrese dos números, guardarlos en variables previamente declaradas, 
        //realiza la suma de los números y muestra el resultado en la consola.
        Integer n1, n2;
        System.out.println("Please leave the first number... ");
        n1 = entry.nextInt();
       
        System.out.println("Please leave the second number... ");
        n2 = entry.nextInt();

        System.out.println("The sum of the two numbers is.. " + (n1 + n2));

        entry.close();
    }

}