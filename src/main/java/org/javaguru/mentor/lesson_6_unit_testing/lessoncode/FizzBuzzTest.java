package org.javaguru.mentor.lesson_6_unit_testing.lessoncode;

public class FizzBuzzTest {

    // 3 -> "Fizz"   / 3
    // 10 -> "Buzz"  / 5
    // 30 -> "FizzBuzz"  /15  3 and 5
    // 4 -> "4"

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }


    // testResult
    // compareExpectedAndRealResults
    // decideTestOKorFail

    private void decideTestOKorFail(String realResult,
                                    String expectedResult,
                                    String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println("TEST " + testName + " = OK");
        } else {
            System.out.println("TEST " + testName + " = FAIL");
        }
    }

    public void test1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(3);
        decideTestOKorFail(result, "Fizz", "test1");

        /*if ("Fizz".equals(result)) {
            System.out.println("TEST 1  = OK");
        } else {
            System.out.println("TEST 1  = FAIL");
        }*/
    }

    public void test2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(10);
        decideTestOKorFail(result, "Buzz", "test2");

//        if ("Buzz".equals(result)) {
//            System.out.println("TEST 2  = OK");
//        } else {
//            System.out.println("TEST 2  = FAIL");
//        }
    }

    public void test3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(30);
        decideTestOKorFail(result, "FizzBuzz", "test3");

/*
        if ("FizzBuzz".equals(result)) {
            System.out.println("TEST 3  = OK");
        } else {
            System.out.println("TEST 3  = FAIL");
        }
*/
    }

    public void test4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(4);
        decideTestOKorFail(result, "4", "test4");

/*
        if ("4".equals(result)) {
            System.out.println("TEST 4  = OK");
        } else {
            System.out.println("TEST 4  = FAIL");
        }
*/
    }

}
