package Practice_1;
import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer to reverse: ");
        int num = scanner.nextInt();
        
        int reversed = 0;
        
        // The loop runs, extracting the last digit, until the number becomes 0
        for (int temp = num; temp != 0; temp /= 10) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
        }
        
        System.out.println("Reversed number: " + reversed);
        
        scanner.close();
    }
}

