package org.javaguru.mentor.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class IfElseVariantsNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number:");
        int number2 = Integer.parseInt(scanner.nextLine());

        // variant 1

        if (number1 > number2) {
            System.out.println("Bigger number = " + number1);
        }
        if (number1 < number2) {
            System.out.println("Bigger number = " + number2);
        }
        if (number1 == number2) {
            System.out.println("Numbers are equals");
        }

        // variant 2
        if (number1 > number2) {
            System.out.println("Bigger number = " + number1);
        } else if (number2 > number1) {
            System.out.println("Bigger number = " + number2);
        } else {
            System.out.println("Numbers are equals");
        }

        // variant 3
        if (number1 > number2) {
            System.out.println("Bigger number = " + number1);
        }

        if (number2 > number1) {
            System.out.println("Bigger number = " + number2);
        } else {
            System.out.println("Numbers are equals");
        }


    }

}
