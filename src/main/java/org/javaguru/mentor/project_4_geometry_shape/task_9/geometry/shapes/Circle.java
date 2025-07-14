package org.javaguru.mentor.project_4_geometry_shape.task_9.geometry.shapes;

class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * (radius * radius);
    }

}