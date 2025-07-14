package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

public class SchoolDairyTest {

    public static void main(String[] args) {
        SchoolDairyTest test = new SchoolDairyTest();
        test.findMaxGrade_test1();
        test.findMaxGrade_test2();
        test.findMaxGrade_test3();
        test.findMaxGrade_test4();
        test.findMinGrade_test5();
        test.findMinGrade_test6();
        test.findMinGrade_test7();
        test.findMinGrade_test8();
    }

    public void findMaxGrade_test1() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 3);
        int mathMaxMark = schoolDairy.findMaxGrade("Math");
        if (mathMaxMark == 3) {
            System.out.println("findMaxGrade_test1 = OK");
        } else {
            System.out.println("findMaxGrade_test1 = FAIL");
        }
    }

    public void findMaxGrade_test2() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 3);
        schoolDairy.addMark("Math", 4);
        int mathMaxMark = schoolDairy.findMaxGrade("Math");
        if (mathMaxMark == 4) {
            System.out.println("findMaxGrade_test2 = OK");
        } else {
            System.out.println("findMaxGrade_test2 = FAIL");
        }
    }

    public void findMaxGrade_test3() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 3);
        schoolDairy.addMark("Eng", 10);
        schoolDairy.addMark("Math", 4);
        int mathMaxMark = schoolDairy.findMaxGrade("Math");
        if (mathMaxMark == 4) {
            System.out.println("findMaxGrade_test3 = OK");
        } else {
            System.out.println("findMaxGrade_test3 = FAIL");
        }
    }

    public void findMaxGrade_test4() {
        SchoolDairy schoolDairy = new SchoolDairy();
        int mathMaxMark = schoolDairy.findMaxGrade("Math");
        if (mathMaxMark == 0) {
            System.out.println("findMaxGrade_test4 = OK");
        } else {
            System.out.println("findMaxGrade_test4 = FAIL");
        }
    }

    public void findMinGrade_test5() {
        SchoolDairy schoolDairy = new SchoolDairy();
        int mathMaxMark = schoolDairy.findMinGrade("Math");
        if (mathMaxMark == 0) {
            System.out.println("findMinGrade_test5 = OK");
        } else {
            System.out.println("findMinGrade_test5 = FAIL");
        }
    }

    public void findMinGrade_test6() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 3);
        schoolDairy.addMark("Eng", 10);
        schoolDairy.addMark("Math", 4);
        int mathMaxMark = schoolDairy.findMinGrade("Math");
        if (mathMaxMark == 3) {
            System.out.println("findMinGrade_test6 = OK");
        } else {
            System.out.println("findMinGrade_test6 = FAIL");
        }
    }

    public void findMinGrade_test7() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 3);
        int mathMinMark = schoolDairy.findMinGrade("Math");
        if (mathMinMark == 3) {
            System.out.println("findMinGrade_test7 = OK");
        } else {
            System.out.println("findMinGrade_test7 = FAIL");
        }
    }

    public void findMinGrade_test8() {
        SchoolDairy schoolDairy = new SchoolDairy();
        schoolDairy.addMark("Math", 3);
        schoolDairy.addMark("Math", 4);
        int mathMinMark = schoolDairy.findMinGrade("Math");
        if (mathMinMark == 3) {
            System.out.println("findMinGrade_test8 = OK");
        } else {
            System.out.println("findMinGrade_test8 = FAIL");
        }
    }

}
