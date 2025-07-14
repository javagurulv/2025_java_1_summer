package org.javaguru.mentor.lesson_9_inheritance.lessoncode.shapes;

class Rectangle extends AbstractShape {

    private int a;
    private int b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("NAME 1", 1, 2);
        System.out.println(rectangle);
    }

}
