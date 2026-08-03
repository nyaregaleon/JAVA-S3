package tutorial_4;
import java.util.Scanner;
public class Employee {
   int empId;
   double salary; 
   String empName;
 Employee(int id, double sal, String name) 
 { empId=id;
    salary= sal;
    empName=name;
 }
public void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Employee 1
        System.out.println("Enter details for Employee 1:");
        System.out.print("Enter ID: ");
        int id1 = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character
        System.out.print("Enter Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double sal1 = scanner.nextDouble();

        // Create the first Employee object
        Employee emp1 = new Employee(id1, sal1, name1);

        // Input for Employee 2
        System.out.println("\nEnter details for Employee 2:");
        System.out.print("Enter ID: ");
        int id2 = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character
        System.out.print("Enter Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double sal2 = scanner.nextDouble();
Employee emp2 = new Employee(id2, sal2, name2);

        // Print the employee data
        System.out.println("\n--- Displaying Employee Details ---");
        emp1.displayEmployee();
        emp2.displayEmployee();

        scanner.close();
    }
}
}
