package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

public class Mark {

    private String subject;
    private int value;

    public Mark(String subject, int value) {
        this.subject = subject;
        this.value = value;
    }

    public String getSubject() {
        return subject;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "subject=" + subject + ", value=" + value;
    }

}
