package org.javaguru.mentor.lesson_9_inheritance.lessoncode;

class ImmutableBook {

    private String author;

    public ImmutableBook(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

/*
    public void setAuthor(String author) {
        this.author = author;
    }
*/
}
