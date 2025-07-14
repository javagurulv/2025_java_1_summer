package org.javaguru.mentor.lesson_5_methods.lessoncode;

class CalculatorV2 {

    boolean isEven(int number) {
        int ostatok = number % 2;
        boolean result = ostatok == 0;
        return result;

        //return (number % 2) == 0;
    }

    boolean isOdd(int number) {
/*
        int ostatok = number % 2;
        boolean result = ostatok != 0;
        return result;
*/
        return (number % 2) != 0;
    }

    int sum(int number1, int number2) {
       int result = number1 + number2;
       return result;

       // return number1 + number2;
    }

    // a()
    // findAverage
    // calculateAverage
    // average

    float calculateAverage(int number1, int number2) {
        //int sum = number1 + number2;
        //return sum / 2f;
        //return (float) sum / 2;

        //return (number1 + number2) / 2f;
        return (float)(number1 + number2) / 2;
        //return ((float)number1 + number2) / 2;
    }

    int calculateMaxNumber(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    int findMaxNumber(int number1, int number2, int number3) {
        if ((number1 > number2) && (number1 > number3)) {
            return number1;
        } else if (number2 > number3) {
            return number2;
        } else {
            return number3;
        }
    }


    int findMaxNumberV2(int number1,    // 1
                        int number2,    // 6
                        int number3) {  // 8
        int maxNumber = calculateMaxNumber(number1, number2);  // 6
        maxNumber = calculateMaxNumber(maxNumber, number3);  // (6, 8) -> 8
        return maxNumber;  // 8
    }

}
