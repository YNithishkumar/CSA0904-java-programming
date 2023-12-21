import java.util.Arrays;
import java.util.Scanner;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();

        // Convert the word to an array of characters
        char[] charArray = inputWord.toCharArray();

        // Sort the array in reverse alphabetical order
        Arrays.sort(charArray);
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
