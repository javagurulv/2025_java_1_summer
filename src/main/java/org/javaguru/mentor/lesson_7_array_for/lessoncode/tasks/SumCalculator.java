package org.javaguru.mentor.lesson_7_array_for.lessoncode.tasks;

class SumCalculator {

    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();

        int sum = calculator.sum();
        System.out.println("SUM = " + sum);

        sum = calculator.sum(1, 10000);
        System.out.println("SUM 10k = " + sum);

        sum = calculator.sum(1, 1000);
        System.out.println("SUM 1k = " + sum);
    }

    public int sum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int sum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        return sum;
    }

















    public int calculateSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int calculateSumStep2(int start, int end) {
        int sum = 0;

        // i++
        // i = i + 1

        for (int i = start; i <= end; i = i + 2) {
            sum = sum + i;
        }
        return sum;
    }


}
