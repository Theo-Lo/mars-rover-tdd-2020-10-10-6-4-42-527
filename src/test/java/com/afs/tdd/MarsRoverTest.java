package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_0_1_N_when_executeCommands_given_0_0_N_and_M(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);

        //when
        marsRover.executeCommands(Action.MOVE.getActionLabel());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals(Direction.NORTH, marsRover.getDirection());
    }

    @Test
    public void should_return_minus_1_0_W_when_executeCommands_given_0_0_W_and_M(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);

        //when
        marsRover.executeCommands(Action.MOVE.getActionLabel());

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.WEST, marsRover.getDirection());
    }

    @Test
    public void should_return_0_minus_1_S_when_executeCommands_given_0_0_S_and_M(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);

        //when
        marsRover.executeCommands(Action.MOVE.getActionLabel());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals(Direction.SOUTH, marsRover.getDirection());
    }

    @Test
    public void should_return_1_0_E_when_executeCommands_given_0_0_E_and_M(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);

        //when
        marsRover.executeCommands(Action.MOVE.getActionLabel());

        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.EAST, marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_W_when_executeCommands_given_0_0_N_and_L(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);

        //when
        marsRover.executeCommands(Action.LEFT.getActionLabel());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.WEST, marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_S_when_executeCommands_given_0_0_W_and_L(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);

        //when
        marsRover.executeCommands(Action.LEFT.getActionLabel());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.SOUTH, marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_E_when_executeCommands_given_0_0_S_and_L(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);

        //when
        marsRover.executeCommands(Action.LEFT.getActionLabel());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.EAST, marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_N_when_executeCommands_given_0_0_E_and_L(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);

        //when
        marsRover.executeCommands(Action.LEFT.getActionLabel());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.NORTH, marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_E_when_executeCommands_given_0_0_N_and_R(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);

        //when
        marsRover.executeCommands(Action.RIGHT.getActionLabel());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.EAST, marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_N_when_executeCommands_given_0_0_W_and_R(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);

        //when
        marsRover.executeCommands(Action.RIGHT.getActionLabel());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.NORTH, marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_W_when_executeCommands_given_0_0_S_and_R(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);

        //when
        marsRover.executeCommands(Action.RIGHT.getActionLabel());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.WEST, marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_S_when_executeCommands_given_0_0_E_and_R(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);

        //when
        marsRover.executeCommands(Action.RIGHT.getActionLabel());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.SOUTH, marsRover.getDirection());
    }

    @Test
    public void should_return_minus_1_1_N_when_executeCommands_given_0_0_N_and_MLMR(){
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);

        //when
        String concatedCommand = Action.MOVE.getActionLabel()
                +Action.LEFT.getActionLabel()
                +Action.MOVE.getActionLabel()
                +Action.RIGHT.getActionLabel();
        marsRover.executeCommands(concatedCommand);

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals(Direction.NORTH, marsRover.getDirection());
    }
}
