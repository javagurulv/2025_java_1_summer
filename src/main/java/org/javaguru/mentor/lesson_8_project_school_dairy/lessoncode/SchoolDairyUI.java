package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

import java.util.Scanner;

class SchoolDairyUI {

    private SchoolDairy schoolDairy;

    SchoolDairyUI(SchoolDairy schoolDairy) {
        this.schoolDairy = schoolDairy;
    }

    void start() {
        while (true) {
            printMenu();

            int userChoice = getUserChoice();

            if (userChoice == 1) {
                addNewMark();
            }

            if (userChoice == 2) {
                findMaxMarkBySubject();
            }

            if (userChoice == 3) {
                exitProgram();
            }
        }
    }

    private void printMenu() {
        System.out.println();
        System.out.println("Program menu: ");
        System.out.println("1. Add new mark");
        System.out.println("2. Find max mark by subject");
        System.out.println("3. Exit");
    }

    private int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter your choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private void addNewMark() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();

        System.out.println("Enter mark: ");
        int mark = Integer.parseInt(scanner.nextLine());

        schoolDairy.addMark(subject, mark);

        System.out.println("Mark added!");
    }

    private void findMaxMarkBySubject() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();

        int maxGrade = schoolDairy.findMaxGrade(subject);

        System.out.println("Max grade for " + subject + " is " + maxGrade);
    }

    private void exitProgram() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

}
