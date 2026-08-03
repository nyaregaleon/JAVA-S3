package Practice_1;
public class PrimeNumbers1To100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        
        // Outer loop to check every number from 1 to 100
        for (int num = 1; num <= 100; num++) {
            boolean isPrime = true;
            
            if (num <= 1) {
                isPrime = false;
            } else {
                // Inner loop checks for factors
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break; // Not a prime, skip checking further
                    }
                }
            }
            
            // If-else checks the flag status to decide whether to print
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}

