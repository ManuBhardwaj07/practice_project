// Class name: AreaCalculator
import java.util.Scanner;

public class AreaCalculator {

    // Method 1: Area of Square
    double area(double side) {
        return side * side;
    }

    // Method 2: Area of Rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Method 3: Area of Triangle
    double area(double base, double height, boolean isTriangle) {
        if (isTriangle)
            return 0.5 * base * height;
        else
            return 0.0;
    }

    // Method 4: Area of Circle
    double area(float radius, char shapeType) {
        if (shapeType == 'c' || shapeType == 'C')
            return 3.14159 * radius * radius;
        else
            return 0.0;
    }

    // Main method — program starts here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        System.out.println("=== AREA CALCULATOR ===");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                result = calc.area(side);
                System.out.println("Area of Square: " + result);
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                result = calc.area(length, width);
                System.out.println("Area of Rectangle: " + result);
                break;

            case 3:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                result = calc.area(base, height, true);
                System.out.println("Area of Triangle: " + result);
                break;

            case 4:
                System.out.print("Enter radius: ");
                float radius = sc.nextFloat();
                result = calc.area(radius, 'c');
                System.out.println("Area of Circle: " + result);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
