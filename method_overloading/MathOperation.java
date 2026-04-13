// File name: MathOperation.java
public class MathOperation {

    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double values
    double add(double a, double b) {
        return a + b;
    }

    // Method 4: Add an integer and a double
    double add(int a, double b) {
        return a + b;
    }

    // Main method to test overloading
    public static void main(String[] args) {
        MathOperation calc = new MathOperation();

        System.out.println("Addition of two integers: " + calc.add(10, 20));
        System.out.println("Addition of three integers: " + calc.add(10, 20, 30));
        System.out.println("Addition of two doubles: " + calc.add(5.5, 4.5));
        System.out.println("Addition of int and double: " + calc.add(10, 5.5));
    }
}
     