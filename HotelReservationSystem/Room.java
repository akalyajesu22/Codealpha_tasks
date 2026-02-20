public class Room {
    int roomNumber;
    String category;
    boolean isBooked;

    public Room(int roomNumber, String category) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.isBooked = false;
    }

    public void displayRoom() {
        System.out.println("Room No: " + roomNumber +
                " | Category: " + category +
                " | Booked: " + (isBooked ? "Yes" : "No"));
    }
}