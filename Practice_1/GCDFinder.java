package Practice_1;
import java.util.Scanner;

public class GCDFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Save original values for the final output display
        int n1 = num1;
        int n2 = num2;
        
        // Euclidean algorithm using a while loop
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        
        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + num1);
        
        scanner.close();
    }
}

