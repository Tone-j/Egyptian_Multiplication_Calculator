package EgyptianMultiplicationCalculator;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DataTest {

    @Test
    public void testIfTheIntegerIsPositiveForFirstValue(){

        String input = "4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Data data = new Data();


        assertTrue(data.getFirstNumber() > 0);

    }

    @Test
    public void testIfTheIntegerIsPositiveForSecondValue(){

        String input = "4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Data data = new Data();

        assertTrue(data.getSecondNumber() > 0);

    }

    @Test
    public void testIfTheReturnedValueIsAnIntegerOnTheCalcController(){

        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Data data = new Data();

        assertTrue(data.calcController() >= 0);

    }




}