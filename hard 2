import java.util.Scanner;

public class UserCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the total number of users and staff users from the user
        System.out.print("Total Users: ");
        int totalUsers = scanner.nextInt();

        System.out.print("Staff Users: ");
        int staffUsers = scanner.nextInt();

        // Calculate the number of non-teaching staff users (1 for every 3 staff users)
        int nonTeachingStaffUsers = staffUsers / 3;

        // Calculate the number of student users
        int studentUsers = totalUsers - staffUsers - nonTeachingStaffUsers;

        // Display the result
        System.out.println("Student Users: " + studentUsers);

        scanner.close();
    }
}
