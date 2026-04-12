// File: DeliverySystem.java

// Base class
class Delivery {
    void calculateDeliveryTime() {
        System.out.println("Calculating general delivery time...");
    }
}

// Subclass for Normal Delivery
class NormalDelivery extends Delivery {
    @Override
    void calculateDeliveryTime() {
        System.out.println("Normal Delivery: 5-7 days delivery time.");
    }
}

// Subclass for Express Delivery
class ExpressDelivery extends Delivery {
    @Override
    void calculateDeliveryTime() {
        System.out.println("Express Delivery: 2-3 days delivery time.");
    }
}

// Subclass for Same-Day Delivery
class SameDayDelivery extends Delivery {
    @Override
    void calculateDeliveryTime() {
        System.out.println("Same-Day Delivery: Order delivered today!");
    }
}

// Main class
public class DeliverySystem {
    public static void main(String[] args) {
        Delivery d1 = new NormalDelivery();
        Delivery d2 = new ExpressDelivery();
        Delivery d3 = new SameDayDelivery();

        System.out.println("=== Delivery Options ===\n");

        d1.calculateDeliveryTime();
        d2.calculateDeliveryTime();
        d3.calculateDeliveryTime();
    }
}
