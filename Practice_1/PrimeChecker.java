package Practice_1;
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();
        
        boolean isPrime = true;
        
        // Numbers less than or equal to 1 are not prime
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check for divisibility from 2 up to the square root of the number
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit loop early if divisor is found
                }
            }
        }
        
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        scanner.close();
    }
}

