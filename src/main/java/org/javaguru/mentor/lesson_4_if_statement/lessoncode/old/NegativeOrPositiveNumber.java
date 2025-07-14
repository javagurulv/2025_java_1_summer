package org.javaguru.mentor.lesson_4_if_statement.lessoncode.old;

import java.util.Scanner;

class NegativeOrPositiveNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        boolean isPositive = number > 0;

        System.out.println("Number is negative = " + isNegative);
        System.out.println("Number is zero = " + isZero);
        System.out.println("Number is positive = " + isPositive);
    }

}
