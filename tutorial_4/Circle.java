
package tutorial_4;

import java.util.Scanner;

class Circle {
    // Instance variable
    double radius;

    // Constructor to initialize radius
    public Circle(double r) {
        radius = r;
    }

    // Method to compute and display area and circumference
    public void computeAndDisplay() {
        // Formula: area = πr²
        double area = Math.PI * radius * radius;
        
        // Formula: circumference = 2πr
        double circumference = 2 * Math.PI * radius;

        // Display results formatted to 2 decimal places
        System.out.printf("Area of the circle: %.2f\n", area);
        System.out.printf("Circumference of the circle: %.2f\n", circumference);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take radius input from user
        System.out.print("Enter the radius of the circle: ");
        double inputRadius = scanner.nextDouble();

        // Create Circle object and pass the radius to the constructor
        Circle myCircle = new Circle(inputRadius);

        // Display results
        System.out.println("\n--- Circle Results ---");
        myCircle.computeAndDisplay();

        scanner.close();
    }
}
