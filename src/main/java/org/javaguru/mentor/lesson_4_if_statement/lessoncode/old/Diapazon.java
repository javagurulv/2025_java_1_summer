package org.javaguru.mentor.lesson_4_if_statement.lessoncode.old;

import java.util.Scanner;

class Diapazon {

    public static void main(String[] args) {
        // number >= 1
        // number <= 10
        // AND (и)  - &&

        // (number >= 1) && (number <= 10)
        // 0 (false) && (true) = false
        // 1 (true) && (true) = true
        // 11 (true) && (false) = false

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if ((number >= 1) && (number <= 10)) {
            System.out.println("NUMBER is between 1 and 10");
        } else {
            System.out.println("NUMBER is NOT between 1 and 10");
        }

    }

}
