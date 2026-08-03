package tutorial_2;
import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Convert character to lowercase to handle both cases efficiently
        char lowerCh = Character.toLowerCase(ch);

        // Check if the input character is a letter
        if (Character.isLetter(lowerCh)) {
            switch (lowerCh) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
                    break;
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabetic character.");
        }

        scanner.close();
    }
}

