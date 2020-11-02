package simpleTests;

import application.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SimpleTestClass {

    Calculator calc = new Calculator();

    @Test
    public void testAddTwoPositiveValuesTest() {
        int actualResult = calc.add(10, 5);
        assertEquals("10 + 5 must be 15", 15, actualResult);
    }

    @Test
    public void testSubtractionTwoPositiveValues() {
        int actualResult = calc.subtraction(10, 5);
        assertEquals("10-5 must be 5", 5, actualResult);
    }
    @Test
    public void testMultiplicationTwoPositiveValues(){
        int actualResult = calc.multiplication(10,5);
        assertEquals("10*5 must be 50", 50,actualResult );
    }
    @Test
    public void testDivisionTwoPositiveValues(){
        int actualResult = calc.division(15,5);
        assertEquals("10/5 must be 3", 3,actualResult);
    }
    @Test
    public  void testSquareRoot(){
    double actualResult = calc.squareRoot(9);
        assertEquals( 4, actualResult,4);
    }
    @Test
    public void testScalb1(){
        double actualResult = calc.scalb1(10);
        assertEquals("10*10 must be 100",100,actualResult, 100);
    }

    // TODO (*)
    //add tests for new methods (multiply, division, subtraction, square root, x^2)


}
