package org.javaguru.mentor.lesson_7_array_for.lessoncode;

import java.util.Random;

class ArrayExample {

    public int[] createArray(int length) {
        return new int[length];
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int random(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    // method create array 10 length, fill random numbers 0 - 10
    public int random() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public void fillArrayWithRandomNumbers(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random(1000);
        }
    }


    // grades
    // marks
    public int findMinMark(int[] marks) {
        if (marks.length == 0) {
            return -1;
        }

        int minMark = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < minMark) {
                minMark = marks[i];
            }
        }
        return minMark;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.createArray(10);
        arrayExample.fillArrayWithRandomNumbers(arr);
        arrayExample.printArray(arr);


/*
        int[] numbers = new int[10];

        numbers[0] = 121;
        numbers[0] = 888;

        int sum = numbers[0] + numbers[1];

        int length = numbers.length;

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println(numbers[10]);
*/
    }

}
