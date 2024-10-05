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
