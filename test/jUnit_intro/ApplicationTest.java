package jUnit_intro;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ApplicationTest {

    //reference to System.out object
    private static PrintStream out = System.out;

    //object to catch the current output
    private static ByteArrayOutputStream myStreamCaptor = new ByteArrayOutputStream();

    //reference to System.in object
    private static InputStream in = System.in;

    @BeforeEach
    public void setUp() {
        //set System out as my streamCaptor.
        //Catch the current output
        System.setOut(new PrintStream(myStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        //clean captor
        //initialize System out
        System.setOut(out);

        //initialize System int
        System.setIn(in);
    }

    @Test
    public void testMain(){
        //call main method
        Application.main(new String[1]);

        //save output as string
        String output = myStreamCaptor.toString();

        //create string array that contains all outputs
        String[] outputs = output.split("\r\n");

        //assert printGreeting output
        assertEquals("Hello world", outputs[0]);

        //assert printNameAndAge output
        assertEquals("My name is neymar and I have 30 years.", outputs[1]);
    }

    @Test
    public void testPrintNameAndAge() {
        //arrange
        String name = "Messi";
        Integer age = 34;

        //act
        Application.printNameAndAge(name, age);

        //assert
        String output = myStreamCaptor.toString();
        assertEquals("My name is Messi and I have 34 years.\r\n", output);     
    }

    @Test
    public void testPrintGreeting() {
        //arrange
        
        //act
        Application.printGreeting();

        //assert
        String output = myStreamCaptor.toString();
        assertEquals("Hello world\r\n", output);
    }

    @Test
    void testPrintName(){
        //arrange
        ByteArrayInputStream myStreamInCaptor = new ByteArrayInputStream("iker".getBytes());
        System.setIn(myStreamInCaptor);

        //act
        Application.printName(new Scanner(System.in));

        //assert
        String output = myStreamCaptor.toString();
        assertEquals("My name is iker\r\n", output);
    }
}
