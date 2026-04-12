// File name: AnimalDemo.java
class AnimalSounds {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends AnimalSounds {
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends AnimalSounds {
    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }
}

class Cow extends AnimalSounds {
    @Override
    void makeSound() {
        System.out.println("Moo Moo");
    }
}

// Main class with main() method
public class AnimalDemo {
    public static void main(String[] args) {
        AnimalSounds a1 = new Dog();
        AnimalSounds a2 = new Cat();
        AnimalSounds a3 = new Cow();

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
