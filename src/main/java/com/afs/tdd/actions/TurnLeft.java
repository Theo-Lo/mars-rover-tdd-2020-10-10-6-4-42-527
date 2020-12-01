package com.afs.tdd.actions;

import com.afs.tdd.Command;
import com.afs.tdd.MarsRover;

public class TurnLeft implements Command {
    private MarsRover marsRover;

    public TurnLeft(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute(){
        this.marsRover.turnLeft();
    }
}
