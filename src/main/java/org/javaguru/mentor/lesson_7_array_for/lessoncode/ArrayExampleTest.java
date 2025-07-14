package org.javaguru.mentor.lesson_7_array_for.lessoncode;

class ArrayExampleTest {

    public static void main(String[] args) {
        ArrayExampleTest test = new ArrayExampleTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1() {
        int[] marks = {4, 5, 2};

        ArrayExample arrayExample = new ArrayExample();
        int minMark = arrayExample.findMinMark(marks);

        if (minMark == 2) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        int[] marks = {2, 2, 2};

        ArrayExample arrayExample = new ArrayExample();
        int minMark = arrayExample.findMinMark(marks);

        if (minMark == 2) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3() {
        int[] marks = {4};

        ArrayExample arrayExample = new ArrayExample();
        int minMark = arrayExample.findMinMark(marks);

        if (minMark == 4) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

    public void test4() {
        int[] marks = {};

        ArrayExample arrayExample = new ArrayExample();
        int minMark = arrayExample.findMinMark(marks);

        if (minMark == -1) {
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }

}
