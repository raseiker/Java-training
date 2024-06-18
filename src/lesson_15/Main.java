package lesson_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // createCar();

        createRectangle();

        scanner.close();

        // Car car1 = new Car("Mustang", "x69-ghf", "1998");
        // car1.printData(1);
    }

    private static void createRectangle() {
        /*
         * Actividad: Trabajando con una figura geométrica
         * Crea una clase llamada Rectangulo
         * 
         * Define 2 atributos para la clase: ancho y alto. Pueden ser números decimales
         * o enteros.
         * 
         * Define un atributo de tipo entero, 'contadorRectangulos', que sea estático y
         * que lleve un registro del número total de instancias de 'Rectangulo' creadas.
         * 
         * Diseña un constructor con argumentos que inicialice los valores del 'ancho' y
         * 'alto', y que incremente en uno el valor de 'contadorRectangulos'.
         * 
         * Implementa un método llamado 'area()' y otro método llamado 'perimetro()',
         * responsables de calcular el área y el perímetro del rectángulo,
         * respectivamente.
         * 
         * Implementa un método llamado imprimirArea para mostrar el resultado por
         * consola;
         * 
         * Implementa un método llamado imprimirPerimetro para mostrar el resultado por
         * consola;
         * 
         * Implementa un método estático que permita obtener el número total de
         * rectángulos creados hasta el momento.
         * 
         * Desarrolla un menú interactivo que permita al usuario crear instancias de
         * 'Rectangulo' y acceder a sus métodos para obtener información relevante.
         */
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        int userOption = -1;

        do {
            System.out.println("**Menu**");
            System.out.println("1. Create a rectangle");
            System.out.println("2. Show all rectangles");
            System.out.println("3. Show the perimeter");
            System.out.println("4. Show the area");
            System.out.println("5. Show the height");
            System.out.println("6. Show the width");
            System.out.println("7. Show the count");
            System.out.println("8. Exit");

            userOption = scanner.nextInt();

            scanner.nextLine();
            switch (userOption) {
                case 1:
                    Rectangle newRectangle = new Rectangle();

                    // ask for width
                    System.out.print("Specify the width: ");
                    newRectangle.setWidth(scanner.nextDouble());

                    // ask for height
                    System.out.print("Specify the height: ");
                    newRectangle.setHeight(scanner.nextDouble());

                    // add it into [rectangles]
                    rectangles.add(newRectangle);

                    System.out.println("New rectangle has been added\n");
                    break;
                case 2:
                    if (rectangles.isEmpty()) {
                        System.out.println("Nothing to show...");
                    } else {
                        for (int i = 0; i < rectangles.size(); i++) {
                            rectangles.get(i).toString(i);
                        }
                    }
                    break;
                case 3:// show perimeter
                    if (rectangles.isEmpty()) {
                        System.out.println("Must create at least one rectangle...");
                        break;
                    }
                    System.out.print("Specify index between 0 and " + (rectangles.size() - 1) + ": ");
                    System.out.println(rectangles.get(scanner.nextInt()).printPerimeter());
                    break;
                case 4:// area
                    if (rectangles.isEmpty()) {
                        System.out.println("Must create at least one rectangle...");
                        break;
                    }

                    //If not empty, show the area
                    System.out.print("Specify index between 0 and " + (rectangles.size() - 1) + ": ");
                    System.out.println(rectangles.get(scanner.nextInt()).printArea());
                    break;
                case 5:
                    if (rectangles.isEmpty()) {
                        System.out.println("Must create at least one rectangle...");
                        break;
                    }

                    //If not empty, show the height
                    System.out.print("Specify index between 0 and " + (rectangles.size() - 1) + ": ");
                    System.out.println(rectangles.get(scanner.nextInt()).getHeight());
                    break;
                case 6:
                    if (rectangles.isEmpty()) {
                        System.out.println("Must create at least one rectangle...");
                        break;
                    }

                    //If not empty, show the width
                    System.out.print("Specify index between 0 and " + (rectangles.size() - 1) + ": ");
                    System.out.println(rectangles.get(scanner.nextInt()).getWidht());
                    break;
                case 7:
                    //call the static method [getCount]
                    System.out.println("So far there is/are: " + Rectangle.getCount());
                    break;
                default:
                    break;
            }
        } while (userOption != 8);
    }

    private static void createCar() {
        /*
         * ✏️ Actividad: Usando los constructores
         * El propósito de esta actividad es implementar el uso de constructores.
         * 
         * Crea una clase llamada Auto
         * 
         * Define 3 atributos para la clase: marca, modelo y año.
         * 
         * Crea los siguientes constructores:
         * 
         * Constructor que inicialice marca, modelo y año
         * 
         * Constructor que inicialice marca y modelo
         * 
         * Constructor que inicialice solamente la marca
         * 
         * Constructor sin parámetros
         * 
         * Escribe el método “imprimirDatos” dentro de la clase “Auto”, que al ser
         * invocado imprima en consola su marca, modelo y año. Teniendo en cuenta que
         * algunos atributos pueden no ser inicializados, el método “print” debe
         * detectar e imprimir sólo aquellos atributos con valor asignado o mostrar un
         * mensaje en el caso de haber sido inicializado con el constructor sin
         * parámetros.
         * 
         * Crea al menos 4 objetos para poder probar todos los constructores de la
         * clase, con diferentes valores y muestra sus atributos en la consola.
         */

        Integer userOpcion = -1;
        Car[] cars = new Car[5];

        do {

            System.out.println("**Menu**");
            System.out.println("1. Create a new car");
            System.out.println("2. Show all cars");
            System.out.println("3. Exit");

            userOpcion = scanner.nextInt();

            scanner.nextLine();
            switch (userOpcion) {
                case 1:// let's create a new car
                    Integer brandAnswer, modelAnswer, yearAnswer;
                    String brand = null, model = null, year = null;
                    brandAnswer = showAttributeMenu("brand");
                    scanner.nextLine();

                    if (brandAnswer == 1) {
                        System.out.print("Please specify the brand: ");
                        brand = scanner.nextLine();
                    }

                    modelAnswer = showAttributeMenu("model");
                    scanner.nextLine();

                    if (modelAnswer == 1) {
                        System.out.print("Please specify the model: ");
                        model = scanner.nextLine();
                    }

                    yearAnswer = showAttributeMenu("year");
                    scanner.nextLine();

                    if (yearAnswer == 1) {
                        System.out.print("Please specify the year: ");
                        year = scanner.nextLine();
                    }

                    // create [Car] object
                    Car newCar = new Car(brand, model, year);

                    // save into memory
                    for (int i = 0; i < cars.length; i++) {
                        if (cars[i] == null) {
                            cars[i] = newCar;
                            break;
                        }
                    }

                    // show confirm message
                    System.out.println("new car has been added :)");

                    break;
                case 2:// show all cars
                    if (cars[0] == null) {
                        System.out.println("Empty list...");
                    } else {
                        for (int i = 0; i < cars.length; i++) {
                            if (cars[i] == null) {
                                break;
                            }
                            cars[i].printData(i + 1);
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exit..");
                    break;
                default:
                    System.out.println("Number doesnt exist. Please retry");
                    break;
            }
        } while (userOpcion != 3);

    }

    private static Integer showAttributeMenu(String attribute) {
        System.out.println("Would you like to set a " + attribute + " ?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        return scanner.nextInt();
    }
}
