package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Mark> marks = new ArrayList<>();

        System.out.println("List size = " + marks.size());

        Mark mark1 = new Mark("Math", 5);
        Mark mark2 = new Mark("Math", 6);
        Mark mark3 = new Mark("Eng", 7);

        marks.add(mark1);
        marks.add(mark2);
        marks.add(mark3);

        System.out.println("List size = " + marks.size());

        Mark mark = marks.get(0);
        System.out.println("Subject = " + mark.getSubject());
        System.out.println("Value = " + mark.getValue());

        System.out.println(mark);

        for (int i = 0; i < marks.size(); i++) {
            Mark m = marks.get(i);
            System.out.println(m);
        }

        for (Mark m : marks) {
            System.out.println(m);
            String subject = m.getSubject();
            int value = m.getValue();

        }

    }

}
