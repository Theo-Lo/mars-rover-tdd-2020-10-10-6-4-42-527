package com.afs.tdd;

public class MarsRover {
    private int locationX;
    private int locationY;
    private Direction direction;

    public MarsRover(int locationX, int locationY, Direction direction){
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void move(){
        switch (direction) {
            case NORTH:
                this.locationY = this.locationY + 1;
                break;
            case WEST:
                this.locationX = this.locationX - 1;
                break;
            case SOUTH:
                this.locationY = this.locationY - 1;
                break;
            case EAST:
                this.locationX = this.locationX + 1;
                break;
        }
    }

    public void turnLeft(){
        switch (direction) {
            case NORTH:
                this.direction = Direction.WEST;
                break;
            case WEST:
                this.direction = Direction.SOUTH;
                break;
            case SOUTH:
                this.direction = Direction.EAST;
                break;
            case EAST:
                this.direction = Direction.NORTH;
                break;
        }
    }

    public void turnRight(){
        switch (direction) {
            case NORTH:
                this.direction = Direction.EAST;
                break;
            case WEST:
                this.direction = Direction.NORTH;
                break;
            case SOUTH:
                this.direction = Direction.WEST;
                break;
            case EAST:
                this.direction = Direction.SOUTH;
                break;
        }
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public Direction getDirection() {
        return direction;
    }
}
