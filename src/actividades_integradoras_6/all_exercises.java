package actividades_integradoras_6;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import lesson_7.string_exercices;

public class all_exercises {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        registro_alumnos();

        scanner.close();
    }

    private static void registro_alumnos() {
        /*
         * Actividad: Registro de alumnos
         * Escribe un programa en Java que permita al usuario llevar un registro de
         * alumnos.
         * 
         * El programa debe cumplir con los siguientes requisitos:
         * 
         * Muestra un menú de opciones al usuario donde podrá:
         * 
         * Registrar alumno: Permitir al usuario registrar un nuevo alumno ingresando su
         * nombre y nota.
         * 
         * 💡Para lograr esto, te recomendamos utilizar un array de tipo String para
         * almacenar los nombres de los alumnos y un array de tipo Double para guardar
         * las notas correspondientes. De esta manera, podrás asociar los nombres con
         * las notas utilizando los índices de los arrays.
         * 
         * Mostrar todos los alumnos: Mostrar en pantalla el nombre y la nota de todos
         * los alumnos registrados hasta el momento.
         * 
         * Mostrar promedio de notas: Calcular y mostrar en pantalla el promedio de las
         * notas de todos los alumnos registrados hasta el momento.
         * 
         * Buscar alumno por nombre: Solicitar al usuario ingresar el nombre de un
         * alumno y mostrar en pantalla su nota si el alumno existe.
         * 
         * Modificar nota por nombre: Solicitar al usuario ingresar el nombre de un
         * alumno y permitir modificar su nota si el alumno existe.
         * 
         * Eliminar alumno por nombre: Solicitar al usuario ingresar el nombre de un
         * alumno y eliminar al alumno si existe.
         * 
         * Salir: Terminar el programa.
         * 
         * El programa debe validar que el nombre no esté vacío y que la nota sea un
         * número válido entre 0.00 y 10.00.
         * 
         * El programa debe utilizar las estructuras de control adecuadas (if, switch,
         * for, while, do-while) según corresponda para implementar las diferentes
         * opciones del menú.
         * 
         * El programa debe manejar excepciones utilizando bloques try-catch para
         * manejar posibles excepciones al leer datos de entrada del usuario.
         * 
         * Después de realizar una operación, mostrar el menú de opciones nuevamente
         * para que el usuario pueda elegir otra acción hasta que elija la opción
         * "Salir".
         * 
         * 💡 Si has completado las actividades propuestas y dispones de tiempo
         * adicional, considera renderizar tu código. Mejorar la legibilidad y claridad
         * del código facilita su comprensión y colaboración.
         */
        int menu = 0;
        String[] students = new String[50];
        Double[] studentGrades = new Double[50];

        students[0] = "karla";
        students[1] = "fabiola";
        students[2] = "ceceu";

        studentGrades[0] = 10.0;
        studentGrades[1] = 6.4;
        studentGrades[2] = 6.0;

        try {
            do {
                System.out.println("\n\n*********Menu*********");
                System.out.println("1. Registrar alumno");
                System.out.println("2. Mostrar todos los alumnos");
                System.out.println("3. Mostrar promedio de notas");
                System.out.println("4. Buscar alumno por nombre");
                System.out.println("5. Modificar nota por nombre");
                System.out.println("6. Eliminar alumno por nombre");
                System.out.println("7. Salir");

                menu = scanner.nextInt();

                scanner.nextLine();
                switch (menu) {
                    case 1:
                        String newStudent = "";
                        Double newStudentGrade = -1.0;
                        do {
                            System.out.print("Ingresa el nombre del alumno que deseas agregar: ");
                            newStudent = scanner.nextLine().trim().toLowerCase();

                            if (newStudent.isEmpty()) {
                                System.out.println("El nombre del alumno no puede ser vació. Intentalo...");
                            }
                        } while (newStudent.isEmpty());

                        do {
                            System.out.print("Ingresa la nota del alumno [" + newStudent + "]: ");
                            newStudentGrade = scanner.nextDouble();

                            if (newStudentGrade < 0.0 || newStudentGrade > 10.0) {
                                System.out.println("La nota del alumno debe estar entre 0.0 y 10.0. Intentalo...");
                            }
                        } while (newStudentGrade < 0.0 || newStudentGrade > 10.0);

                        for (int i = 0; i < students.length; i++) {
                            if (students[i] == null) {
                                students[i] = newStudent;
                                studentGrades[i] = newStudentGrade;
                                break;
                            }
                        }

                        System.out.println(
                                "Alumno " + "[" + newStudent + ", " + newStudentGrade + "] agregado con éxito");
                        break;
                    case 2:
                    int count = 1;
                        String response = "";// [Ana -> 25]

                        for (int i = 0; i < students.length; i++) {
                            if (students[i] == null)
                                continue;

                            response += (count) + ". [" + students[i] + " -> " + studentGrades[i] + "]\n";
                            count++;
                        }

                        System.out.println("Alumnos registrados hasta el momento: ");
                        System.out.println(response);
                        break;
                    case 3:
                        Double sum = 0.0, avg = 0.0;
                        int total = 0;

                        for (Double grades : studentGrades) {
                            if (grades == null)
                                break;
                            sum += grades;
                            total++;
                        }

                        avg = Math.round((sum / total) * 100.0) / 100.0;// use DecimalFormat instead

                        System.out.println("El promedio de notas es: " + avg);
                        break;
                    case 4:
                        response = "";
                        String studentSearched = "";
                        Boolean isNotExist = true;

                        System.out.print("Ingresar el alumno a buscar: ");
                        studentSearched = scanner.nextLine().toLowerCase();

                        for (int i = 0; i < students.length; i++) {
                            if (students[i] == null)
                                continue;
                            if (students[i].equals(studentSearched)) {
                                response = "El alumno(a) [" + students[i] + "] tiene una nota de: " + studentGrades[i];
                                isNotExist = false;
                                break;
                            }
                        }

                        if (isNotExist) {
                            System.out.println(
                                    "El alumno(a) [" + studentSearched + "] no se encuentra en la base de datos..");
                        } else {
                            System.out.println(response);
                        }
                        break;
                    case 5:
                        studentSearched = "";
                        isNotExist = true;
                        int studentIndex = -1;
                        Double newGrade = -1.0;

                        System.out.print("Ingresa nombre del alumno: ");
                        studentSearched = scanner.nextLine().toLowerCase();

                        for (int i = 0; i < students.length; i++) {
                            if (students[i] == null)
                                continue;
                            if (students[i].equals(studentSearched)) {
                                isNotExist = false;
                                studentIndex = i;
                                break;
                            }
                        }

                        if (isNotExist) {
                            System.out.println(
                                    "El alumno(a) [" + studentSearched + "] no se encuentra en la base de datos..");
                        } else {
                            System.out.print("Ingresa la nota para el alumno [" + studentSearched + "]: ");
                            newGrade = scanner.nextDouble();

                            studentGrades[studentIndex] = newGrade;

                            System.out.println(
                                    "Alumno " + "[" + studentSearched + ", " + newGrade + "] actualizado con éxito");
                        }

                        break;
                    case 6:
                        studentSearched = "";
                        isNotExist = true;
                        studentIndex = -1;

                        System.out.print("Ingresa nombre del alumno: ");
                        studentSearched = scanner.nextLine().toLowerCase();

                        for (int i = 0; i < students.length; i++) {
                            if (students[i] == null)
                                continue;
                            if (students[i].equals(studentSearched)) {
                                isNotExist = false;
                                studentIndex = i;
                                break;
                            }
                        }

                        if (isNotExist) {
                            System.out.println(
                                    "El alumno(a) [" + studentSearched + "] no se encuentra en la base de datos..");
                        } else {
                            students[studentIndex] = null;
                            studentGrades[studentIndex] = null;

                            System.out.println(
                                    "Alumno " + "[" + studentSearched + "] eliminado con éxito");
                        }
                        break;
                    case 7:
                        System.out.println("Saliendo del menu...");
                        System.out.println("chauu");
                        break;
                    default:
                        System.out.println("Escoge una opción del 1 al 7..");
                        break;
                }
            } while (menu < 7 && menu > 0);
        } catch (InputMismatchException e) {
            System.out.println("Solo debes escribir numeros...");
        }

    }
}
