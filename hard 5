import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquareList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the lower and upper range from the user
        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();

        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();

        // Create a list to store perfect squares with sum of digits less than 10
        ArrayList<Integer> result = findPerfectSquares(lowerRange, upperRange);

        // Display the result
        System.out.println(result);

        scanner.close();
    }

    // Function to check if a number is a perfect square
    private static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    // Function to calculate the sum of digits of a number
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to find perfect squares with sum of digits less than 10 in a given range
    private static ArrayList<Integer> findPerfectSquares(int lower, int upper) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = lower; i <= upper; i++) {
            if (isPerfectSquare(i) && sumOfDigits(i) < 10) {
                result.add(i);
            }
        }

        return result;
    }
}
