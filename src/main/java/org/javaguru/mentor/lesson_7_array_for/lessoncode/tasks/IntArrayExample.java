package org.javaguru.mentor.lesson_7_array_for.lessoncode.tasks;

class IntArrayExample {

    public static void main(String[] args) {

        int[] marks = new int[5];

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        marks[0] = 1;
        marks[1] = 10;
        marks[2] = 9;
        marks[3] = 7;
        marks[4] = 5;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

/*
        for ( ; ; ) {

        }
*/

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            System.out.print(" ");
        }


//100, 99, 98 .... 2, 1, 0

        for (int i = 0; i <= 1000; i = i + 50) {
            System.out.println(i);
        }

        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        marks[2] = marks[1] + marks[3];
        marks[2] = marks[1] + marks[4];

        //System.out.println(marks[5]);
        //System.out.println(marks[-1]);

        System.out.println("Length = " + marks.length);

        int[] schoolMarks = {1, 2, 5, 6};
        System.out.println("Arr = " + schoolMarks[0]);
        System.out.println("Arr = " + schoolMarks[1]);
        System.out.println("Arr = " + schoolMarks[2]);
        System.out.println("Arr = " + schoolMarks[3]);

    }

}
