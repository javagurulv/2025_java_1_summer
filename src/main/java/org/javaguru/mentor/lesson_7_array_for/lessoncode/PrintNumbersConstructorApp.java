package org.javaguru.mentor.lesson_7_array_for.lessoncode;

class PrintNumbersConstructorApp {

    public static void main(String[] args) {
        PrintNumbersConstructor printNumbers = new PrintNumbersConstructor(1, 20);
        printNumbers.print();

        printNumbers = new PrintNumbersConstructor(10, 25);
        printNumbers.print();

        printNumbers = new PrintNumbersConstructor(100, 250);
        printNumbers.print();
    }

}
