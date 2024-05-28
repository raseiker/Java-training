package lesson_9;
import java.util.InputMismatchException;
import java.util.Scanner;

public class actividades_integradoras {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            //exercise_one();
            exercise_two();
            System.out.println("Contraseña segura");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            System.out.println("La contraseña no es segura");
        }

                
    }

    private static String exercise_two() {
        /*
         * Validación de contraseña
        Escribe un programa que solicite al usuario que ingrese una contraseña y verifique si 
        cumple con los siguientes criterios para considerarse segura:

        La contraseña debe tener al menos 8 caracteres.

        La contraseña debe contener al menos una letra mayúscula y una letra minúscula.

        La contraseña debe contener al menos un número.

        La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).

        El programa debe mostrar un mensaje indicando si la contraseña es segura o no, según los
         criterios establecidos. Puedes utilizar métodos de la clase String para verificar 
         cada uno de los criterios.
         */
        String password = "";


        System.out.println("Ingresa una contraseña");
        password = scanner.nextLine();
        
        //if (password.length() < 8) {
        //    throw new InputMismatchException("Contraseña debe tener mas de 8 caracteres");
        //}

        if (password == password.toLowerCase()) {
            throw new InputMismatchException
            ("Contraseña debe tener tener al menos una mayuscula");
            
        }

        if (password == password.toUpperCase()) {
            throw new InputMismatchException
            ("Contraseña debe tener tener al menos una minuscula");
        }

        if (password.indexOf("1") == -1) 
            if  (password.indexOf("2") == -1) 
                if  (password.indexOf("3") == -1) 
                    if  (password.indexOf("4") == -1) 
                        if  (password.indexOf("5") == -1) 
                            if  (password.indexOf("6") == -1) 
                                if  (password.indexOf("7") == -1) 
                                    if  (password.indexOf("8") == -1) 
                                        if  (password.indexOf("9") == -1) 
                                            if  (password.indexOf("0") == -1) 
                                                throw new InputMismatchException
                                                ("Contraseña debe tener tener al menos un numero");
        
        if (password.indexOf("!") == -1) 
            if (password.indexOf("@") == -1) 
                if (password.indexOf("#") == -1) 
                    if (password.indexOf("$") == -1) 
                        throw new InputMismatchException("La contraseña debe contener al menos un carácter especial (!, @, #, $)");

        return password;
    }

    private static void exercise_one() {
        /*
         *  Conversión de unidades de temperatura
        Escribe un programa que cumpla con las siguientes condiciones:

        1. Solicita al usuario ingresar una temperatura y una unidad de medida: Celsius (C) o Fahrenheit (F).

        2. Convierte la temperatura a la otra unidad de medida y muestra el resultado en pantalla.

        De Celsius a Fahrenheit	De Fahrenheit a Celsius
        [°F] = ([°C] × 9 ⁄ 5) + 32	[°C] = ([°F] − 32) × 5 ⁄ 9

        3. El programa debe manejar al menos las siguientes situaciones:

        Si ingresa una unidad de medida inválida, mostrará un mensaje de error.

        Si ingresa una temperatura no válida, mostrará un mensaje de error.
         */

        int temperture = 0; //variable para temperatura
        char unitMeasure = ' ';//variable para unidad de medida (C y F)
        final char celsius = 'c', fahrenheit = 'f';//flag
        String response;


        try {
            System.out.println("Ingresa la temperatura");
            temperture = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
        }

        try {
            System.out.println("Ingresa una unidad de medida: \n 1. C para Celsius\n 2. F para Fahrenheit");
            unitMeasure = scanner.next().toLowerCase().charAt(0);

            if (Character.compare(unitMeasure, celsius) != 0 
            && Character.compare(unitMeasure, fahrenheit) != 0)
                throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
        }

        response = switch (unitMeasure) {
            case celsius -> {
                Double converted = Double.valueOf((temperture - 32) * 5 / 9);
                yield(temperture + " grados Celsius equivale a " + converted + " grados Fahrenheit.");
            }
            case fahrenheit -> {
                Double converted = Double.valueOf((temperture * 9 / 5) + 32);
                yield(temperture + " grados Fahrenheit equivale a " + converted + " grados Celsius.");
            }
            default -> throw new IllegalStateException();
        };

        System.out.println(response);
        scanner.close();
    }

    static void setValues() throws InputMismatchException {
        int temperture; //variable para temperatura
        char unitMeasure; //variable para unidad de medida (C y F)

        System.out.println("Ingresa la temperatura");
        temperture = scanner.nextInt();

        if (((Object) temperture).getClass().getSimpleName() != Integer.class.getSimpleName()) 
            throw new InputMismatchException("fdgdfg");

        System.out.println("Ingresa una unidad de medida: \n 1. C para Celsius\n 2. F para Fahrenheit");
        unitMeasure = scanner.next().charAt(0);

        if (((Object) unitMeasure).getClass().getSimpleName() != Character.class.getSimpleName()) 
            throw new InputMismatchException("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
    }
}
