package jUnit_intro;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        /*
         * /*
         * Actividad - ¿Es Par?
         * 
         * Crea una clase que contemple los siguientes métodos:
         * 
         * solicitarNumero(): Pedir un número por un método que no reciba parámetros y
         * devuelva un entero.
         * 
         * esPar(): Este método recibe por parámetro un entero, analiza si el número es
         * par, y retorna un booleano.
         * 
         * Crea una clase para testear esta actividad, incluyendo cada uno de los
         * métodos.
         */
        
        Integer number = getNumber();
        Boolean result = isEven(number);
        System.out.println(result);
    }

    public static Boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    public static Integer getNumber() {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        scanner.close();
        return number;
    }
}