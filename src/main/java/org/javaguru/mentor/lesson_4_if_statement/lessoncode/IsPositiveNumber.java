package org.javaguru.mentor.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class IsPositiveNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = Integer.parseInt(scanner.nextLine());

        boolean isPositive = number > 0;

        System.out.println("Number is negative = " + isPositive);
    }

}
