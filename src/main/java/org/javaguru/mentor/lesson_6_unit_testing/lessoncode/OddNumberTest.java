package org.javaguru.mentor.lesson_6_unit_testing.lessoncode;

public class OddNumberTest {

    public static void main(String[] args) {
        OddNumberTest test = new OddNumberTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1() {
        int number = 5;
        boolean expectedResult = true;

        OddNumber oddNumber = new OddNumber();
        boolean realResult = oddNumber.isOdd(number);

        if (expectedResult == realResult) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        int number = 2;
        boolean expectedResult = false;

        OddNumber oddNumber = new OddNumber();
        boolean realResult = oddNumber.isOdd(number);

        if (expectedResult == realResult) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3() {
        int number = 0;
        boolean expectedResult = false;

        OddNumber oddNumber = new OddNumber();
        boolean realResult = oddNumber.isOdd(number);

        if (expectedResult == realResult) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

}
