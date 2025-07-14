package org.javaguru.mentor.lesson_7_array_for.lessoncode;

class PrintNumbers {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[4] = 34654;
        numbers[7] = 4567;
        numbers[9] = 888;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        /*
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
*/

    }

    public void print() {
        int[] numbers = new int[10];

        // [0 .. (numbers.length - 1)]   +1
        // 0 .. 9

        // int i = 0  (0)

        // print(numbers[i])

        // i = i + 1  (1)
        // print(numbers[i])

        // i = i + 1  (2)
        // print(numbers[i])


        // 1 - int i = 1

        // i <= 10 = true
        // print 1
        // 1 + 1 = 2

        // i <= 10 = true
        // print 2
        // 2 + 1 = 3

        // 10 раз

        // i++ => i = i + 1

        // i++  -> i = i + 1

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


/*
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
*/

    }

    public void print(int min, int max) {
        for (int i = min; i <= max ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    // sum = 0
    // sum = sum + num1
    // sum = sum + num2
    // sum = sum + num3
    // sum = sum + num4
    // sum = !!!
    public int sum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int sum(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum = sum + i;
        }
        return sum;
    }


    public void printFromMaxToMin(int max, int min) {
        for (int i = max; i >= min ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
