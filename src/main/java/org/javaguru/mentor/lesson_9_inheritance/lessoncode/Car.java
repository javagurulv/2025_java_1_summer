package org.javaguru.mentor.lesson_9_inheritance.lessoncode;

class Car {

    private String color;

    public Car(String color) {
        this.color = color;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public String getColor() {
        return color;
    }

    public void wash() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }

}
