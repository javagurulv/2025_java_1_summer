package org.javaguru.mentor.lesson_6_unit_testing.lessoncode.tasks;

class FizzBuzz {

    public static final int NUMBER_5 = 5;
    public static final int NUMBER_3 = 3;

    // number = 3; result = "Fizz"
    // number = 10; result = "Buzz"
    // number = 30; result = "FizzBuzz"
    // number = 4; result = "4"

    public String detect(int number) {
        String result;
        if (number == 0) return "0";
        if (isDivisibleBy15(number)) result = "FizzBuzz";
        else if (isDivisibleBy3(number)) result = "Fizz";
        else if (isDivisibleBy5(number)) result = "Buzz";
        else result = "" + number;
        return result;
    }

    private boolean isDivisibleBy15(int number) {
        return isDivisibleBy3(number) && isDivisibleBy5(number);
    }

    private boolean isDivisibleBy5(int number) {
        return number % NUMBER_5 == 0;
    }

    private boolean isDivisibleBy3(int number) {
        return number % NUMBER_3 == 0;
    }

}
