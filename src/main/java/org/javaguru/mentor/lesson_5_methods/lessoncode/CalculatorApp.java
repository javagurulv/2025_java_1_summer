package org.javaguru.mentor.lesson_5_methods.lessoncode;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        boolean isEvenResult1 = calculator.isEven(number1);
        boolean isEvenResult2 = calculator.isEven(number2);
        boolean isOddResult1 = calculator.isOdd(number1);
        boolean isOddResult2 = calculator.isOdd(number2);

        double averagev1 = calculator.findAverage(number1, number2);
        double averagev2 = calculator.findAverageV2(number1, number2);

        int maxNumber = calculator.findMax(number1, number2);
        int maxNumberOf3 = calculator.findMax(number1, number2, number3);

        System.out.println("isEven result1 = " + isEvenResult1);
        System.out.println("isEven result2 = " + isEvenResult2);
        System.out.println("isOdd result1 = " + isOddResult1);
        System.out.println("isOdd result2 = " + isOddResult2);

        System.out.println("Average = " + averagev1);
        System.out.println("Average = " + averagev2);

        System.out.println("Find max of two = " + maxNumber);
        System.out.println("Find max of three = " + maxNumberOf3);

    }

}
