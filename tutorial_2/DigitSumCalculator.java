package tutorial_2;
import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-digit number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int sum = 0;

        // Strip and add the last digit repeatedly until the value reaches 0
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("The sum of the digits of " + originalNum + " is: " + sum);

        scanner.close();
    }
}

