// File: PaymentSystem.java

// Base class
class Payment {
    void processPayment(double amount) {
        System.out.println("Processing payment of ₹" + amount);
    }
}

// Subclass for Credit Card Payment
class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount);
        System.out.println("Validating card details...");
        System.out.println("Payment successful via Credit Card!");
    }
}

// Subclass for UPI Payment
class UPIPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
        System.out.println("Verifying UPI ID...");
        System.out.println("Payment successful via UPI!");
    }
}

// Subclass for Cash Payment
class CashPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing cash payment of ₹" + amount);
        System.out.println("Please collect cash from customer.");
        System.out.println("Payment received in cash!");
    }
}

// Main class
public class PaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new CashPayment();

        System.out.println("=== Payment Options ===\n");

        p1.processPayment(1500.0);
        System.out.println();
        p2.processPayment(750.0);
        System.out.println();
        p3.processPayment(300.0);
    }
}
