class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class Dag {
    public static void main(String[] args) {
        Dog[] y = new Dog[2];

        y[0] = new Dog(); // ✅ ok
        // y[1] = new Cat(); // ❌ compile-time error if uncommented

        System.out.println("Only dogs allowed!");
    }
}
