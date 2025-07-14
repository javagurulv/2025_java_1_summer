package org.javaguru.mentor.lesson_5_methods.lessoncode;

class CalculatorV2App {

    public static void main(String[] args) {
        CalculatorV2 calculator = new CalculatorV2();

        int number = 11;

        boolean result = calculator.isEven(number);
        System.out.println(number + " is even " + result);

        number = 10;
        result = calculator.isEven(number);
        System.out.println(number + " is even " + result);

        number = 3;
        result = calculator.isEven(number);
        System.out.println(number + " is even " + result);

        number = 1;
        result = calculator.isOdd(number);
        System.out.println(number + " is odd " + result);

        number = 3;
        result = calculator.isOdd(number);
        System.out.println(number + " is odd " + result);

        int sumResult = calculator.sum(2, 2323);
        System.out.println("Sum = " + sumResult);

        sumResult = calculator.sum(4564, 3254);
        System.out.println("Sum = " + sumResult);


        float averageResult = calculator.calculateAverage(1, 2);
        System.out.println("Average = " + averageResult);

        int maxResult = calculator.calculateMaxNumber(1, 2);
        System.out.println("Max number = " + maxResult);

        maxResult = calculator.findMaxNumberV2(1, 6, 8);
        System.out.println("Max number = " + maxResult);
    }

}
