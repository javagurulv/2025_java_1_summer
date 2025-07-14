package org.javaguru.mentor.lesson_6_unit_testing.lessoncode;

class MaxNumberTest {

    public static void main(String[] args) {
        MaxNumberTest test = new MaxNumberTest();
        test.test1();
        test.test2();
        test.test3();
    }

    // number1 = number2 = 3 = 3
    // number1 = 1; number2 = 3 = 3
    // number1 = 3; number2 = 1 = 3

    public void test1() {
        int number1 = 3;
        int number2 = 3;
        int expectedResult = 3;

        MaxNumber maxNumber = new MaxNumber();
        int realResult = maxNumber.findMax(number1, number2);

        if (expectedResult == realResult) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        int number1 = 1;
        int number2 = 3;
        int expectedResult = 3;

        MaxNumber maxNumber = new MaxNumber();
        int realResult = maxNumber.findMax(number1, number2);

        if (expectedResult == realResult) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3() {
        int number1 = 3;
        int number2 = 1;
        int expectedResult = 3;

        MaxNumber maxNumber = new MaxNumber();
        int realResult = maxNumber.findMax(number1, number2);

        if (expectedResult == realResult) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }


}
