package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class SchoolDairyV2 {

    private List<Mark> marks;

    public SchoolDairyV2() {
        this.marks = new ArrayList<>();
    }

    public void addMark(String subject, int value) {
        Mark mark = new Mark(subject, value);
        marks.add(mark);
    }

    public int findMaxMarkBySubject(String subject) {
        int maxMark = 0;

        for (Mark mark : marks) {
            if (mark.getSubject().equals(subject)) {
                if (mark.getValue() > maxMark) {
                    maxMark = mark.getValue();
                }
            }
        }

        return maxMark;
    }

}
