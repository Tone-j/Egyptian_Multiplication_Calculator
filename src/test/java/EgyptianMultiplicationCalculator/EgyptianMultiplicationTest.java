package EgyptianMultiplicationCalculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EgyptianMultiplicationTest {

    EgyptianMultiplication calc = new EgyptianMultiplication();

    @Test
    public void testFirstListOfTheAlgo(){

        assertEquals(Arrays.asList(1,2,4), calc.getList1Algo(5));
    }

    @Test
    public void testSecondListOfTheAlgo(){

        assertEquals(Arrays.asList(3,6,12),calc.getList2Algo(3));
    }

    @Test
    public void testProductOfTwoValues(){

        List<Integer> left = Arrays.asList(1,2,4);
        List<Integer> right = Arrays.asList(3, 6, 12);


        assertEquals(15,calc.product(5, left, right));
    }


}