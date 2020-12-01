package com.afs.tdd.actions;

import com.afs.tdd.Command;
import com.afs.tdd.MarsRover;

public class TurnRight implements Command {
    private MarsRover marsRover;

    public TurnRight(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute(){
        this.marsRover.turnRight();
    }
}
