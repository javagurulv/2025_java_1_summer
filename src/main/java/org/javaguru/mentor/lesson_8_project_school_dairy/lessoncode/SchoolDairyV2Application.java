package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

public class SchoolDairyV2Application {

    public static void main(String[] args) {
        SchoolDairyV2 businessLogic = new SchoolDairyV2();

        SchoolDairyV2UI ui = new SchoolDairyV2UI(businessLogic);

        ui.runUI();

    }

}
