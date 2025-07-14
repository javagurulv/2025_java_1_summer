package org.javaguru.mentor.lesson_6_unit_testing.lessoncode.tasks;

class MaxNumberTest {

    public static void main(String[] args) {
        MaxNumberTest test = new MaxNumberTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1() {
        int number1 = 10;
        int number2 = 20;
        int expectedResult = 20;

        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(number1, number2);

        if (result == expectedResult) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    public void test11() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(10, 20);

        if (result == 20) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }


    public void test2() {
        int number1 = 20;
        int number2 = 10;
        int expectedResult = 20;

        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(number1, number2);

        if (result == expectedResult) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    public void test3() {
        int number1 = 10;
        int number2 = 10;
        int expectedResult = 10;

        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(number1, number2);

        if (result == expectedResult) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

}
