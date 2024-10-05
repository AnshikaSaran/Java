//Delegation is a technique where an object hands off a task to a helper object.
class Printer {
    public void print(String message) {
        System.out.println("Printing: " + message);
    }
}

class Document {
    private Printer printer = new Printer();

    public void printDocument(String content) {
        printer.print(content); // Delegating the printing task
    }
}

public class DelegationExample {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.printDocument("Hello, World!");
    }
}

//Problem: Create a User class that delegates the authentication process to an Authenticator class.

class Authenticator {
    public boolean authenticate(String username, String password) {
        // Simulate authentication logic
        return "user".equals(username) && "pass".equals(password);
    }
}

class User {
    private Authenticator authenticator;

    public User() {
        this.authenticator = new Authenticator();
    }

    public void login(String username, String password) {
        if (authenticator.authenticate(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
    }
}

// Example usage
public class DelegationExample {
    public static void main(String[] args) {
        User user = new User();
        user.login("user", "pass");
        user.login("user", "wrongpass");
    }
}

