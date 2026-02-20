import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {

    static ArrayList<Room> rooms = new ArrayList<>();
    static ArrayList<Booking> bookings = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Adding some rooms
        rooms.add(new Room(101, "Standard"));
        rooms.add(new Room(102, "Standard"));
        rooms.add(new Room(201, "Deluxe"));
        rooms.add(new Room(301, "Suite"));

        int choice;

        do {
            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Bookings");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    viewRooms();
                    break;
                case 2:
                    bookRoom();
                    break;
                case 3:
                    cancelBooking();
                    break;
                case 4:
                    viewBookings();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    static void viewRooms() {
        for (Room r : rooms) {
            r.displayRoom();
        }
    }

    static void bookRoom() {
        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();
        sc.nextLine();

        for (Room r : rooms) {
            if (r.roomNumber == roomNo && !r.isBooked) {
                System.out.print("Enter Customer Name: ");
                String name = sc.nextLine();

                r.isBooked = true;
                bookings.add(new Booking(name, roomNo));

                System.out.println("Room booked successfully!");
                return;
            }
        }

        System.out.println("Room not available!");
    }

    static void cancelBooking() {
        System.out.print("Enter Room Number to Cancel: ");
        int roomNo = sc.nextInt();

        for (Room r : rooms) {
            if (r.roomNumber == roomNo && r.isBooked) {
                r.isBooked = false;

                bookings.removeIf(b -> b.roomNumber == roomNo);

                System.out.println("Booking cancelled!");
                return;
            }
        }

        System.out.println("Booking not found!");
    }

    static void viewBookings() {
        for (Booking b : bookings) {
            b.displayBooking();
        }
    }
}