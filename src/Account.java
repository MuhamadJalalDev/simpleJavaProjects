public class Account {

    private double balance;

    void setBalance(double num) {
        balance = num;
    }

    double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Balance: " + getBalance());
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
