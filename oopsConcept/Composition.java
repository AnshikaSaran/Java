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


//Problem: Create a Car class that has an Engine object as a component. The Car should have methods to start and stop.

class Engine {
    public void start() {
        System.out.println("Engine starting...");
    }

    public void stop() {
        System.out.println("Engine stopping...");
    }
}

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine(); // Car has an Engine
    }

    public void start() {
        engine.start();
        System.out.println("Car starting...");
    }

    public void stop() {
        engine.stop();
        System.out.println("Car stopping...");
    }
}

// Example usage
public class CompositionExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}
