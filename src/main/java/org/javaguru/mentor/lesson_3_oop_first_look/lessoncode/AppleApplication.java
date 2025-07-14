package org.javaguru.mentor.lesson_3_oop_first_look.lessoncode;

class AppleApplication {

    public static void main(String[] args) {
        Apple apple1 = new Apple("Антоновка", "green", 700);
        Apple apple2 = new Apple("Антоновка", "red", 500);
        Apple apple3 = new Apple("Антоновка", "yellow", 300);

        System.out.println("Apple 1 type " + apple1.getType());
        System.out.println("Apple 2 type " + apple2.getType());
        System.out.println("Apple 3 type " + apple3.getType());

        System.out.println("Apple 1 color " + apple1.getColor());
        System.out.println("Apple 2 color " + apple2.getColor());
        System.out.println("Apple 3 color " + apple3.getColor());

        System.out.println("Apple 1 weight " + apple1.getWeight());
        System.out.println("Apple 2 weight " + apple2.getWeight());
        System.out.println("Apple 3 weight " + apple3.getWeight());

    }

}
