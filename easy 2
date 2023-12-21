import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove vowels from the string
        String resultString = removeVowels(inputString);

        // Display the result
        System.out.println("String after removing vowels: " + resultString);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to remove vowels from a string
    private static String removeVowels(String str) {
        // Using regular expression to replace vowels with an empty string
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
