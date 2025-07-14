package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

import java.util.Scanner;

public class SchoolDairyV2UI {

    private SchoolDairyV2 schoolDairy;

    public SchoolDairyV2UI(SchoolDairyV2 schoolDairy) {
        this.schoolDairy = schoolDairy;
    }

    public void runUI() {
        while (true) {
            System.out.println("");

            // print menu
            System.out.println("Program menu");
            System.out.println("1. Add mark");
            System.out.println("2. Find max mark by subject");
            System.out.println("3. Exit");

            // get menu item from user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter menu item to execute:");
            int menuItem = Integer.parseInt(scanner.nextLine());

            // execute menu item (.....)
            if (menuItem == 1) {
                System.out.println("Enter mark subject:");
                String subject = scanner.nextLine();

                System.out.println("Enter mark value:");
                int markValue = Integer.parseInt(scanner.nextLine());

                schoolDairy.addMark(subject, markValue);

                System.out.println("Add mark finished!");
            }

            if (menuItem == 2) {
                System.out.println("Enter mark subject:");
                String subject = scanner.nextLine();

                int maxMarkValue = schoolDairy.findMaxMarkBySubject(subject);
                System.out.println("Max grade by " + subject + " = " + maxMarkValue);

                System.out.println("Find max mark by subject finished!");
            }

            if (menuItem == 3) {
                System.out.println("Good by!");
                System.exit(0);
            }

        }

    }

}
