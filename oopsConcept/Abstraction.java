//Abstraction allows you to define a template for classes with abstract methods.
abstract class Shape {
    abstract void draw();
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
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
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    double area() {
        return width * height;
    }
}

// Main class
public class AbstractionExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.draw();
        System.out.println("Area: " + circle.area());

        Shape rectangle = new Rectangle(4, 6);
        rectangle.draw();
        System.out.println("Area: " + rectangle.area());
    }
}



//Problem: Create an abstract class Shape and two derived classes Circle and Rectangle. Implement a method to calculate the area for each shape.
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
public class AbstractionExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
    }
}


