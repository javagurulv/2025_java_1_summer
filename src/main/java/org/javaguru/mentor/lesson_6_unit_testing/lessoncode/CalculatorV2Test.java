package org.javaguru.mentor.lesson_6_unit_testing.lessoncode;

public class CalculatorV2Test {

    // 3 -> false
    // 2 -> true

    public static void main(String[] args) {
        CalculatorV2Test test = new CalculatorV2Test();
        test.testIsEven1();
        test.testIsEven2();
        test.testIsOdd1();
        test.testIsOdd2();
        test.testSum1();
        test.testSum2();
        test.testSum3();
        test.testSum4();
        test.testSum5();
        test.testCalculateAverage1();
        test.testCalculateAverage2();
    }

    private void decideTestOKorFail(boolean realResult,
                                    boolean expectedResult,
                                    String testName) {
        if (expectedResult == realResult) {
            System.out.println("TEST " + testName + " = OK");
        } else {
            System.out.println("TEST " + testName + " = FAIL");
        }
    }

    private void decideTestOKorFail(int realResult,
                                    int expectedResult,
                                    String testName) {
        if (expectedResult == realResult) {
            System.out.println("TEST " + testName + " = OK");
        } else {
            System.out.println("TEST " + testName + " = FAIL");
        }
    }

    private void decideTestOKorFail(float realResult,
                                    float expectedResult,
                                    String testName) {
        if (Math.abs(realResult - expectedResult) < 0.001) {
            System.out.println("TEST " + testName + " = OK");
        } else {
            System.out.println("TEST " + testName + " = FAIL");
        }
    }


    public void testIsEven1() {
        int number = 3;
        CalculatorV2 calculator = new CalculatorV2();
        boolean result = calculator.isEven(number);
        decideTestOKorFail(result, false, "testIsEven1");
/*        if (result == false) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }*/
    }

    public void testIsEven2() {
        int number = 2;
        CalculatorV2 calculator = new CalculatorV2();
        boolean result = calculator.isEven(number);
        decideTestOKorFail(result, true, "testIsEven2");
        /*if (result == true) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }*/
    }

    public void testIsOdd1() {
        int number = 3;
        CalculatorV2 calculator = new CalculatorV2();
        boolean result = calculator.isOdd(number);
        decideTestOKorFail(result, true, "testIsOdd1");
/*        if (result == true) {
            System.out.println("is ODD 1 = OK");
        } else {
            System.out.println("is ODD 1 = FAIL");
        }*/
    }

    public void testIsOdd2() {
        int number = 2;
        CalculatorV2 calculator = new CalculatorV2();
        boolean result = calculator.isOdd(number);
        decideTestOKorFail(result, false, "testIsOdd2");
        /*if (result == false) {
            System.out.println("is ODD 2 = OK");
        } else {
            System.out.println("is ODD 2 = FAIL");
        }*/
    }

    // num1 = 2; num2 = 3 -> 5
    // num1 = -2; num2 = -3 -> -5
    // num1 = -2; num2 = 2 -> 0
    // num1 = 2; num2 = -2 -> 0
    // num1 = 0; num2 = 0 -> 0

    public void testSum1() {
        int num1 = 2;
        int num2 = 3;
        CalculatorV2 calculator = new CalculatorV2();
        int result = calculator.sum(num1, num2);
        decideTestOKorFail(result, 5, "testSum1");

/*
        if (result == 5) {
            System.out.println("SUM 1 = OK");
        } else {
            System.out.println("SUM 1 = FAIL");
        }
*/
    }

    public void testSum2() {
        int num1 = -2;
        int num2 = -3;
        CalculatorV2 calculator = new CalculatorV2();
        int result = calculator.sum(num1, num2);
        decideTestOKorFail(result, -5, "testSum2");
/*
        if (result == -5) {
            System.out.println("SUM 2 = OK");
        } else {
            System.out.println("SUM 2 = FAIL");
        }
*/
    }

    public void testSum3() {
        int num1 = -2;
        int num2 = 3;
        CalculatorV2 calculator = new CalculatorV2();
        int result = calculator.sum(num1, num2);
        decideTestOKorFail(result, 1, "testSum3");
/*
        if (result == 1) {
            System.out.println("SUM 3 = OK");
        } else {
            System.out.println("SUM 3 = FAIL");
        }
*/
    }

    public void testSum4() {
        int num1 = 2;
        int num2 = -3;
        CalculatorV2 calculator = new CalculatorV2();
        int result = calculator.sum(num1, num2);
        decideTestOKorFail(result, -1, "testSum4");
/*
        if (result == -1) {
            System.out.println("SUM 4 = OK");
        } else {
            System.out.println("SUM 4 = FAIL");
        }
*/
    }

    public void testSum5() {
        int num1 = 0;
        int num2 = 0;
        CalculatorV2 calculator = new CalculatorV2();
        int result = calculator.sum(num1, num2);
        decideTestOKorFail(result, 0, "testSum5");
/*
        if (result == 0) {
            System.out.println("SUM 5 = OK");
        } else {
            System.out.println("SUM 5 = FAIL");
        }
*/
    }


    public void testCalculateAverage1() {
        int num1 = 1;
        int num2 = 2;
        CalculatorV2 calculator = new CalculatorV2();
        float result = calculator.calculateAverage(num1, num2);
        decideTestOKorFail(result, 1.5f, "testCalculateAverage1");
        /*if (Math.abs(result - 1.5) < 0.001) {
            System.out.println("СalculateAverage 1 = OK");
        } else {
            System.out.println("СalculateAverage 1 = FAIL");
        }*/
    }

    public void testCalculateAverage2() {
        int num1 = 2;
        int num2 = 2;
        CalculatorV2 calculator = new CalculatorV2();
        float result = calculator.calculateAverage(num1, num2);
        if (Math.abs(result - 2) < 0.001) {
            System.out.println("СalculateAverage 2 = OK");
        } else {
            System.out.println("СalculateAverage 2 = FAIL");
        }
    }

}
