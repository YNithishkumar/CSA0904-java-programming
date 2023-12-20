import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BusTicketBookingSystem {
    static final int TOTAL_SEATS = 20;
    static int availableSeats = TOTAL_SEATS;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Display Total Seats");
            System.out.println("4. Reset Available Seats");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookTicket();
                    break;
                case 2:
                    checkAvailableSeats();
                    break;
                case 3:
                    displayTotalSeats();
                    break;
                case 4:
                    resetAvailableSeats();
                    break;
                case 5:
                    System.out.println("Exiting. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void bookTicket() {
        if (availableSeats > 0) {
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            System.out.println("Booking a ticket...");

            // Simulating a booking process
            System.out.println("Ticket booked! Seat number: " + (TOTAL_SEATS - availableSeats + 1));
            System.out.println("Date and Time: " + dateTime.format(formatter));

            availableSeats--;

            System.out.println("Available Seats: " + availableSeats);
        } else {
            System.out.println("Sorry, no more seats available.");
        }
    }

    private static void checkAvailableSeats() {
        System.out.println("Available Seats: " + availableSeats);
    }

    private static void displayTotalSeats() {
        System.out.println("Total Seats: " + TOTAL_SEATS);
    }

    private static void resetAvailableSeats() {
        availableSeats = TOTAL_SEATS;
        System.out.println("Available seats reset to: " + availableSeats);
    }
}