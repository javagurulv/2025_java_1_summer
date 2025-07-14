package org.javaguru.mentor.project_0_first_method_creation.task_13.code;

import java.util.Scanner;

class GradeCalculatorApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mark (0 - 100):");
        int mark = scanner.nextInt();

        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(mark);
        System.out.println(grade);
    }

}
