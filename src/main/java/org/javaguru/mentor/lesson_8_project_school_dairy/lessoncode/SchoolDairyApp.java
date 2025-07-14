package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

import java.util.Scanner;

public class SchoolDairyApp {

    private static void printProgramMenu() {
        System.out.println();
        System.out.println("Program menu:");
        System.out.println("1. Add new mark");
        System.out.println("2. Find max mark by subject");
        System.out.println("3. Find min mark by subject");
        System.out.println("4. Exit");
    }

    private static int chooseMenuItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter menu item to execute:");
        return Integer.parseInt(scanner.nextLine());
    }

    private static void addNewMark(SchoolDairy schoolDairy) {
        // add mark
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subject:");
        String subject = scanner.nextLine();
        System.out.println("Enter mark:");
        int mark = Integer.parseInt(scanner.nextLine());

        schoolDairy.addMark(subject, mark);

        System.out.println("Add mark success!!");
    }

    private static void findMaxMark(SchoolDairy schoolDairy) {
        // find max mark by subject
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subject:");
        String subject = scanner.nextLine();

        int maxMark = schoolDairy.findMaxGrade(subject);

        System.out.println("Max mark = " + maxMark);
    }

    private static void findMinMark(SchoolDairy schoolDairy) {
        // find min mark by subject
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subject:");
        String subject = scanner.nextLine();

        int minMark = schoolDairy.findMinGrade(subject);

        System.out.println("Min mark = " + minMark);
    }

    public static void main(String[] args) {
        SchoolDairy schoolDairy = new SchoolDairy();

        while (true) {
            printProgramMenu();
            int menuItem = chooseMenuItem();

            if (menuItem == 1) {
                addNewMark(schoolDairy);
            }

            if (menuItem == 2) {
                findMaxMark(schoolDairy);
            }

            if (menuItem == 3) {
                findMinMark(schoolDairy);
            }

            if (menuItem == 4) {
                // exit
                //System.exit(0);
                break;
            }
        }

        System.out.println("Good by!");
    }

}
