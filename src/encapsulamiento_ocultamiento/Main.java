package encapsulamiento_ocultamiento;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Actividad: Plano X - Y
         * Considerando lo aprendido en la actividad realizada anteriormente, crea un
         * nuevo proyecto para cumplir con los siguientes objetivos:
         * 
         * Crea una clase llamada 'Punto' que representa un punto en un plano
         * bidimensional.
         * 
         * Define 2 atributos para la clase del tipo private: x e y que representan las
         * coordenadas del punto.
         * 
         * Crea los métodos getter y setter de todos los atributos de la clase.
         * 
         * Crea un método de instancia llamado 'distanciaDesdeOrigen', que calcula y
         * devuelve la distancia del punto desde el origen (0,0).
         * 
         * Crea un método para cálculos entre puntos, estático, llamado
         * 'calcularDistancia' en la clase 'Punto'. Este método recibe dos objetos de la
         * misma clase y calcula la distancia entre ellos.
         * 
         * Crea un método estático para cálculos entre puntos, llamado 'estanAlineados'
         * en la clase 'Punto'. Este método recibe tres objetos de la clase 'Punto' y
         * determina si los puntos dados están alineados en la misma recta
         * 
         * En la clase ejecutable, declara una variable global como un arreglo de
         * objetos 'Punto' para almacenar las instancias creadas."
         */
        createPoint();

        scanner.close();
    }

    /*
     * main method
     */
    private static void createPoint() {
        ArrayList<Point> points = new ArrayList<>();
        Integer userOption = -1;

        do {
            System.out.println("\n**Menu**");
            System.out.println("1. Create point");
            System.out.println("2. Calculate distance from Origin(0,0)");
            System.out.println("3. Calculate distance from origin to another Point");
            System.out.println("4. Determine if 3 Points are aligned");
            System.out.println("5. Exit");

            userOption = scanner.nextInt();

            switch (userOption) {
                case 1:
                    Point myPoint = new Point();
                    System.out.print("Specify X: ");
                    myPoint.setX(scanner.nextDouble());

                    System.out.print("Specify Y: ");
                    myPoint.setY(scanner.nextDouble());

                    // save into [points]
                    points.add(myPoint);

                    // show message
                    System.out.println("New point has been added");
                    break;
                case 2:// distance from origin
                    if (points.isEmpty()) {
                        System.out.println("You must create at least one Point...");
                    } else {
                        for (int i = 0; i < points.size(); i++) {
                            System.out.println(points.get(i).toString(i));
                        }

                        System.out.print("Select one index from above: ");
                        Point selectedPoint = points.get(scanner.nextInt());
                        Double result = selectedPoint.distanceFromOrigin();

                        System.out.println(
                                "Distance from " + "(" + selectedPoint.getX() + "," + selectedPoint.getY() + ") "
                                        + "to (0,0): " + result);
                    }
                    break;
                case 3:
                    if (points.size() < 2) {
                        System.out.println("You must create at least two Points..");
                        System.out.println((2 - points.size()) + " missing");
                    } else {
                        for (int i = 0; i < points.size(); i++) {
                            System.out.println(points.get(i).toString(i));
                        }

                        System.out.print("Select the index of the origin Point from above: ");
                        Point origin = points.get(scanner.nextInt());

                        System.out.print("Select the index of the other Point from above: ");
                        Point otherPoint = points.get(scanner.nextInt());

                        Double result = Point.calculateDistance(origin, otherPoint);
                        System.out.println("Origin:");
                        System.out.println(origin.toString(0));

                        System.out.println("Other point:");
                        System.out.println(otherPoint.toString(0));

                        System.out.println("Distance between them: " + result);
                    }
                    break;
                case 4:
                    if (points.size() < 3) {
                        System.out.println("You must create at least 3 Points..");
                        System.out.println((3 - points.size()) + " missing");
                    } else {
                        for (int i = 0; i < points.size(); i++) {
                            System.out.println(points.get(i).toString(i));
                        }

                        System.out.print("Select the index of the Point A: ");
                        Point A = points.get(scanner.nextInt());

                        System.out.print("Select the index of the Point B: ");
                        Point B = points.get(scanner.nextInt());

                        System.out.print("Select the index of the Point C: ");
                        Point C = points.get(scanner.nextInt());

                        Boolean result = Point.areAligned(A, B, C);
                        if (result) {
                            System.out.println("Point A, B and C are aligned");
                        } else {
                            System.out.println("Point A, B and C are not aligned");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Shutdown...");
                    break;
                default:
                    break;
            }
        } while (userOption != 5);
    }
}
