package org.javaguru.mentor.lesson_9_inheritance.lessoncode;

class Ferri extends Car {

    private boolean isElectric;

    public Ferri(String color, boolean isElectric) {
        super(color);
        this.isElectric = isElectric;
    }

    public void changeElectric(boolean newElectric) {
        this.isElectric = newElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    @Override
    public String toString() {
        return "Ferri{" +
                "color=" + this.getColor() +
                ", isElectric=" + isElectric +
                '}';
    }
}
