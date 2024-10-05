//Encapsulation is the bundling of data and methods that operate on that data within a single unit (class), restricting access to some components.
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Account account = new Account("123456");
        account.deposit(500);
        System.out.println("Current Balance: " + account.getBalance());
    }
}
