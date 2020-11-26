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
        if(command.equals("L")){
            turnLeft();
        }
        if(command.equals("R")){
            turnRight();
        }
    }

    private void move(){
        switch (direction) {
            case "N":
                this.locationY = this.locationY + 1;
                break;
            case "W":
                this.locationX = this.locationX - 1;
                break;
            case "S":
                this.locationY = this.locationY - 1;
                break;
            case "E":
                this.locationX = this.locationX + 1;
                break;
        }
    }

    private void turnLeft(){
        switch (direction) {
            case "N":
                this.direction = "W";
                return;
            case "W":
                this.direction = "S";
                return;
            case "S":
                this.direction = "E";
                return;
            case "E":
                this.direction = "N";
                return;
        }
    }

    private void turnRight(){
        switch (direction) {
            case "N":
                this.direction = "E";
                return;
            case "W":
                this.direction = "N";
                return;
            case "S":
                this.direction = "W";
                return;
            case "E":
                this.direction = "S";
                return;
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
