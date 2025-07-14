package org.javaguru.mentor.project_0_first_method_creation.task_12.code;

class GradeCalculator {

    String calculateGrade(int mark) {
        if ((mark >= 90) && (mark <= 100)) {
            return "A";
        } else if ((mark >= 80) && (mark <= 89)) {
            return "B";
        } else if ((mark >= 70) && (mark <= 79)) {
            return "C";
        } else if ((mark >= 60) && (mark <= 69)) {
            return "D";
        } else {
            return "F";
        }
    }

}
