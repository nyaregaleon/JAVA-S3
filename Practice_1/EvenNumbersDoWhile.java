package Practice_1;
public class EvenNumbersDoWhile {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Even numbers between 1 and 20:");
        
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
        
        System.out.println();
    }
}

