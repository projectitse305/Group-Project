import java.util.ArrayList;
import java.util.List;

// Represents a hotel with rooms
public class Hotel {
    private List<Room> rooms;

    // Constructor initializing the hotel with a specified number of rooms
    public Hotel(int numberOfRooms) {
        rooms = new ArrayList<>();
        for (int i = 1; i <= numberOfRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    // Displays the status (occupied or vacant) of all rooms in the hotel
    public void displayRoomStatus() {
        for (Room room : rooms) {
            System.out.println("Room " + room.getRoomNumber() + ": " + (room.isOccupied() ? "Occupied" : "Vacant"));
        }
    }

    // Finds the first available (vacant) room in the hotel
    public Room findAvailableRoom() {
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                return room;
            }
        }
        return null;
    }

    // Reserves a specified room by marking it as occupied
    public void reserveRoom(Room room) {
        room.setOccupied(true);
        System.out.println("Room " + room.getRoomNumber() + " has been reserved.");
    }
}
