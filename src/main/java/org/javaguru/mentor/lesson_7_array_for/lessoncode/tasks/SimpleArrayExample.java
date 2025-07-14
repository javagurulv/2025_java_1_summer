package org.javaguru.mentor.lesson_7_array_for.lessoncode.tasks;


public class SimpleArrayExample {

    public static void main(String[] args) {

        int number = 7;

        int[] numbers = new int[50];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[49]);


        numbers[0] = 777;
        numbers[1] = 999;
        numbers[2] = 999;
        numbers[3] = 999;
        numbers[4] = 10;

        numbers[4] = 888;

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("SUM = " + sum);


        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println("Array length = " + numbers.length);


        String[] strs = new String[3];

        System.out.println(strs[0]);
        System.out.println(strs[1]);
        System.out.println(strs[2]);

        strs[0] = new String("sffd");
        strs[1] = "sdvd";
        strs[2] = "svdd";
        System.out.println(strs[0]);
        System.out.println(strs[1]);
        System.out.println(strs[2]);


        Transaction[] transactions = new Transaction[2];

        Trader trader1 = new Trader("Pokemon", "Vena");
        Transaction transaction1 = new Transaction(trader1, 100);

        transactions[0] = transaction1;

        Trader trader2 = new Trader("Pokemon2", "Vena");
        transactions[1] = new Transaction(trader2, 100);


        Trader trader3 = new Trader("Pokemon2", "Vena");
        trader3 = new Trader("Pokemon3", "Vena");

    }

}
