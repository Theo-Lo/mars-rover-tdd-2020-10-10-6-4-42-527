package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction){
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeCommands(String commands) {
        Arrays.asList(commands.split(""))
                .forEach(command -> this.executeCommand(command));
    }

    private void executeCommand(String command){
        if(command.equals("M")){
            move();
        }
    }

    private void move(){
        if(direction.equals("N")){
            this.locationY = this.locationY + 1;
        }
        if(direction.equals("W")){
            this.locationX = this.locationX - 1;
        }
        if(direction.equals("S")){
            this.locationY = this.locationY - 1;
        }
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getDirection() {
        return direction;
    }
}
