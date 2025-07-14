package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolDairyV2Test {

    @Test
    public void test1() {
        SchoolDairyV2 schoolDairy = new SchoolDairyV2();

        schoolDairy.addMark("Math", 5);
        schoolDairy.addMark("Math", 7);

        int maxMark = schoolDairy.findMaxMarkBySubject("Math");

        assertEquals(maxMark, 7);
    }

    @Test
    public void test2() {
        SchoolDairyV2 schoolDairy = new SchoolDairyV2();

        int maxMark = schoolDairy.findMaxMarkBySubject("Math");

        assertEquals(maxMark, 0);
    }

}