class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return 0; // Base class does nothing
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) { super(balance); }

    @Override
    double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) { super(balance); }

    @Override
    double calculateInterest() {
        return 0; // Current accounts usually don't earn interest
    }
}

class FixedDeposit extends BankAccount {
    FixedDeposit(double balance) { super(balance); }

    @Override
    double calculateInterest() {
        return balance * 0.07; // 7% interest
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount(10000);
        BankAccount ca = new CurrentAccount(10000);
        BankAccount fd = new FixedDeposit(10000);

        System.out.println("Savings Interest: " + sa.calculateInterest());
        System.out.println("Current Interest: " + ca.calculateInterest());
        System.out.println("FD Interest: " + fd.calculateInterest());
    }
}
