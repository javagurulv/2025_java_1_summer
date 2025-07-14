package org.javaguru.mentor.lesson_6_unit_testing.lessoncode.tasks;

class MaxNumber {

    // number1 = 10; number2 = 20; result = 20
    // number1 = 20; number2 = 10; result = 20
    // number1 = 10; number2 = 10; result = 10

    public int findMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

}
