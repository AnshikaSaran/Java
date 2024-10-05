//Polymorphism allows methods to do different things based on the object that it is acting upon.
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class
public class PolymorphismExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw(); // Outputs: Drawing a Circle
        shape2.draw(); // Outputs: Drawing a Rectangle
    }
}


//Problem: Create a method that accepts a list of shapes and calculates the total area.

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

// Example usage
public class PolymorphismExample {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));

        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }

        System.out.println("Total Area: " + totalArea);
    }
}


