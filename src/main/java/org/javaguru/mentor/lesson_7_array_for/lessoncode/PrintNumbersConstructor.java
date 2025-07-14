package org.javaguru.mentor.lesson_7_array_for.lessoncode;

class PrintNumbersConstructor {

    private int min;
    private int max;

    public PrintNumbersConstructor(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void print() {
        for (int i = min; i <= max ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
