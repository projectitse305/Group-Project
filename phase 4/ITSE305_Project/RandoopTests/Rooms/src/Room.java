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

