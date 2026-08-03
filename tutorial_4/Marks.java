package tutorial_4;

import java.util.Scanner;

class Marks {
    // Variables to store student's name and marks
    private String name;
    private int marks1, marks2, marks3;

    // Constructor to initialize student details
    public Marks(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method to calculate total marks
    public int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    // Method to calculate average marks
    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.printf("Average Marks: %.2f\n", calculateAverage());
    }
}

 class MarksDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks for subject 1: ");
        int marks1 = scanner.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int marks2 = scanner.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int marks3 = scanner.nextInt();

        // Create Student object
        Marks student = new Marks(name, marks1, marks2, marks3);

        // Display student details with total and average marks
        System.out.println("\nStudent Details:");
        student.displayDetails();

        scanner.close();
    }
}

