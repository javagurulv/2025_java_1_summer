package org.javaguru.mentor.lesson_2_variables_and_data_types.lessoncode;

import java.util.Scanner;

public class UserInput1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter int = ");
        int number1 = scanner.nextInt();
        System.out.println("Nubber1 = " + number1);

        System.out.println("Enter double = ");
        double number2 = scanner.nextDouble();
        System.out.println("Nubber2 = " + number2);



    }



}
