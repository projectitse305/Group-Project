package Rooms;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;

public class HotelTest {
    private Hotel hotel;

    @Before
    public void setUp() {
        // Create a hotel with 5 rooms for testing
        hotel = new Hotel(5);
    }

    @Test
    public void testFindAvailableRoom() {
        // Reserve a room and check if findAvailableRoom returns a vacant room
        Room reservedRoom = hotel.findAvailableRoom();
        hotel.reserveRoom(reservedRoom);

        Room availableRoom = hotel.findAvailableRoom();
        assertNotNull(availableRoom);
        assertFalse(availableRoom.isOccupied());
    }

    @Test
    public void testReserveRoom() {
        // Reserve a room and check if it is marked as occupied
        Room room = hotel.findAvailableRoom();
        assertNotNull(room);

        hotel.reserveRoom(room);
        assertTrue(room.isOccupied());
    }

    @Test
    public void testDisplayRoomStatusAfterReservation() {
        // Reserve a room and check if the displayRoomStatus reflects the correct status
        Room room = hotel.findAvailableRoom();
        assertNotNull(room);

        hotel.reserveRoom(room);

        String expectedOutput = "Room 1: Occupied\nRoom 2: Vacant\nRoom 3: Vacant\nRoom 4: Vacant\nRoom 5: Vacant";
        assertEquals(expectedOutput, getOutputFromDisplayRoomStatus());
    }

    @Test
    public void testDisplayRoomStatusBeforeReservation() {
        // Check if the initial displayRoomStatus reflects the correct status
        String expectedOutput = "Room 1: Vacant\nRoom 2: Vacant\nRoom 3: Vacant\nRoom 4: Vacant\nRoom 5: Vacant";
        assertEquals(expectedOutput, getOutputFromDisplayRoomStatus());
    }

    @Test
    public void testReserveAllRooms() {
        // Reserve all rooms and check if findAvailableRoom returns null
        for (int i = 0; i < 5; i++) {
            Room room = hotel.findAvailableRoom();
            assertNotNull(room);
            hotel.reserveRoom(room);
        }

        Room availableRoom = hotel.findAvailableRoom();
        assertNull(availableRoom);
    }

    private String getOutputFromDisplayRoomStatus() {
        // Create a custom PrintStream to capture the output
        PrintStream originalOut = System.out;
        try {
            // Redirect System.out to a custom PrintStream
            CustomPrintStream customPrintStream = new CustomPrintStream();
            System.setOut(customPrintStream);

            // Call the method that prints to System.out
            hotel.displayRoomStatus();

            // Return the captured output
            return customPrintStream.getOutput();
        } finally {
            // Restore the original PrintStream
            System.setOut(originalOut);
        }
    }

    private static class CustomPrintStream extends PrintStream {
        private StringBuilder output;

        public CustomPrintStream() {
            super(System.out);
            output = new StringBuilder();
        }

        @Override
        public void println(String x) {
            output.append(x).append("\n");
        }

        public String getOutput() {
            return output.toString().trim();
        }
    }
}
