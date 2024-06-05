package methods_II_exercises;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class All {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // es_par();
        // imprimir_array();
        // validacion_contraseña();
        figuras_geometricas();
        // System.out.println(hasSpecialCharacter("m1"));

    }

    private static void figuras_geometricas() {
        /*
         * Figuras geométricas:
         * 
         * Crea un programa que calcule las áreas y los perímetros de un círculo, un
         * triángulo o un paralelogramo. Debe tener dos menús: uno para elegir la figura
         * geométrica y otro para elegir qué calcular.
         * 
         * En cada opción se deben solicitar los datos necesarios para aplicar la
         * fórmula correspondiente:
         * 
         * Perímetro del círculo = 2 * π * radio
         * 
         * Área del círculo = π * radio ^2
         * 
         * Perímetro del triángulo = a + b + c (donde a, b y c son las longitudes de los
         * lados del triángulo)
         * 
         * Área del triángulo = (base * altura) / 2
         * 
         * Perímetro del paralelogramo = 2* (a + b) (donde a y b son las longitudes de
         * los lados adyacentes del paralelogramo)
         * 
         * Área del paralelogramo = base * altura
         */
        Integer userGeometricFigure = null, userOperation = null;
        String response = null;

        try {
            userGeometricFigure = showGeometricFiguresMenu();

            userOperation = showOperationMenu();

            Double result = makeOperation(userGeometricFigure, userOperation);

            response = getPrettyResponse(userGeometricFigure, userOperation, result);

            System.out.println(response);

            System.out.println();
        } catch (InputMismatchException e) {
            scanner.nextLine();

            System.out.println("Escribe solo numeros...");
        }

    }

    private static Double makeOperation(Integer userGeometricFigure, Integer userOperation) {
        return switch (userGeometricFigure) {
            case 1 -> {
                System.out.print("Radio of the circle ? ");
                int radio = scanner.nextInt();

                yield switch (userOperation) {
                    case 1 -> Math.PI * Math.pow(radio, 2);// area
                    case 2 -> 2 * Math.PI * radio;// perimeter
                    default -> 0.0;
                };
            }
            case 2 -> {
                yield switch (userOperation) {
                    case 1 -> {// area
                        System.out.print("Base of the triangle? ");
                        Double base = scanner.nextDouble();

                        System.out.print("Height of the triangle ? ");
                        Double height = scanner.nextDouble();

                        yield (base * height) / 2;
                    }
                    case 2 -> {
                        System.out.print("Side A? ");
                        Double a = scanner.nextDouble();

                        System.out.print("Side B? ");
                        Double b = scanner.nextDouble();

                        System.out.print("Side C? ");
                        Double c = scanner.nextDouble();

                        yield (a + b + c);
                    }
                    default -> 0.0;
                };
            }
            case 3 -> {
                yield switch (userOperation) {
                    case 1 -> {// area
                        System.out.print("Base of the parallelogram? ");
                        Double base = scanner.nextDouble();

                        System.out.print("Height of the pararllelogram ? ");
                        Double height = scanner.nextDouble();

                        yield (base * height);
                    }
                    case 2 -> {
                        System.out.print("Side A? ");
                        Double a = scanner.nextDouble();

                        System.out.print("Side B? ");
                        Double b = scanner.nextDouble();

                        yield 2 * (a + b);
                    }
                    default -> 0.0;
                };
            }
            default -> 0.0;
        };
    }

    private static String getPrettyResponse(Integer userGeometricFigure, Integer userOption, Double result) {
        String response = "The ";

        response += switch (userOption) {
            case 1 -> "Area";
            default -> "Perimeter";
        };

        response += " of the ";

        response += switch (userGeometricFigure) {
            case 1 -> "Circle";
            case 2 -> "Triangle";
            default -> "Parallelogram";
        };

        response += " is: " + result;

        return response;
    }

    private static Integer showOperationMenu() throws InputMismatchException {
        System.out.println("Choose a one option to execute..");
        System.out.println("***Operations***");
        System.out.println("1. Area");
        System.out.println("2. Perimeter");

        return scanner.nextInt();
    }

    private static Integer showGeometricFiguresMenu() throws InputMismatchException {
        System.out.println("***Figuras geométricas***");
        System.out.println("1. Círculo");
        System.out.println("2. Triangulo");
        System.out.println("3. Paralelogramo");

        return scanner.nextInt();
    }

    private static void validacion_contraseña() {
        /*
         * Validación de contraseña: Basándote en el ejercicio que ya has realizado,
         * crea un método "esSegura()" que reciba por parámetro un "String" y devuelva
         * un booleano para comprobar que la contraseña cumple con los criterios
         * establecidos. También, crea los métodos: "tieneLongitudCorrecta()",
         * "tieneMayuscula()", "tieneMinuscula()", "tieneNumero()" y
         * "tieneCaracterEspecial()", que reciban por parámetro un "String" y devuelvan
         * un "booleano".
         * 
         * Ejercicio anterior: “Validación de contraseña” Escribe un programa que
         * solicite al usuario que ingrese una contraseña y verifique si cumple con los
         * siguientes criterios para considerarse segura:
         * 
         * - La contraseña debe tener al menos 8 caracteres.
         * 
         * - La contraseña debe contener al menos una letra mayúscula y una letra
         * minúscula.
         * 
         * - La contraseña debe contener al menos un número.
         * 
         * - La contraseña debe contener al menos un carácter especial (por ejemplo,
         * !, @, #, $).
         * 
         * El programa debe mostrar un mensaje indicando si la contraseña es segura o
         * no, según los criterios establecidos. Puedes utilizar métodos de la clase
         * String para verificar cada uno de los criterios.
         */
        String userPassword = null;
        Boolean result = null;

        System.out.print("INgresa una cotraseña: ");
        userPassword = scanner.nextLine();

        result = isSafe(userPassword);

        if (result) {
            System.out.println("Contraseña segura");
        } else {
            System.out.println("Contraseña insegura");
        }
    }

    private static Boolean isSafe(String userPassword) {
        Boolean isCorrect = false;
        if (!isRightLength(userPassword)) {
            return isCorrect;
        }

        if (hasAtLeastOneNumber(userPassword)
                && hasCapitalLetter(userPassword)
                && hasLowerLetter(userPassword)
                && hasSpecialCharacter(userPassword)) {
            isCorrect = true;
        }

        return isCorrect;
    }

    private static Boolean hasSpecialCharacter(String userPassword) {
        Boolean isCorrect = false;

        for (int i = 0; i < userPassword.length(); i++) {
            if (!Character.isLetterOrDigit(userPassword.charAt(i))) {
                isCorrect = true;
                break;
            }
        }
        ;
        return isCorrect;
    }

    private static Boolean hasAtLeastOneNumber(String userPassword) {
        Boolean isCorrect = false;

        for (int i = 0; i < userPassword.length(); i++) {
            if (Character.isDigit(userPassword.charAt(i))) {
                isCorrect = true;
                break;
            }
        }
        ;
        return isCorrect;
    }

    private static Boolean hasLowerLetter(String userPassword) {
        Boolean isCorrect = false;

        for (int i = 0; i < userPassword.length(); i++) {
            if (Character.isLowerCase(userPassword.charAt(i))) {
                isCorrect = true;
                break;
            }
        }
        ;
        return isCorrect;
    }

    private static Boolean hasCapitalLetter(String userPassword) {
        Boolean isCorrect = false;

        for (int i = 0; i < userPassword.length(); i++) {
            if (Character.isUpperCase(userPassword.charAt(i))) {
                isCorrect = true;
                break;
            }
        }
        ;
        return isCorrect;
    }

    private static Boolean isRightLength(String password) {
        return password.length() >= 8;
    }

    private static void imprimir_array() {
        /*
         * 4. Imprimir array: Crea un programa que utilice un método
         * "imprimirArray(int[] array)" que se encargue de imprimir un array por
         * consola. El método debe recibir como parámetro un arreglo de tipo "int" y no
         * devolver nada. Luego, crea una sobrecarga del método para que acepte arrays
         * de tipo String y arreglos bidimensionales de tipo "int" y de tipo "String".
         */
        Integer[] intArray = { 1, 2, 5, 69, null };
        String[] stringArray = { "bien", "y", "tu" };
        String[][] stringBiArray = {
                { "hola", "como", "estas" },
                { "bien", "y", "tu" },
                { "bien" }
        };

        printArray(intArray);

        printArray(stringArray);

        printArray(stringBiArray);

    }

    private static void printArray(Integer[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void printArray(String[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void printArray(String[][] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void es_par() {
        /*
         * 1. Es par: Reemplaza la lógica de pedir un número por un método llamado
         * "solicitarNumero()" que no reciba parámetros y devuelva un entero. También
         * reemplaza la condición del if por un método llamado "esPar()" que reciba por
         * parámetro un entero y devuelva un booleano.
         * 
         * public static void main(String[] args) {
         * Scanner pepe = new Scanner(System.in);
         * Integer numero = null;
         * System.out.println("Por favor ingrese un número:");
         * do {
         * try {
         * numero = pepe.nextInt();
         * } catch (Exception e) {
         * pepe.nextLine();
         * System.out.println("No ingresó un número, intente nuevamente:");
         * }
         * } while (numero == null);
         * if (numero % 2 == 0) {
         * System.out.println("El "+numero+" es par");
         * }
         * }
         */

        Integer number = null;
        number = getUserNumber();
        if (isPar(number)) {
            System.out.println("El " + number + " es par");
        }

    }

    /*
     * Check if a number is par or not. Return true if [number] is par, false
     * otherwise
     */
    private static boolean isPar(Integer number) {
        return number % 2 == 0;
    }

    /*
     * Get a number from scanner and validate it. Return that number
     */
    private static Integer getUserNumber() {
        Integer number = null;
        System.out.println("Por favor ingrese un número:");
        do {
            try {
                number = scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (number == null);
        return number;
    }
}
