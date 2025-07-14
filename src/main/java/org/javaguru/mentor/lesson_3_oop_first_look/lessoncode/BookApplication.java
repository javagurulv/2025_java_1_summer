package org.javaguru.mentor.lesson_3_oop_first_look.lessoncode;

public class BookApplication {

    public static void main(String[] args) {
        Book book1 = new Book("Work", 12);
        Book book2 = new Book("Java", 234);
        Book book3 = new Book("Dog", 345);

        System.out.println("Book 1: " + book1.getTitle());
        System.out.println("Book 2: " + book2.getTitle());
        System.out.println("Book 3: " + book3.getTitle());

        System.out.println("Book 1 page count: " + book1.getPageCount());
        System.out.println("Book 2 page count: " + book2.getPageCount());
        System.out.println("Book 3 page count: " + book3.getPageCount());

    }

}
