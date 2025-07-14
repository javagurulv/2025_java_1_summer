package org.javaguru.mentor.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class IfExampleNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = Integer.parseInt(scanner.nextLine());

        boolean isPositive = number > 0;

        // <, <=, >, >=, ==, !=

        if (number > 0) {
            System.out.println("Number is positive! = " + isPositive);
            System.out.println("Number is positive!");
        }

        if (number < 0) {
            System.out.println("Number is negative!");
            System.out.println("Number is negative!");
        }

        if (number == 0) {
            System.out.println("Number is zero!");
            System.out.println("Number is zero!");
        }

    }

}
