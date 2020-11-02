package hardTests;

import application.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HardTestClass {

    Calculator calc = new Calculator();

    //TODO (**)
    //add tests for new method - divide by zero case
    @Test
    public void testCaseZero(){
        int actualResult=calc.caseZero(10,0);
        assertEquals("ArithmeticException", -100, actualResult);
    }
    //TODO (**)

    //add tests for new method - addition with multiple parameters


    @Test
    public void testMultipleParameters() {
        int actualResult = calc.multipleParameters(10, 5, 7, 8, 10);
        assertEquals("sum is 40", 40, actualResult);
    }
}
