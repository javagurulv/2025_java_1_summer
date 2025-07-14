package org.javaguru.mentor.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter string:");
        String str = scanner.nextLine();

        System.out.println(number);
        System.out.println(str);


    }

}
