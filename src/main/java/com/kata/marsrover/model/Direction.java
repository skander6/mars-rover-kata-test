package com.kata.marsrover.model;

public enum Direction {

    NORTH(0, 'N'),
    EAST(1, 'E'),
    SOUTH(2, 'S'),
    WEST(3, 'W');
    private int value;
    private char tag;

    private Direction(int value, char tag) {
        this.value = value;
        this.tag = tag;
    }

    public int getValue() {
        return value;
    }

    public char getTag() { return tag; }

    }

