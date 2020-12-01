package com.afs.tdd;

import com.afs.tdd.actions.Move;
import com.afs.tdd.actions.TurnLeft;
import com.afs.tdd.actions.TurnRight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CommandInvoker {
    List<Command> commands;

    public CommandInvoker(){
        this.commands = new ArrayList<>();
    }

    public void addCommands(String commandsString, MarsRover marsRover){
        Arrays.stream(commandsString.split(""))
                .filter(Objects::nonNull)
                .forEach(commandString -> {
                    if (commandString.equals(Action.MOVE.getActionLabel())){
                        this.commands.add(new Move(marsRover));
                    }
                    if (commandString.equals(Action.LEFT.getActionLabel())){
                        this.commands.add(new TurnLeft(marsRover));
                    }
                    if (commandString.equals(Action.RIGHT.getActionLabel())){
                        this.commands.add(new TurnRight(marsRover));
                    }
                });
    }

    public void executeCommands(){
        for(Command command:commands){
            command.execute();
        }
        this.commands = new ArrayList<>();
    }
}
