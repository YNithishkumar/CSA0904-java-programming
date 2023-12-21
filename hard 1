import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of days from the user
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        // Calculate years, weeks, and remaining days
        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;
        int weeks = remainingDaysAfterYears / 7;
        int remainingDays = remainingDaysAfterYears % 7;

        // Display the result
        System.out.println("No. of years: " + years);
        System.out.println("No. of weeks: " + weeks);
        System.out.println("No. of days: " + remainingDays);

        scanner.close();
    }
}
