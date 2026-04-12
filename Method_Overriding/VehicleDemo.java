class Vehicle {
    void speed() {
        System.out.println("Vehicle speed is unknown");
    }
}

class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car speed is 120 km/h");
    }
}

class Bike extends Vehicle {
    @Override
    void speed() {
        System.out.println("Bike speed is 80 km/h");
    }
}

class Truck extends Vehicle {
    @Override
    void speed() {
        System.out.println("Truck speed is 60 km/h");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Truck();

        v1.speed();
        v2.speed();
        v3.speed();
    }
}
