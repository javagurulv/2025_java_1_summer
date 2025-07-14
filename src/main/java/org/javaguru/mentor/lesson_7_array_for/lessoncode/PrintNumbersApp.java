package org.javaguru.mentor.lesson_7_array_for.lessoncode;

class PrintNumbersApp {

    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        printNumbers.print();

        printNumbers.print(5, 10);
        printNumbers.print(15, 25);

        printNumbers.printFromMaxToMin(25, 5);


        System.out.println("Sum (1-10) = " + printNumbers.sum());
        System.out.println("Sum (11-999)= " + printNumbers.sum(11, 999));
    }

}
