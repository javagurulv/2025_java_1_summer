package org.javaguru.mentor.lesson_9_inheritance.lessoncode;

class Bmw extends Car {

    private boolean isHibrid;

    public Bmw(String color, boolean isHibrid) {
        super(color);
        this.isHibrid = isHibrid;
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "color=" + this.getColor() +
                ", isHibrid=" + isHibrid +
                '}';
    }

}
