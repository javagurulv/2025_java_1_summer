package org.javaguru.mentor.lesson_2_variables_and_data_types.lessoncode;


 import java.util.Scanner;

public class MegaUserCalculator {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first param: ");
        int parameter1 = scanner.nextInt();

        System.out.println("Enter second param: ");
        int parameter2 = scanner.nextInt();

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







