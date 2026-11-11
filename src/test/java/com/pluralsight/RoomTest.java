package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RoomTest {

    @Test
    public void checkIn_shouldMakeRoomOccupiedAndDirty() {

        // arrange
        Room room = new Room(2, 150.00);

        // act
        room.checkIn();

        // assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());

    }
    @Test
    public void checkOut_shouldNotMakeRoomOccupied() {

        // arrange
        Room room = new Room(2, 150.00);
        room.checkIn();

        // act
        room.checkOut();

        // assert
        assertTrue(room.isDirty());
        assertFalse(room.isOccupied());
    }

    @Test
    public void cleanRoom_roomShouldNotBeOccupiedAndNotDirty() {

        // arrange
        Room room = new Room(2, 150.00);
        room.checkIn();
        room.checkOut();

        // act
        room.cleanRoom();

        // assert
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
    }
}



