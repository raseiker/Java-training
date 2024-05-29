package actividades_integradoras_5;

import java.util.Arrays;
import java.util.Scanner;

public class all_exercises {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        manipulando_oraciones();
        scanner.close();
    }

    private static void manipulando_oraciones() {
        /*
         * Actividad: Manipulando oraciones
         * Escribe un programa en Java que permita al usuario realizar diversas
         * operaciones con una oración. El programa debe cumplir con los siguientes
         * requisitos:
         * 
         * Muestra un menú de opciones al usuario donde podrá:
         * 
         * Crear oración o Borrar oración: Si la oración está vacía, mostrar el mensaje
         * "Crear oración". Si la oración tiene contenido, mostrar el mensaje
         * "Borrar oración".
         * 
         * Cantidad de caracteres de la oración: Calcular y mostrar la cantidad total de
         * caracteres en la oración (incluyendo espacios).
         * 
         * Cantidad de palabras de la oración: Calcular y mostrar la cantidad de
         * palabras en la oración.
         * 
         * Mostrar palabras ordenadas alfabéticamente: Mostrar las palabras de la
         * oración ordenadas alfabéticamente.
         * 
         * Ingresar un número y devolver la palabra correspondiente: Solicitar al
         * usuario ingresar un número y mostrar la palabra correspondiente a esa
         * posición en la oración. Si se ingresa un número fuera del rango de número de
         * palabras
         * (la primera palabra corresponde al número 1), mostrar el mensaje "Número
         * inválido. Intente nuevamente".
         * 
         * Buscar palabra dentro de la oración: Solicitar al usuario ingresar una
         * palabra y verificar si esa palabra se encuentra en la oración. Mostrar un
         * mensaje
         * indicando si la palabra fue encontrada y la posición en la que se encuentra.
         * 
         * Modificar palabra dentro de la oración: Solicitar al usuario ingresar la
         * palabra que se quiere cambiar, mostrar un mensaje de error si no se encuentra
         * y volver a solicitar la palabra. Si la palabra es correcta, solicitar una
         * nueva palabra (o frase) y reemplazar la anterior. Mostrar la nueva oración
         * modificada (recordar validar que solo contenga letras y espacios).
         * 
         * Agregar contenido a la oración: Solicitar al usuario ingresar contenido y
         * agregar ese contenido al final de la oración.
         * 
         * Salir: Terminar el programa.
         * 
         * Después de realizar una operación, mostrar el menú de opciones nuevamente
         * para que el usuario pueda elegir otra acción, excepto cuando elija "Salir".
         * 
         * Realiza las validaciones que consideres necesarias.
         */

        String sentence = "";
        int menu = 0;

        //repeat until the user press 9
        while (menu < 9) {
            System.out.println("\n\n*****************Menu de opciones*****************");
            System.out.println(sentence.isEmpty() ? "1. Crear oración" : "1. Borrar oración");
            System.out.println("2. Calcular y mostrar la cantidad total de caracteres en la oración");
            System.out.println("3. Calcular y mostrar la cantidad de palabras en la oración");
            System.out.println("4. Mostrar las palabras de la oración ordenadas alfabéticamente");
            System.out.println("5. Ingresar un número y mostrar la palabra correspondiente a esa posición");
            System.out.println("6. Buscar palabra dentro de la oración");
            System.out.println("7. Modificar palabra dentro de la oración");
            System.out.println("8. Agregar contenido a la oración");
            System.out.println("9. Salir");
            menu = scanner.nextInt();

            //reset scanner nextline
            scanner.nextLine();

            //choose only one option based on [menu] value
            switch (menu) {
                case 1:
                    if (sentence.isEmpty()) {
                        // sentence is empty. Create a new sentence
                        System.out.print("Ingresa la oración: ");
                        sentence = scanner.nextLine();

                        System.out.println("Oración creada [" + sentence + "]");
                    } else {
                        // sentence is not empty. Clean it
                        sentence = "";
                        System.out.println("Oración borrada.");
                    }
                    break;
                case 2:
                    //get the lenght of [sentence] and print it
                    int lenght = sentence.length();
                    System.out.println("La oración [" + sentence + "] tiene un total de " + lenght + " caracteres.");
                    break;
                case 3:
                    int count = 0;

                    //loop through [sentence]. For each time, check if each char is a letter
                    //If yes, increment [count] by one
                    for (int i = 0; i < sentence.length(); i++) {
                        if (Character.isLetter(sentence.charAt(i))) {
                            count += 1;
                        }
                    }
                    System.out.println("La oración [" + sentence + "] tiene un total de " + count + " palabras.");
                    break;
                case 4:
                    //create an array of chars with lenght equal to the lenght of [sentence]
                    char[] sentenceArr = new char[sentence.length()];

                    //loop through [sentence]. Check if each char is a letter.
                    //If yes, add it to [sentenceArr]
                    for (int i = 0; i < sentence.length(); i++) {
                        if (Character.isLetter(sentence.charAt(i))) {
                            sentenceArr[i] = sentence.charAt(i);
                        }
                    }

                    //sort [sentenceArr] ascending
                    Arrays.sort(sentenceArr);

                    System.out.println("Las palabras de la oración [" + sentence + "] ordenada alfabéticamente es:");
                    System.out.println(Arrays.toString(sentenceArr));
                    break;
                case 5:
                    int userNumber;
                    char response;
                    System.out.print("Ingresa un número: ");
                    userNumber = scanner.nextInt();

                    //Check if [userNumber] is equal to 0 OR [userNUmber] is greater than [sentence] lenght 
                    if (userNumber == 0 || userNumber > sentence.length()) {
                        //[userNumber] is out of range. Show an appropriate message
                        System.out.println("Número inválido. Rango permitido entre 1 y " + sentence.length());
                    } else {
                        //Because the index of [sentence] starts at 0, substract [userNumber] by one
                        //[userNumber] is always greater than 0
                        response = sentence.charAt(userNumber - 1);

                        System.out.println("La palabra de la oración [" + sentence + "] en la posición [" + userNumber
                                + "] es: " + response);
                    }
                    break;
                case 6:
                    char userChar;
                    int wordIndex;

                    //catch only the first character and save it in [userChar]
                    System.out.print("Ingresa una letra: ");
                    userChar = scanner.next().charAt(0);

                    //search for the index of [userChar] and save it in [wordIndex]
                    //If [userChar] is not in [sentence] then [wordIndex] is set to -1
                    wordIndex = sentence.indexOf(userChar);

                    if (wordIndex == -1) {
                        //[userChar] isn't in [sentence]. Show a message
                        System.out
                                .println("La palabra  [" + userChar + "] no se encuentra en la oración [" + sentence
                                        + "]");
                    } else {
                        //[userChar] is in [sentence]. Show its position
                        System.out.println("La palabra  [" + userChar + "] en la oración [" + sentence
                                + "] se encuentra en la posición: " + wordIndex);
                    }
                    break;
                case 7:
                    String replaceableWord = "", userWordReplacement;
                    Boolean isNotSpaceOrLetter = true;
                    wordIndex = -1;

                    //repeat until [wordIndex] is any number that does not match with -1
                    while (wordIndex == -1) {
                        System.out.print("Ingresa la palabra que deseas cambiar de [" + sentence + "]: ");
                        replaceableWord = scanner.nextLine();

                        //[wordIndex] will change its value on this line
                        wordIndex = sentence.indexOf(replaceableWord);

                        if (wordIndex == -1)
                            System.out.println("La palabra [" + replaceableWord
                                    + "] no se encuentra en la oración. Vuelve a intentar..");
                    }

                    //repeat until [isNotSparceOrLetter] is false
                    do {
                        System.out.print("Ingresa una nueva palabra (o frase): ");
                        userWordReplacement = scanner.nextLine();

                        //loop through [userWordReplacement]. For each char, check it is not a letter nor white space
                        for (int i = 0; i < userWordReplacement.length(); i++) {// ty1hdd
                            if (!Character.isLetter(userWordReplacement.charAt(i))
                                    && !Character.isWhitespace(userWordReplacement.charAt(i))) {
                                //[i] value is not a letter nor a white space. Update [isNotSpaceOrLetter] to true
                                //break out of the FOR LOOP
                                isNotSpaceOrLetter = true;
                                break;
                            } else {
                                isNotSpaceOrLetter = false;
                            }
                        }

                        //if [isNotSpaceOrLetter] is true, show an error message
                        if (isNotSpaceOrLetter)
                            System.out.println("La palabra [" + userWordReplacement
                                    + "] solo debe contener letras y espacios en blanco. Vuelve a intentar..");
                    } while (isNotSpaceOrLetter);

                    // replace [userWordToReplace] to [replaceableWord]
                    sentence = sentence.replace(replaceableWord, userWordReplacement);

                    System.out.println("La nueva oración queda como [" + sentence + "]");
                    break;
                case 8:
                    String newContent;

                    //ask for the user to new content
                    System.out.print("Ingresa nuevo contenido para la oración [" + sentence + "]: ");
                    newContent = scanner.nextLine();

                    //append [newContent] to the end of [sentence]
                    sentence += newContent;

                    System.out.println("La nueva oración queda como [" + sentence + "]");
                    break;
                default:
                    //[menu] is 9. Exit the system
                    System.out.println("you've done");
                    break;
            }
        }
    }
}
