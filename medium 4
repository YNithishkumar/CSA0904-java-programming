import java.util.Scanner;

public class ATMBalanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Denomination values
        int[] denominations = {2000, 500, 200, 100};

        // Get the denomination priority from the user
        System.out.print("Enter the priority of the denomination (1 for 2000, 2 for 500, 3 for 200, 4 for 100): ");
        int priority = scanner.nextInt();

        // Validate the priority input
        if (priority < 1 || priority > 4) {
            System.out.println("Invalid priority input. Exiting...");
            return;
        }

        // Get the total number of notes for the selected denomination
        System.out.print("Enter the total number of notes for the selected denomination: ");
        int totalNotes = scanner.nextInt();

        // Calculate and display the total amount
        long totalAmount = calculateTotalAmount(denominations, priority, totalNotes);
        System.out.println("Total Amount Available: " + totalAmount);

        scanner.close();
    }

    // Function to calculate the total amount based on the denomination priority and total number of notes
    private static long calculateTotalAmount(int[] denominations, int priority, int totalNotes) {
        // Validate the priority input
        if (priority < 1 || priority > denominations.length) {
            System.out.println("Invalid priority input. Exiting...");
            System.exit(1);
        }

        // Calculate the total amount
        long totalAmount = (long) denominations[priority - 1] * totalNotes;
        return totalAmount;
    }
}
