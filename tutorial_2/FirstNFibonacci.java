package tutorial_2;

import java.util.Scanner;

public class FirstNFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms to print (n): ");
        int n = scanner.nextInt();

        int firstTerm = 0, secondTerm = 1;

        System.out.print("First " + n + " Fibonacci numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Compute next term and shift values forward
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();

        scanner.close();
    }
}

