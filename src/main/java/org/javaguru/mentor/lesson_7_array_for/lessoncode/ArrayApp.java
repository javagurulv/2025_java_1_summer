package org.javaguru.mentor.lesson_7_array_for.lessoncode;

class ArrayApp {

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();

        int[] numbers2 = arrayExample.createArray(40);
        int[] numbers3 = arrayExample.createArray(77);

        arrayExample.printArray(numbers2);
        arrayExample.printArray(numbers3);

        arrayExample.fillArrayWithRandomNumbers(numbers2);
        arrayExample.fillArrayWithRandomNumbers(numbers3);

        arrayExample.printArray(numbers2);
        arrayExample.printArray(numbers3);


        int[] numbers1 = arrayExample.createArray(5);
        arrayExample.printArray(numbers1);
        arrayExample.fillArrayWithRandomNumbers(numbers1);
        arrayExample.printArray(numbers1);
    }

}
