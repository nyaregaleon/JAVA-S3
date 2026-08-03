package Practice_1;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the maximum limit for Fibonacci series: ");
        int limit = scanner.nextInt();
        
        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci series up to " + limit + ": ");
        
        // Print terms as long as they don't exceed the limit
        while (firstTerm <= limit) {
            System.out.print(firstTerm + " ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
        
        scanner.close();
    }
}

