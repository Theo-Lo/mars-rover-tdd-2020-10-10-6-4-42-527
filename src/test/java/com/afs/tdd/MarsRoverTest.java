package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_y_plus_1_when_executeCommands_given_0_0_N_and_M(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //when
        marsRover.executeCommands("N");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }
}
