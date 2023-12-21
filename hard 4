import java.util.Scanner;

public class NthPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the value of N
        System.out.print("N: ");
        int n = scanner.nextInt();

        // Find the nth prime number
        int nthPrime = findNthPrime(n);
        System.out.println(n + "th Prime number is " + nthPrime);

        // Print n prime numbers after the nth prime number
        System.out.print(n + " prime numbers after " + nthPrime + " are: ");
        printPrimesAfterNth(nthPrime, n);

        scanner.close();
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to find the nth prime number
    private static int findNthPrime(int n) {
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                count++;
            }
            if (count < n) {
                num++;
            }
        }

        return num;
    }

    // Function to print n prime numbers after a given number
    private static void printPrimesAfterNth(int start, int n) {
        int count = 0;
        int num = start + 1;

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + ", ");
                count++;
            }
            num++;
        }

        // Remove the trailing comma and space
        System.out.println("\b\b");
    }
}
