package mediumTests;

import application.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MediumTestClass {

    Calculator calc = new Calculator();

    //TODO (**)
    @Test
    public void testAverage() {
        int actualResult = calc.average(1, 2, 3);
        assertEquals("6", 2, actualResult);
    }

    //TODO (**)
    @Test
    public void testEvenOdd() {
        boolean actualResult = calc.evenOdd(5);
        assertEquals("odd",false,actualResult);
    }

    //TODO (**)
    @Test
    public void testBiggerNumber(){
        int actualResult=calc.biggerNumber(11,5);
        assertEquals("a",11,actualResult);
    }
    //add tests for new method - biggest value

}
