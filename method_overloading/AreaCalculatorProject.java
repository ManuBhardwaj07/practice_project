// File: AreaCalculatorProject.java
public class AreaCalculatorProject {

    // Method 1: Calculate area of a square
    double area(double side) {
        return side * side;
    }

    // Method 2: Calculate area of a rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Method 3: Calculate area of a triangle
    double area(double base, double height, boolean isTriangle) {
        if (isTriangle)
            return 0.5 * base * height;
        else
            return base * height; // fallback
    }

    // Method 4: Calculate area of a circle
    double area(float radius, char shapeType) {
        if (shapeType == 'c' || shapeType == 'C')
            return 3.14159 * radius * radius;
        else
            return 0.0;
    }

    // Main method (testing)
    public static void main(String[] args) {
        AreaCalculatorProject calc = new AreaCalculatorProject();

        System.out.println("Area of Square: " + calc.area(5));
        System.out.println("Area of Rectangle: " + calc.area(10, 4));
        System.out.println("Area of Triangle: " + calc.area(10, 5, true));
        System.out.println("Area of Circle: " + calc.area(7.0f, 'c'));
    }
}
