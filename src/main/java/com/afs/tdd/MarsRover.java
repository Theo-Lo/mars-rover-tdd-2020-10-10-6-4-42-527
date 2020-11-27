package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    // add constant variable with class
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
        switch (command) {
            case "M":
                move();
                break;
            case "L":
                turnLeft();
                break;
            case "R":
                turnRight();
                break;
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
                break;
            case "W":
                this.direction = "S";
                break;
            case "S":
                this.direction = "E";
                break;
            case "E":
                this.direction = "N";
                break;
        }
    }

    private void turnRight(){
        switch (direction) {
            case "N":
                this.direction = "E";
                break;
            case "W":
                this.direction = "N";
                break;
            case "S":
                this.direction = "W";
                break;
            case "E":
                this.direction = "S";
                break;
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
