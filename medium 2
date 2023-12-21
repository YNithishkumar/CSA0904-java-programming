import java.util.Scanner;

public class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the numbers from the user
        System.out.println("Enter the numbers (enter 0 to stop):");
        
        int num;
        int primeCount = 0;
        int compositeCount = 0;

        // Continue taking input until the user enters 0
        do {
            num = scanner.nextInt();

            if (num > 0) {
                // Check if the number is prime or composite
                if (isPrime(num)) {
                    primeCount++;
                } else {
                    compositeCount++;
                }
            }
        } while (num != 0);

        // Display the results
        System.out.println("Number of Prime Numbers: " + primeCount);
        System.out.println("Number of Composite Numbers: " + compositeCount);

        scanner.close();
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
