package org.javaguru.mentor.lesson_7_array_for.lessoncode;

class Array2Example {

    public static void main(String[] args) {
        int arraySize = 5;

        int[] numbers = new int[arraySize];

        numbers[0] = 10;
        numbers[1] = 8;
        numbers[2] = 7;
        numbers[3] = 4;
        numbers[4] = 243243;

        numbers[0] = 665;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        int sum = numbers[0]
                + numbers[1]
                + numbers[2]
                + numbers[3]
                + numbers[4];
        System.out.println("Sum: " + sum);

        System.out.println("Array size: " + numbers.length);


        double[] prices = new double[10];
        prices[0] = 10.5;
        prices[1] = 10.5;

        boolean[] yesNo = new boolean[100000];
        yesNo[0] = true;
        yesNo[1] = false;



    }

}
