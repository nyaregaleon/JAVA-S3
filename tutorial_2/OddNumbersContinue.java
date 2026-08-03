package tutorial_2;
import java.util.Scanner;

public class OddNumbersContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Odd numbers from 1 to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            // If the number is even, skip the remaining loop execution
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}

