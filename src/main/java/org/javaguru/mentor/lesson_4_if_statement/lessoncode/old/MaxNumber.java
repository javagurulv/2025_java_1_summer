package org.javaguru.mentor.lesson_4_if_statement.lessoncode.old;

import java.util.Scanner;

class MaxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Biggest number is 1!");
        }

        if (number2 > number1) {
            System.out.println("Biggest number is 2!");
        }

        if (number1 == number2) {
            System.out.println("Numbers are equals!");
        }


        if (number1 > number2) {
            System.out.println("Biggest number is 1!");
        } else {
            System.out.println("Biggest number is NOT 1!");
        }

    }

}
