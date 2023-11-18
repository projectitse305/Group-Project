import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Room {
    private int roomNumber;
    private boolean isOccupied;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isOccupied = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}

class Hotel {
    private List<Room> rooms;

    public Hotel(int numberOfRooms) {
        rooms = new ArrayList<>();
        for (int i = 1; i <= numberOfRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public void displayRoomStatus() {
        for (Room room : rooms) {
            System.out.println("Room " + room.getRoomNumber() + ": " + (room.isOccupied() ? "Occupied" : "Vacant"));
        }
    }

    public Room findAvailableRoom() {
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                return room;
            }
        }
        return null;
    }

    public void reserveRoom(Room room) {
        room.setOccupied(true);
        System.out.println("Room " + room.getRoomNumber() + " has been reserved.");
    }
}

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rooms in the hotel: ");
        int numberOfRooms = scanner.nextInt();

        Hotel hotel = new Hotel(numberOfRooms);

        while (true) {
            System.out.println("\n1. Display Room Status");
            System.out.println("2. Search and Reserve Room");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hotel.displayRoomStatus();
                    break;
                case 2:
                    Room availableRoom = hotel.findAvailableRoom();
                    if (availableRoom != null) {
                        hotel.reserveRoom(availableRoom);
                    } else {
                        System.out.println("No vacant rooms available.");
                    }
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}