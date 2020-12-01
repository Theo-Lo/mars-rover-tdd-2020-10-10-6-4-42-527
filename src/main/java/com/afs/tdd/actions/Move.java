package com.afs.tdd.actions;

import com.afs.tdd.Command;
import com.afs.tdd.MarsRover;

public class Move implements Command {
    private MarsRover marsRover;

    public Move(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute(){
        this.marsRover.move();
    }
}
