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
