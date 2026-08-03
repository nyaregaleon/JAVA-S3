package Practice_1;
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();
        
        long factorial = 1;
        int i = num;
        
        // Loop downwards to calculate product
        while (i > 0) {
            factorial *= i;
            i--;
        }
        
        System.out.println("Factorial of " + num + " is: " + factorial);
        scanner.close();
    }
}

