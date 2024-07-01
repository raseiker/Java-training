package jUnit_intro;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

public class IsEvenTest {

    //set System in
    private final InputStream inputStream = System.in;

    @AfterEach
    public void tearDown() {
        System.setIn(inputStream);
    }

    @Test
    public void testGetNumber() {
        //arrange
        Integer number;
        ByteArrayInputStream myCaptorIn = new ByteArrayInputStream("10".getBytes());
        System.setIn(myCaptorIn);

        //act
        number = IsEven.getNumber();

        //assert
        assertEquals(10, number);
    }

    @Test
    public void testIsEven(){
        //arrange
        Integer number = 9;

        //act
        Boolean result = IsEven.isEven(number);

        //assert
        assertFalse(result);
    }
}
