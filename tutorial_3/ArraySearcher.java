package tutorial_3;
import java.util.Scanner;

public class ArraySearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int searchKey = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == searchKey) {
                System.out.println("Element found at index position: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + searchKey + " not found in the array.");
        }
        
        scanner.close();
    }
}

