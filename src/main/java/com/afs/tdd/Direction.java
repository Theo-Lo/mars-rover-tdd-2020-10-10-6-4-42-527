package com.afs.tdd;

public enum Direction {
    NORTH("M"),
    WEST("L"),
    SOUTH("R"),
    EAST("E");

    private final String directionLabel;

    Direction(String directionLabel) {
        this.directionLabel = directionLabel;
    }
}











