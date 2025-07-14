package org.javaguru.mentor.lesson_9_inheritance.lessoncode.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ShapeConsoleUI {

    public static void main(String[] args) {

        List<Circle> circles = new ArrayList<>();
        List<Square> squares = new ArrayList<>();
        List<Rectangle> rectangles = new ArrayList<>();

        List<AbstractShape> shapes = new ArrayList<>();

        while (true) {
            System.out.println("Program menu:");
            System.out.println("1. Create Circle");
            System.out.println("2. Create Square");
            System.out.println("3. Create Rectangle");
            System.out.println("4. Calculate all shapes square");
            System.out.println("5. Calculate all shapes perimeter");
            System.out.println("6. Exit");

            Scanner scanner = new Scanner(System.in);
            int userChoice = Integer.parseInt(scanner.nextLine());

            if (userChoice == 1) {
                System.out.println("Enter circle name:");
                String name = scanner.nextLine();
                System.out.println("Enter circle radius:");
                int radius = Integer.parseInt(scanner.nextLine());
                Circle circle = new Circle(name, radius);
                circles.add(circle);
                shapes.add(circle);
            }

            if (userChoice == 2) {
                System.out.println("Enter circle name:");
                String name = scanner.nextLine();
                System.out.println("Enter square a:");
                int a = Integer.parseInt(scanner.nextLine());
                Square square = new Square(name, a);
                squares.add(square);
                shapes.add(square);
            }

            if (userChoice == 3) {
                System.out.println("Enter circle name:");
                String name = scanner.nextLine();
                System.out.println("Enter rectangle a:");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter rectangle b:");
                int b = Integer.parseInt(scanner.nextLine());
                Rectangle rectangle = new Rectangle(name, a, b);

                System.out.println(rectangle);

                rectangles.add(rectangle);
                shapes.add(rectangle);
            }

            if (userChoice == 4) {
                System.out.println("All shapes area = " + calculateAllShapesArea(shapes));
            }

            if (userChoice == 5) {
                System.out.println("All shapes perimeter = " + calculateAllShapesPerimeter(shapes));
            }

            if (userChoice == 6) {
                System.out.println("Exit program!");
                break;
            }

        }

    }

    static double calculateAllShapesArea(List<Circle> circles,
                                           List<Square> squares,
                                           List<Rectangle> rectangles) {
        double area = 0;

        for (Circle circle : circles) {
            area += circle.calculateArea();
        }
        for (Square square : squares) {
            area += square.calculateArea();
        }
        for (Rectangle rectangle : rectangles) {
            area += rectangle.calculateArea();
        }
        return area;
    }

    static double calculateAllShapesArea(List<AbstractShape> shapes) {
        double area = 0;
        for (AbstractShape shape : shapes) {
            area += shape.calculateArea();
        }
        return area;
    }


    static double calculateAllShapesPerimeter(List<AbstractShape> shapes) {
        double perimeter = 0;
        for (AbstractShape shape : shapes) {
            perimeter += shape.calculatePerimeter();
        }
        return perimeter;
    }

    static void instanceOffExample(List<AbstractShape> shapes) {
        for (AbstractShape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Circle " + circle.getName());
            }
            if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println("Square " + square.getName());
            }
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Rectangle " +  rectangle.getName());
            }
        }
    }


}
