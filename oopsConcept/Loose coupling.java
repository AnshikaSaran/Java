//Loose coupling reduces the dependency between classes. You can achieve this through interfaces.
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class ShoppingCart {
    private Payment payment;

    public ShoppingCart(Payment payment) {
        this.payment = payment;
    }

    public void checkout(double amount) {
        payment.pay(amount); // Using loose coupling
    }
}

public class LooseCouplingExample {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        ShoppingCart cart = new ShoppingCart(creditCard);
        cart.checkout(100.00);
    }
}


//Problem: Implement a simple messaging system where the sender and receiver are loosely coupled through an interface.
interface MessageSender {
    void send(String message);
}

class EmailSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService {
    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notify(String message) {
        sender.send(message);
    }
}

// Example usage
public class LooseCouplingExample {
    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailSender());
        emailService.notify("Hello via Email!");

        NotificationService smsService = new NotificationService(new SMSSender());
        smsService.notify("Hello via SMS!");
    }
}

