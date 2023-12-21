import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniquePermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the given number from the user
        System.out.print("Given Number: ");
        int givenNumber = scanner.nextInt();

        // Generate and print unique permutations
        System.out.println("Permutations are:");
        printUniquePermutations(givenNumber);

        scanner.close();
    }

    // Function to print unique permutations of a given number
    private static void printUniquePermutations(int number) {
        String numberStr = String.valueOf(number);
        int n = numberStr.length();
        char[] digits = numberStr.toCharArray();

        Set<String> uniquePermutations = new HashSet<>();

        // Generate permutations using backtracking
        generatePermutations(digits, 0, n - 1, uniquePermutations);

        // Print unique permutations
        for (String permutation : uniquePermutations) {
            System.out.println(permutation);
        }
    }

    // Function to generate permutations using backtracking
    private static void generatePermutations(char[] digits, int left, int right, Set<String> result) {
        if (left == right) {
            result.add(new String(digits));
        } else {
            for (int i = left; i <= right; i++) {
                swap(digits, left, i);
                generatePermutations(digits, left + 1, right, result);
                swap(digits, left, i); // Backtrack
            }
        }
    }

    // Function to swap two characters in an array
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
