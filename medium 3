import java.util.Arrays;
import java.util.Scanner;

public class MthMaxNthMinSumDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array of elements
        System.out.print("Enter the number of elements in the array: ");
        int length = scanner.nextInt();

        int[] array = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        // Input M and N
        System.out.print("Enter the value of M: ");
        int m = scanner.nextInt();
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        // Find Mth maximum and Nth minimum numbers
        int mthMax = findMthMax(array, m);
        int nthMin = findNthMin(array, n);

        // Calculate sum and difference
        int sum = mthMax + nthMin;
        int difference = mthMax - nthMin;

        // Display the results
        System.out.println("Mth Maximum: " + mthMax);
        System.out.println("Nth Minimum: " + nthMin);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        scanner.close();
    }

    // Function to find Mth maximum number in an array
    private static int findMthMax(int[] array, int m) {
        Arrays.sort(array);
        return array[array.length - m];
    }

    // Function to find Nth minimum number in an array
    private static int findNthMin(int[] array, int n) {
        Arrays.sort(array);
        return array[n - 1];
    }
}
