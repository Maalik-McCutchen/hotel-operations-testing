package com.pluralsight;

import org.junit.jupiter.api.Test;

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
}



