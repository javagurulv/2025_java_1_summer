package org.javaguru.mentor.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class ORDiapazonNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int number1 = Integer.parseInt(scanner.nextLine());

        if ((number1 < 1) || (number1 > 10)) {
            System.out.println("Number outside [1:10]");
        } else {
            System.out.println("Number inside [1:10]");
        }

    }

}
