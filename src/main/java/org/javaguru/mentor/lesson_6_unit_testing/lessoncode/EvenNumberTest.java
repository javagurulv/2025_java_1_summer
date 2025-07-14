package org.javaguru.mentor.lesson_6_unit_testing.lessoncode;

public class EvenNumberTest {

    public static void main(String[] args) {
        EvenNumberTest test = new EvenNumberTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test3() {
        int number = 0;
        boolean expectedResult = true;

        EvenNumber evenNumber = new EvenNumber();
        boolean realResult = evenNumber.isEven(number);

        if (expectedResult == realResult) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

    // number = 3
    // expected = false
    public void test2() {
        int number = 3;
        boolean expectedResult = false;

        EvenNumber evenNumber = new EvenNumber();
        boolean realResult = evenNumber.isEven(number);

        if (expectedResult == realResult) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test1() {
        int number = 40;
        boolean expectedResult = true;

        EvenNumber evenNumber = new EvenNumber();
        boolean realResult = evenNumber.isEven(number);

        if (expectedResult == realResult) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

}
