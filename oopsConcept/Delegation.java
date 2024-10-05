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
