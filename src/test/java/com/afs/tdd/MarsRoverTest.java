package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_y_plus_1_when_executeCommands_given_0_0_N_and_M(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_x_minus_1_when_executeCommands_given_0_0_W_and_M(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_y_minus_1_when_executeCommands_given_0_0_S_and_M(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_x_plus_1_when_executeCommands_given_0_0_E_and_M(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_W_when_executeCommands_given_0_0_N_and_L(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //when
        marsRover.executeCommands("L");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_S_when_executeCommands_given_0_0_W_and_L(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        //when
        marsRover.executeCommands("L");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_E_when_executeCommands_given_0_0_S_and_L(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        //when
        marsRover.executeCommands("L");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_N_when_executeCommands_given_0_0_E_and_L(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        //when
        marsRover.executeCommands("L");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_E_when_executeCommands_given_0_0_N_and_R(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //when
        marsRover.executeCommands("R");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }
}
