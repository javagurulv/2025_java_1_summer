package org.javaguru.mentor.lesson_9_inheritance.lessoncode.shapes;

class Square extends AbstractShape {

    private int a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

}
