
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Represents a room in a hotel
public class Room {
    private int roomNumber;
    private boolean isOccupied;

    // Constructor initializing a room with a room number
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isOccupied = false;
    }

    // Retrieves the room number
    public int getRoomNumber() {
        return roomNumber;
    }

    // Checks if the room is occupied
    public boolean isOccupied() {
        return isOccupied;
    }

    // Sets the occupied status of the room
    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}

// Represents a hotel with rooms
class Hotel {
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
