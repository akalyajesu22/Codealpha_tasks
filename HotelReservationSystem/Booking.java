public class Booking {
    String customerName;
    int roomNumber;

    public Booking(String customerName, int roomNumber) {
        this.customerName = customerName;
        this.roomNumber = roomNumber;
    }

    public void displayBooking() {
        System.out.println("Customer: " + customerName +
                " | Room No: " + roomNumber);
    }
}