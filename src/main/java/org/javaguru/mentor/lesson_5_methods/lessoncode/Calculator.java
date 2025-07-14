package org.javaguru.mentor.lesson_5_methods.lessoncode;

class Calculator {

    boolean isEven(int number) {
        return (number % 2) == 0;
    }

    boolean isOdd(int number) {
        return (number % 2) == 1;
    }

    boolean isOddV2(int number) {
        return (number % 2) != 0;
    }

    double findAverage(int number1, int number2) {
        return (number1 + number2) / (double)2;
    }

    double findAverageV2(int number1, int number2) {
        return (number1 + number2) / 2.0;
    }

    int findMax(int number1, int number2) {
        return (number1 > number2) ? number1 : number2;
    }

    // 4
    // 7
    // 6

    // ( 4 > 7 ) = max   7
    // max > 6 = result  7
    // 7


    int findMax(int number1, int number2, int number3) {
        int max = number1 > number2 ? number1 : number2;
        return max > number3 ? max : number3;
    }

    int findMaxV2(int number1, int number2, int number3) {
        int max = findMax(number1, number2);
        return findMax(max, number3);
    }

}
