package org.javaguru.mentor.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int mark = Integer.parseInt(scanner.nextLine());

        if ((mark >= 90) && (mark <= 100)) {
            System.out.println("A");
        } else if ((mark >= 80) && (mark <= 89)) {
            System.out.println("B");
        } else if ((mark >= 70) && (mark <= 79)) {
            System.out.println("C");
        } else if ((mark >= 60) && (mark <= 69)) {
            System.out.println("D");
        } else if ((mark >= 0) && (mark <= 59)) {
            System.out.println("F");
        } else {
            System.out.println("NO category!");
        }

    }

}
