package org.javaguru.mentor.lesson_7_array_for.lessoncode.tasks;

class PrintNumbers {

    public static void main(String[] args) {
        new PrintNumbers().printNumbers();
    }

    public void printNumbers() {

        /*for ( ; ; ) {

        }*/

        // int i = 1; i <= 10 = true
        System.out.println(1);

        // i = i + 1; i <= 10 = true
        System.out.println(2);

        // i = i + 1; i <= 10 = true
        System.out.println(3);

        // i = i + 1; i <= 10 = true
        System.out.println(4);

        // i = i + 1; i <= 10 = true
        System.out.println(5);

        // i = i + 1; i <= 10 = false
        // end

        // i++  =  i = i + 1

        // 1 -> 100

        // i++
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Sum =  " + sum);


/*
        for (int i = 0; i < 100; i = i + 2) {
            System.out.println(i);
        }
*/

        System.out.println("Finish");
    }

    public String collectNumbersToString(int numberFrom, int numberTo) {
        // i = i + 1
        // i++
        String str = "";

        for (int i = numberFrom; i <= numberTo; i++) {
            str = str + i;
            str = str + " ";
        }

        return str;
    }

}
