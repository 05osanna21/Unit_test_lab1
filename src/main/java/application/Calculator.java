package application;

public class Calculator {

    //***************Simple methods************************

    public int add(int a, int b) {
        return a + b;
    }

    //TODO add method for subtraction
    public int subtraction(int a, int b) {
        return a - b;
    }

    //TODO add method for multiplication
    public int multiplication(int a, int b) {
        return a * b;
    }

    //TODO add method for division
    public int division(int a, int b) {
        return a / b;
    }

    //TODO add method for square root (use Math class)
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    //TODO add method for x^2
    public double scalb1(double a) {
        return Math.scalb(a, 2);
    }


    //***************Medium methods************************

    //TODO (*) |average value| add method which calculate average value of 3 numbers
    public int average(int a, int b, int c) {
        return (a + b + c) / 3;

    }

    //TODO (*) |even or odd| add method which get 1 number as parameter and return true if it even, and false - if odd
    public boolean evenOdd(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    //TODO (*) |biggest value| add method which get 2 number as parameters and return bigger of them, or 0 if they equals
    public int biggerNumber(int a, int b) {
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        } else {
            return 0;
        }
    }
    //***************Hard methods************************

    //TODO (**) |addition with multiple parameters| add method which return sum of any quantity of parameter
    public int multipleParameters(int... parameters) {
        int sum = 0;

        for (int i = 0; i < parameters.length; i++) {
            sum = sum + parameters[i];
        }
        return sum;
    }


    //TODO (*) |divide by zero case| add method for division (check division by zero case - if we try to divide by zero - return -100;
    public int caseZero(int a, int b) {
        int c;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            return -100;
        }
        return c;
    }
}









