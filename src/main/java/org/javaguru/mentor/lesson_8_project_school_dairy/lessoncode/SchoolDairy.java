package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

import java.util.ArrayList;
import java.util.List;

class SchoolDairy {

    private List<Mark> marks;

    public SchoolDairy() {
        this.marks = new ArrayList<>();
    }

    public void addMark(String subject, int mark) {
        Mark newMark = new Mark(subject, mark);
        marks.add(newMark);
    }

    public int findMaxGrade(String subject) {
        int maxGrade = 0;
        for (int i = 0; i < marks.size(); i++) {
            Mark mark = marks.get(i);
            if (mark.getSubject().equals(subject)) {
                if (mark.getValue() > maxGrade) {
                    maxGrade = mark.getValue();
                }
            }
        }
        return maxGrade;
    }

    public int findMaxGradeV2(String subject) {
        List<Mark> subjectMarks = findMarksBySubject(subject);
        int maxGrade = 0;
        for (int i = 0; i < marks.size(); i++) {
            Mark mark = marks.get(i);
            if (mark.getValue() > maxGrade) {
                maxGrade = mark.getValue();
            }
        }
        return maxGrade;
    }


    public int findMinGrade(String subject) {
        int minGrade = 11;
        for (int i = 0; i < marks.size(); i++) {
            Mark mark = marks.get(i);
            if (mark.getSubject().equals(subject)) {
                if (mark.getValue() < minGrade) {
                    minGrade = mark.getValue();
                }
            }
        }
        if (minGrade == 11) {
            minGrade = 0;
        }
        return minGrade;
    }

    private List<Mark> findMarksBySubject(String subject) {
        List<Mark> subjectMarks = new ArrayList<>();
        for (int i = 0; i < marks.size(); i++) {
            Mark mark = marks.get(i);
            if (mark.getSubject().equals(subject)) {
                subjectMarks.add(mark);
            }
        }
        return subjectMarks;
    }

    private List<Mark> findMarksBySubjectForEach(String subject) {
        List<Mark> subjectMarks = new ArrayList<>();
        for (Mark mark : marks) {
            if (mark.getSubject().equals(subject)) {
                subjectMarks.add(mark);
            }
        }
        return subjectMarks;
    }

}
