package org.javaguru.mentor.project_0_first_method_creation.task_7.code;

import java.util.Scanner;

class GradeCalculatorApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mark (0 - 100):");
        int mark = scanner.nextInt();

        if ((mark >= 90) && (mark <= 100)) {
            System.out.println("A");
        } else if ((mark >= 80) && (mark <= 89)) {
            System.out.println("B");
        } else if ((mark >= 70) && (mark <= 79)) {
            System.out.println("C");
        } else if ((mark >= 60) && (mark <= 69)) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

}
