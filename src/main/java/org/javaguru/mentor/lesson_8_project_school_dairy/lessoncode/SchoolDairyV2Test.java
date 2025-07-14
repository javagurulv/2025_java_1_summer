package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

public class SchoolDairyV2Test {

    public static void main(String[] args) {
        SchoolDairyV2Test test = new SchoolDairyV2Test();
        test.test1();
        test.test2();
    }

    public void test1() {
        SchoolDairyV2 schoolDairy = new SchoolDairyV2();

        schoolDairy.addMark("Math", 5);
        schoolDairy.addMark("Math", 7);

        int maxMark = schoolDairy.findMaxMarkBySubject("Math");

        if (maxMark == 7) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    public void test2() {
        SchoolDairyV2 schoolDairy = new SchoolDairyV2();

        int maxMark = schoolDairy.findMaxMarkBySubject("Math");

        if (maxMark == 0) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

}
