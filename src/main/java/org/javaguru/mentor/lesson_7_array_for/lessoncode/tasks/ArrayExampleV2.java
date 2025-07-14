package org.javaguru.mentor.lesson_7_array_for.lessoncode.tasks;

import java.util.Random;

public class ArrayExampleV2 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 232;
        numbers[1] = 2;
        numbers[2] = 299;

        //numbers[3] = 34;

        int sum = numbers[0] + numbers[1] + numbers[2];
        System.out.println("Sum = " + sum);


        sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum = " + sum);

        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum = " + sum);


        int[] numbersV2 = new int[3];
        System.out.println(numbersV2[0]);
        System.out.println(numbersV2[1]);
        System.out.println(numbersV2[2]);


        String[] strs = new String[2];
        System.out.println(strs[0]);
        System.out.println(strs[1]);
        strs[0] = "afdsdxfhc";
        strs[1] = "afdsdxfh99787c";


        Book[] books = new Book[3];
        books[0] = new Book("X", 234);
        books[1] = new Book("Y", 99);
        books[2] = new Book("W", 777);


        Random random = new Random();

        Book[] books1000 = new Book[1000];

        for (int i = 0; i < books1000.length; i++) {
            int pageCount = random.nextInt(100);
            String bookTitle = generateRandomChars("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 10);

            Book book = new Book(bookTitle, pageCount);

            books1000[i] = book;
        }


        for (int i = 0; i < books1000.length; i++) {
            Book book = books1000[i];
            System.out.println("Book: title = " + book.getTitle() + " pageCount = " + book.getPageCount());
        }


    }


    public static String generateRandomChars(String candidateChars, int length) {
        StringBuilder sb = new StringBuilder ();
        Random random = new Random ();
        for (int i = 0; i < length; i ++) {
            sb.append (candidateChars.charAt (random.nextInt (candidateChars
                    .length ())));
        }

        return sb.toString ();
    }


}
