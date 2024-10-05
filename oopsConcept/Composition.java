//Composition is a "has-a" relationship where the contained objects cannot exist independently of the container.
class Engine {
    public void start() {
        System.out.println("Engine starting...");
    }
}

class Car {
    private Engine engine; // Composition

    public Car() {
        this.engine = new Engine(); // Car owns the Engine
    }

    public void start() {
        engine.start();
        System.out.println("Car starting...");
    }
}

// Main class
public class CompositionExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
