package org.javaguru.mentor.lesson_2_variables_and_data_types.lessoncode;

public class MegaCalculator {

    public static void main(String[] args) {

        int parameter1 = 10;
        int parameter2 = 5;

        int sum = parameter1 + parameter2;
        int sub = parameter1 - parameter2;
        int mult = parameter1 * parameter2;
        int devid = parameter1 / parameter2;

        System.out.println("Sum = " + sum);
        System.out.println("Sub = " + sub);
        System.out.println("Multiply = " + mult);
        System.out.println("Divide = " + devid);
    }
}