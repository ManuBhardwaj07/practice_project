import java.util.*;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class Both {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();

        list.add(new Dog());
        list.add(new Cat()); // ✅ safe

        System.out.println("Both added safely!");
    }
}
