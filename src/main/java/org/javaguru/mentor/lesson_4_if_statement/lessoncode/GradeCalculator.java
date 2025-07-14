package org.javaguru.mentor.lesson_4_if_statement.lessoncode;

class GradeCalculator {

    String calculateGrade(int mark) {
        String grade;

        if ((mark >= 90) && (mark <= 100)) {
            grade = "A";
        } else if ((mark >= 80) && (mark <= 89)) {
            grade = "B";
        } else if ((mark >= 70) && (mark <= 79)) {
            grade = "C";
        } else if ((mark >= 60) && (mark <= 69)) {
            grade = "D";
        } else {
            grade = "F";
        }

        return grade;
    }

}
