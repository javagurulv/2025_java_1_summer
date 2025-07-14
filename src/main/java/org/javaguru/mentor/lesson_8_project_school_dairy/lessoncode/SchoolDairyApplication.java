package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

class SchoolDairyApplication {

    public static void main(String[] args) {
        SchoolDairy businessLogic = new SchoolDairy();
        SchoolDairyUI ui = new SchoolDairyUI(businessLogic);

        ui.start();
    }

}
