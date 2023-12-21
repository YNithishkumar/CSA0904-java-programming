import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Reverse the number
        int reversedNumber = reverseNumber(number);

        // Display the reversed number
        System.out.println("Reverse Number: " + reversedNumber);

        scanner.close();
    }

    // Function to reverse a number using a loop
    private static int reverseNumber(int num) {
        int reversedNum = 0;

        // Loop to reverse the digits of the number
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }
}
