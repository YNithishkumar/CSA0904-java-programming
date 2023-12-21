import java.util.Scanner;

public class FactorPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Given Number: ");
        int givenNumber = scanner.nextInt();

        // Get the value of N
        System.out.print("N: ");
        int n = scanner.nextInt();

        // Print the number of factors
        int numberOfFactors = countFactors(givenNumber);
        System.out.println("Number of factors = " + numberOfFactors);

        // Print the Nth factor
        int nthFactor = getNthFactor(givenNumber, n);
        System.out.println(n + "th factor of " + givenNumber + " = " + nthFactor);

        scanner.close();
    }

    // Function to count the number of factors of a given number
    private static int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    // Function to get the Nth factor of a given number
    private static int getNthFactor(int number, int n) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }
        return -1; // If Nth factor is not found
    }
}
