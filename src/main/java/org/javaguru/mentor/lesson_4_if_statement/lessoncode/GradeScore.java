package org.javaguru.mentor.lesson_4_if_statement.lessoncode;

public class GradeScore {

    public static void main(String[] args) {
        int mark = 70;

        String score = "";

        if ((mark >= 90) && (mark <= 100)) {
            score = "A";
        } else if ((mark >= 80) && (mark <= 89)) {
            score = "B";
        } else  {
            score = "C";
        }
        System.out.println("Score = " + score);

    }

}
